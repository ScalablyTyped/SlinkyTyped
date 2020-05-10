package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeliveryControlFrequencyCap extends js.Object {
  var maxImpressions: js.UndefOr[Double] = js.native
  var numTimeUnits: js.UndefOr[Double] = js.native
  var timeUnitType: js.UndefOr[String] = js.native
}

object SchemaDeliveryControlFrequencyCap {
  @scala.inline
  def apply(): SchemaDeliveryControlFrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryControlFrequencyCap]
  }
  @scala.inline
  implicit class SchemaDeliveryControlFrequencyCapOps[Self <: SchemaDeliveryControlFrequencyCap] (val x: Self) extends AnyVal {
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

