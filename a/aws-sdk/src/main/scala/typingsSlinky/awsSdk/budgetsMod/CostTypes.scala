package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CostTypes extends js.Object {
  /**
    * Specifies whether a budget includes credits. The default value is true.
    */
  var IncludeCredit: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes discounts. The default value is true.
    */
  var IncludeDiscount: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes non-RI subscription costs. The default value is true.
    */
  var IncludeOtherSubscription: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes recurring fees such as monthly RI fees. The default value is true.
    */
  var IncludeRecurring: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes refunds. The default value is true.
    */
  var IncludeRefund: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes subscriptions. The default value is true.
    */
  var IncludeSubscription: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes support subscription fees. The default value is true.
    */
  var IncludeSupport: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes taxes. The default value is true.
    */
  var IncludeTax: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget includes upfront RI costs. The default value is true.
    */
  var IncludeUpfront: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget uses the amortized rate. The default value is false.
    */
  var UseAmortized: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies whether a budget uses a blended rate. The default value is false.
    */
  var UseBlended: js.UndefOr[NullableBoolean] = js.native
}

object CostTypes {
  @scala.inline
  def apply(): CostTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostTypes]
  }
  @scala.inline
  implicit class CostTypesOps[Self <: CostTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeCredit(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeCredit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeCredit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeCredit")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDiscount(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeDiscount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDiscount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeDiscount")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeOtherSubscription(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeOtherSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeOtherSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeOtherSubscription")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeRecurring(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeRecurring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeRecurring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeRecurring")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeRefund(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeRefund")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeRefund: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeRefund")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSubscription(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeSubscription")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSupport(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeTax(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeTax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeTax")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUpfront(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeUpfront")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUpfront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeUpfront")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAmortized(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseAmortized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAmortized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseAmortized")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBlended(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseBlended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBlended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseBlended")(js.undefined)
        ret
    }
  }
  
}

