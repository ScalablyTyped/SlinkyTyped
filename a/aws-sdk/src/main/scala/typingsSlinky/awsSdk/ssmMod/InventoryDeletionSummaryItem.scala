package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryDeletionSummaryItem extends js.Object {
  /**
    * A count of the number of deleted items.
    */
  var Count: js.UndefOr[ResourceCount] = js.native
  /**
    * The remaining number of items to delete.
    */
  var RemainingCount: js.UndefOr[typingsSlinky.awsSdk.ssmMod.RemainingCount] = js.native
  /**
    * The inventory type version.
    */
  var Version: js.UndefOr[InventoryItemSchemaVersion] = js.native
}

object InventoryDeletionSummaryItem {
  @scala.inline
  def apply(): InventoryDeletionSummaryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDeletionSummaryItem]
  }
  @scala.inline
  implicit class InventoryDeletionSummaryItemOps[Self <: InventoryDeletionSummaryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: ResourceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
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
    def withVersion(value: InventoryItemSchemaVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

