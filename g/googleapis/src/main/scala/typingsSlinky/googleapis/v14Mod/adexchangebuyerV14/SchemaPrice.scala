package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPrice extends js.Object {
  /**
    * The price value in micros.
    */
  var amountMicros: js.UndefOr[Double] = js.native
  /**
    * The currency code for the price.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * In case of CPD deals, the expected CPM in micros.
    */
  var expectedCpmMicros: js.UndefOr[Double] = js.native
  /**
    * The pricing type for the deal/product.
    */
  var pricingType: js.UndefOr[String] = js.native
}

object SchemaPrice {
  @scala.inline
  def apply(): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrice]
  }
  @scala.inline
  implicit class SchemaPriceOps[Self <: SchemaPrice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmountMicros(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountMicros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmountMicros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountMicros")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedCpmMicros(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedCpmMicros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedCpmMicros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedCpmMicros")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingType")(js.undefined)
        ret
    }
  }
  
}

