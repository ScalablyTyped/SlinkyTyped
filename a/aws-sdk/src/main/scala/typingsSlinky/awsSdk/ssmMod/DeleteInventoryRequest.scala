package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInventoryRequest extends js.Object {
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ClientToken] = js.native
  /**
    * Use this option to view a summary of the deletion request without deleting any data or the data type. This option is useful when you only want to understand what will be deleted. Once you validate that the data to be deleted is what you intend to delete, you can run the same command without specifying the DryRun option.
    */
  var DryRun: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DryRun] = js.native
  /**
    * Use the SchemaDeleteOption to delete a custom inventory type (schema). If you don't choose this option, the system only deletes existing inventory data associated with the custom inventory type. Choose one of the following options: DisableSchema: If you choose this option, the system ignores all inventory data for the specified version, and any earlier versions. To enable this schema again, you must call the PutInventory action for a version greater than the disabled version. DeleteSchema: This option deletes the specified custom type from the Inventory service. You can recreate the schema later, if you want.
    */
  var SchemaDeleteOption: js.UndefOr[InventorySchemaDeleteOption] = js.native
  /**
    * The name of the custom inventory type for which you want to delete either all previously collected data, or the inventory type itself. 
    */
  var TypeName: InventoryItemTypeName = js.native
}

object DeleteInventoryRequest {
  @scala.inline
  def apply(TypeName: InventoryItemTypeName): DeleteInventoryRequest = {
    val __obj = js.Dynamic.literal(TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInventoryRequest]
  }
  @scala.inline
  implicit class DeleteInventoryRequestOps[Self <: DeleteInventoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeName(value: InventoryItemTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: DryRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaDeleteOption(value: InventorySchemaDeleteOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaDeleteOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaDeleteOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaDeleteOption")(js.undefined)
        ret
    }
  }
  
}

