package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateGroup extends js.Object {
  var applicableShippingLabels: js.UndefOr[js.Array[String]] = js.native
  var carrierRates: js.UndefOr[js.Array[CarrierRate]] = js.native
  var mainTable: js.UndefOr[Table] = js.native
  var name: js.UndefOr[String] = js.native
  var singleValue: js.UndefOr[Value] = js.native
  var subtables: js.UndefOr[js.Array[Table]] = js.native
}

object RateGroup {
  @scala.inline
  def apply(): RateGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateGroup]
  }
  @scala.inline
  implicit class RateGroupOps[Self <: RateGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicableShippingLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicableShippingLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicableShippingLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicableShippingLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withCarrierRates(value: js.Array[CarrierRate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierRates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrierRates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierRates")(js.undefined)
        ret
    }
    @scala.inline
    def withMainTable(value: Table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainTable")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleValue(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtables(value: js.Array[Table]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtables")(js.undefined)
        ret
    }
  }
  
}

