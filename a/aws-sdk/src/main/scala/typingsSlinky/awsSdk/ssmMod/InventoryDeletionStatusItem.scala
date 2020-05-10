package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryDeletionStatusItem extends js.Object {
  /**
    * The deletion ID returned by the DeleteInventory action.
    */
  var DeletionId: js.UndefOr[InventoryDeletionId] = js.native
  /**
    * The UTC timestamp when the delete operation started.
    */
  var DeletionStartTime: js.UndefOr[js.Date] = js.native
  /**
    * Information about the delete operation. For more information about this summary, see Understanding the Delete Inventory Summary in the AWS Systems Manager User Guide.
    */
  var DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.native
  /**
    * The status of the operation. Possible values are InProgress and Complete.
    */
  var LastStatus: js.UndefOr[InventoryDeletionStatus] = js.native
  /**
    * Information about the status.
    */
  var LastStatusMessage: js.UndefOr[InventoryDeletionLastStatusMessage] = js.native
  /**
    * The UTC timestamp of when the last status report.
    */
  var LastStatusUpdateTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the inventory data type.
    */
  var TypeName: js.UndefOr[InventoryItemTypeName] = js.native
}

object InventoryDeletionStatusItem {
  @scala.inline
  def apply(): InventoryDeletionStatusItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDeletionStatusItem]
  }
  @scala.inline
  implicit class InventoryDeletionStatusItemOps[Self <: InventoryDeletionStatusItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletionId(value: InventoryDeletionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionSummary(value: InventoryDeletionSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStatus(value: InventoryDeletionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStatusMessage(value: InventoryDeletionLastStatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStatusUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStatusUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStatusUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStatusUpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeName(value: InventoryItemTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeName")(js.undefined)
        ret
    }
  }
  
}

