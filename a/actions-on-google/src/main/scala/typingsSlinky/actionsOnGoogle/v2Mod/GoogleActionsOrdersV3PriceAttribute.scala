package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3PriceAttribute extends js.Object {
  /**
    * Monetary amount.
    */
  var amount: js.UndefOr[GoogleActionsOrdersV3Money] = js.native
  /**
    * The percentage spec, to 1/1000th of a percent.
    * Eg: 8.750% is represented as 8750, negative percentages represent
    * percentage discounts.
    * Deprecating this field. Can consider adding back when a solid usecase is
    * required.
    */
  var amountMillipercentage: js.UndefOr[Double] = js.native
  /**
    * Required: User displayed string of the price attribute. This is sent and
    * localized by merchant.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required: State of the price: Estimate vs Actual.
    */
  var state: js.UndefOr[GoogleActionsOrdersV3PriceAttributeState] = js.native
  /**
    * Whether the price is tax included.
    */
  var taxIncluded: js.UndefOr[Boolean] = js.native
  /**
    * Required: Type of money attribute.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3PriceAttributeType] = js.native
}

object GoogleActionsOrdersV3PriceAttribute {
  @scala.inline
  def apply(): GoogleActionsOrdersV3PriceAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3PriceAttribute]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3PriceAttributeOps[Self <: GoogleActionsOrdersV3PriceAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: GoogleActionsOrdersV3Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withAmountMillipercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountMillipercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmountMillipercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountMillipercentage")(js.undefined)
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
    def withState(value: GoogleActionsOrdersV3PriceAttributeState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxIncluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxIncluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxIncluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxIncluded")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleActionsOrdersV3PriceAttributeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

