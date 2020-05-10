package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryDeletionSummary extends js.Object {
  /**
    * Remaining number of items to delete.
    */
  var RemainingCount: js.UndefOr[typingsSlinky.awsSdk.ssmMod.RemainingCount] = js.native
  /**
    * A list of counts and versions for deleted items.
    */
  var SummaryItems: js.UndefOr[InventoryDeletionSummaryItems] = js.native
  /**
    * The total number of items to delete. This count does not change during the delete operation.
    */
  var TotalCount: js.UndefOr[typingsSlinky.awsSdk.ssmMod.TotalCount] = js.native
}

object InventoryDeletionSummary {
  @scala.inline
  def apply(): InventoryDeletionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDeletionSummary]
  }
  @scala.inline
  implicit class InventoryDeletionSummaryOps[Self <: InventoryDeletionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemainingCount(value: RemainingCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemainingCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemainingCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemainingCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryItems(value: InventoryDeletionSummaryItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SummaryItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SummaryItems")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalCount(value: TotalCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCount")(js.undefined)
        ret
    }
  }
  
}

