package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRateGroup extends js.Object {
  /**
    * A list of shipping labels defining the products to which this rate group
    * applies to. This is a disjunction: only one of the labels has to match
    * for the rate group to apply. May only be empty for the last rate group of
    * a service. Required.
    */
  var applicableShippingLabels: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of carrier rates that can be referred to by mainTable or
    * singleValue.
    */
  var carrierRates: js.UndefOr[js.Array[SchemaCarrierRate]] = js.native
  /**
    * A table defining the rate group, when singleValue is not expressive
    * enough. Can only be set if singleValue is not set.
    */
  var mainTable: js.UndefOr[SchemaTable] = js.native
  /**
    * Name of the rate group. Optional. If set has to be unique within shipping
    * service.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the rate group (e.g. flat rate $10). Can only be set if
    * mainTable and subtables are not set.
    */
  var singleValue: js.UndefOr[SchemaValue] = js.native
  /**
    * A list of subtables referred to by mainTable. Can only be set if
    * mainTable is set.
    */
  var subtables: js.UndefOr[js.Array[SchemaTable]] = js.native
}

object SchemaRateGroup {
  @scala.inline
  def apply(): SchemaRateGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRateGroup]
  }
  @scala.inline
  implicit class SchemaRateGroupOps[Self <: SchemaRateGroup] (val x: Self) extends AnyVal {
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
    def withCarrierRates(value: js.Array[SchemaCarrierRate]): Self = {
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
    def withMainTable(value: SchemaTable): Self = {
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
    def withSingleValue(value: SchemaValue): Self = {
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
    def withSubtables(value: js.Array[SchemaTable]): Self = {
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

