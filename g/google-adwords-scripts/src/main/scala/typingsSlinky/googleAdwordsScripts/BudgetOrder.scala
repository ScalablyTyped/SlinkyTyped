package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetOrder extends js.Object {
  def getBillingAccount(): BillingAccount = js.native
  def getEndDatetime(): AdWordsDate = js.native
  def getId(): Double = js.native
  def getName(): String = js.native
  def getPoNumber(): Double = js.native
  def getSpendingLimit(): Double = js.native
  def getStartDateTime(): AdWordsDate = js.native
  def getTotalAdjustments(): Double = js.native
}

object BudgetOrder {
  @scala.inline
  def apply(
    getBillingAccount: () => BillingAccount,
    getEndDatetime: () => AdWordsDate,
    getId: () => Double,
    getName: () => String,
    getPoNumber: () => Double,
    getSpendingLimit: () => Double,
    getStartDateTime: () => AdWordsDate,
    getTotalAdjustments: () => Double
  ): BudgetOrder = {
    val __obj = js.Dynamic.literal(getBillingAccount = js.Any.fromFunction0(getBillingAccount), getEndDatetime = js.Any.fromFunction0(getEndDatetime), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getPoNumber = js.Any.fromFunction0(getPoNumber), getSpendingLimit = js.Any.fromFunction0(getSpendingLimit), getStartDateTime = js.Any.fromFunction0(getStartDateTime), getTotalAdjustments = js.Any.fromFunction0(getTotalAdjustments))
    __obj.asInstanceOf[BudgetOrder]
  }
  @scala.inline
  implicit class BudgetOrderOps[Self <: BudgetOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBillingAccount(value: () => BillingAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBillingAccount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEndDatetime(value: () => AdWordsDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndDatetime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPoNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPoNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSpendingLimit(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSpendingLimit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStartDateTime(value: () => AdWordsDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartDateTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTotalAdjustments(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalAdjustments")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

