package typingsSlinky.pulumiAws.budgetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.budgets.BudgetCostTypes
import typingsSlinky.pulumiAws.inputMod.budgets.BudgetNotification
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetState extends js.Object {
  /**
    * The ID of the target account for budget. Will use current user's accountId by default if omitted.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * Whether this budget tracks monetary cost or usage.
    */
  val budgetType: js.UndefOr[Input[String]] = js.native
  /**
    * Map of CostFilters key/value pairs to apply to the budget.
    */
  val costFilters: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions..
    */
  val costTypes: js.UndefOr[Input[BudgetCostTypes]] = js.native
  /**
    * The amount of cost or usage being measured for a budget.
    */
  val limitAmount: js.UndefOr[Input[String]] = js.native
  /**
    * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
    */
  val limitUnit: js.UndefOr[Input[String]] = js.native
  /**
    * The name of a budget. Unique within accounts.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The prefix of the name of a budget. Unique within accounts.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Object containing Budget Notifications. Can be used multiple times to define more than one budget notification
    */
  val notifications: js.UndefOr[Input[js.Array[Input[BudgetNotification]]]] = js.native
  /**
    * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodEnd: js.UndefOr[Input[String]] = js.native
  /**
    * The start of the time period covered by the budget. The start date must come before the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodStart: js.UndefOr[Input[String]] = js.native
  /**
    * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`.
    */
  val timeUnit: js.UndefOr[Input[String]] = js.native
}

object BudgetState {
  @scala.inline
  def apply(): BudgetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetState]
  }
  @scala.inline
  implicit class BudgetStateOps[Self <: BudgetState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withBudgetType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("budgetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudgetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("budgetType")(js.undefined)
        ret
    }
    @scala.inline
    def withCostFilters(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCostFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withCostTypes(value: Input[BudgetCostTypes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCostTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitAmount(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitUnit(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
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
    def withNamePrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifications(value: Input[js.Array[Input[BudgetNotification]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePeriodEnd(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePeriodEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePeriodEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePeriodEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePeriodStart(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePeriodStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePeriodStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePeriodStart")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeUnit(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnit")(js.undefined)
        ret
    }
  }
  
}

