package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetDetail extends js.Object {
  /**
    * Name of the associated budget.
    */
  var BudgetName: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.BudgetName] = js.native
}

object BudgetDetail {
  @scala.inline
  def apply(): BudgetDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetDetail]
  }
  @scala.inline
  implicit class BudgetDetailOps[Self <: BudgetDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBudgetName(value: BudgetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudgetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetName")(js.undefined)
        ret
    }
  }
  
}

