package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Frequency cap.
  */
@js.native
trait SchemaFrequencyCap extends js.Object {
  /**
    * The maximum number of impressions that can be served to a user within the
    * specified time period.
    */
  var maxImpressions: js.UndefOr[Double] = js.native
  /**
    * The amount of time, in the units specified by time_unit_type. Defines the
    * amount of time over which impressions per user are counted and capped.
    */
  var numTimeUnits: js.UndefOr[Double] = js.native
  /**
    * The time unit. Along with num_time_units defines the amount of time over
    * which impressions per user are counted and capped.
    */
  var timeUnitType: js.UndefOr[String] = js.native
}

object SchemaFrequencyCap {
  @scala.inline
  def apply(): SchemaFrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFrequencyCap]
  }
  @scala.inline
  implicit class SchemaFrequencyCapOps[Self <: SchemaFrequencyCap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxImpressions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxImpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxImpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxImpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withNumTimeUnits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTimeUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumTimeUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTimeUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeUnitType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnitType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeUnitType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnitType")(js.undefined)
        ret
    }
  }
  
}

