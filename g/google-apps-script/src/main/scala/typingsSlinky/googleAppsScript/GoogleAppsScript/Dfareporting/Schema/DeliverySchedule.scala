package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliverySchedule extends js.Object {
  var frequencyCap: js.UndefOr[FrequencyCap] = js.native
  var hardCutoff: js.UndefOr[Boolean] = js.native
  var impressionRatio: js.UndefOr[String] = js.native
  var priority: js.UndefOr[String] = js.native
}

object DeliverySchedule {
  @scala.inline
  def apply(): DeliverySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliverySchedule]
  }
  @scala.inline
  implicit class DeliveryScheduleOps[Self <: DeliverySchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrequencyCap(value: FrequencyCap): Self = {
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

