package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Delivery Schedule.
  */
@js.native
trait SchemaDeliverySchedule extends js.Object {
  /**
    * Limit on the number of times an individual user can be served the ad
    * within a specified period of time.
    */
  var frequencyCap: js.UndefOr[SchemaFrequencyCap] = js.native
  /**
    * Whether or not hard cutoff is enabled. If true, the ad will not serve
    * after the end date and time. Otherwise the ad will continue to be served
    * until it has reached its delivery goals.
    */
  var hardCutoff: js.UndefOr[Boolean] = js.native
  /**
    * Impression ratio for this ad. This ratio determines how often each ad is
    * served relative to the others. For example, if ad A has an impression
    * ratio of 1 and ad B has an impression ratio of 3, then Campaign Manager
    * will serve ad B three times as often as ad A. Acceptable values are 1 to
    * 10, inclusive.
    */
  var impressionRatio: js.UndefOr[String] = js.native
  /**
    * Serving priority of an ad, with respect to other ads. The lower the
    * priority number, the greater the priority with which it is served.
    */
  var priority: js.UndefOr[String] = js.native
}

object SchemaDeliverySchedule {
  @scala.inline
  def apply(): SchemaDeliverySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliverySchedule]
  }
  @scala.inline
  implicit class SchemaDeliveryScheduleOps[Self <: SchemaDeliverySchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrequencyCap(value: SchemaFrequencyCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequencyCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyCap")(js.undefined)
        ret
    }
    @scala.inline
    def withHardCutoff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardCutoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardCutoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardCutoff")(js.undefined)
        ret
    }
    @scala.inline
    def withImpressionRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressionRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
  }
  
}

