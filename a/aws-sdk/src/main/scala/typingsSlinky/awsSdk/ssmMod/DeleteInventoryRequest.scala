package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteInventoryRequest extends StObject {
  
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[UUID] = js.native
  
  /**
    * Use this option to view a summary of the deletion request without deleting any data or the data type. This option is useful when you only want to understand what will be deleted. Once you validate that the data to be deleted is what you intend to delete, you can run the same command without specifying the DryRun option.
    */
  var DryRun: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DryRun] = js.native
  
  /**
    * Use the SchemaDeleteOption to delete a custom inventory type (schema). If you don't choose this option, the system only deletes existing inventory data associated with the custom inventory type. Choose one of the following options: DisableSchema: If you choose this option, the system ignores all inventory data for the specified version, and any earlier versions. To enable this schema again, you must call the PutInventory action for a version greater than the disabled version. DeleteSchema: This option deletes the specified custom type from the Inventory service. You can recreate the schema later, if you want.
    */
  var SchemaDeleteOption: js.UndefOr[InventorySchemaDeleteOption] = js.native
  
  /**
    * The name of the custom inventory type for which you want to delete either all previously collected data or the inventory type itself. 
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
  implicit class DeleteInventoryRequestMutableBuilder[Self <: DeleteInventoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: UUID): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDryRun(value: DryRun): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setSchemaDeleteOption(value: InventorySchemaDeleteOption): Self = StObject.set(x, "SchemaDeleteOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaDeleteOptionUndefined: Self = StObject.set(x, "SchemaDeleteOption", js.undefined)
    
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
  }
}
