package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInventoryResult extends js.Object {
  /**
    * Every DeleteInventory action is assigned a unique ID. This option returns a unique ID. You can use this ID to query the status of a delete operation. This option is useful for ensuring that a delete operation has completed before you begin other actions. 
    */
  var DeletionId: js.UndefOr[InventoryDeletionId] = js.native
  /**
    * A summary of the delete operation. For more information about this summary, see Understanding the Delete Inventory Summary in the AWS Systems Manager User Guide.
    */
  var DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.native
  /**
    * The name of the inventory data type specified in the request.
    */
  var TypeName: js.UndefOr[InventoryItemTypeName] = js.native
}

object DeleteInventoryResult {
  @scala.inline
  def apply(): DeleteInventoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInventoryResult]
  }
  @scala.inline
  implicit class DeleteInventoryResultOps[Self <: DeleteInventoryResult] (val x: Self) extends AnyVal {
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

