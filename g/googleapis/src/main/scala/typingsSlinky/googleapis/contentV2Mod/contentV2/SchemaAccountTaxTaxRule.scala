package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tax calculation rule to apply in a state or province (USA only).
  */
@js.native
trait SchemaAccountTaxTaxRule extends js.Object {
  /**
    * Country code in which tax is applicable.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * State (or province) is which the tax is applicable, described by its
    * location ID (also called criteria ID).
    */
  var locationId: js.UndefOr[String] = js.native
  /**
    * Explicit tax rate in percent, represented as a floating point number
    * without the percentage character. Must not be negative.
    */
  var ratePercent: js.UndefOr[String] = js.native
  /**
    * If true, shipping charges are also taxed.
    */
  var shippingTaxed: js.UndefOr[Boolean] = js.native
  /**
    * Whether the tax rate is taken from a global tax table or specified
    * explicitly.
    */
  var useGlobalRate: js.UndefOr[Boolean] = js.native
}

object SchemaAccountTaxTaxRule {
  @scala.inline
  def apply(): SchemaAccountTaxTaxRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountTaxTaxRule]
  }
  @scala.inline
  implicit class SchemaAccountTaxTaxRuleOps[Self <: SchemaAccountTaxTaxRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationId")(js.undefined)
        ret
    }
    @scala.inline
    def withRatePercent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratePercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatePercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratePercent")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingTaxed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingTaxed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingTaxed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingTaxed")(js.undefined)
        ret
    }
    @scala.inline
    def withUseGlobalRate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGlobalRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseGlobalRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGlobalRate")(js.undefined)
        ret
    }
  }
  
}

