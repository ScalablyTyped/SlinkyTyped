package typingsSlinky.pulumiAws.outputMod.budgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetCostTypes extends js.Object {
  /**
    * A boolean value whether to include credits in the cost budget. Defaults to `true`
    */
  var includeCredit: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether a budget includes discounts. Defaults to `true`
    */
  var includeDiscount: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include other subscription costs in the cost budget. Defaults to `true`
    */
  var includeOtherSubscription: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include recurring costs in the cost budget. Defaults to `true`
    */
  var includeRecurring: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include refunds in the cost budget. Defaults to `true`
    */
  var includeRefund: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include subscriptions in the cost budget. Defaults to `true`
    */
  var includeSubscription: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include support costs in the cost budget. Defaults to `true`
    */
  var includeSupport: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include tax in the cost budget. Defaults to `true`
    */
  var includeTax: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to include upfront costs in the cost budget. Defaults to `true`
    */
  var includeUpfront: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether a budget uses the amortized rate. Defaults to `false`
    */
  var useAmortized: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value whether to use blended costs in the cost budget. Defaults to `false`
    */
  var useBlended: js.UndefOr[Boolean] = js.native
}

object BudgetCostTypes {
  @scala.inline
  def apply(): BudgetCostTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetCostTypes]
  }
  @scala.inline
  implicit class BudgetCostTypesOps[Self <: BudgetCostTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeCredit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCredit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeCredit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCredit")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDiscount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDiscount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDiscount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDiscount")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeOtherSubscription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOtherSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeOtherSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOtherSubscription")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeRecurring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRecurring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeRecurring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRecurring")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeRefund(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRefund")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeRefund: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRefund")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSubscription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSubscription")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeTax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTax")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUpfront(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUpfront")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUpfront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUpfront")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAmortized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAmortized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAmortized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAmortized")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBlended(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBlended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBlended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBlended")(js.undefined)
        ret
    }
  }
  
}

