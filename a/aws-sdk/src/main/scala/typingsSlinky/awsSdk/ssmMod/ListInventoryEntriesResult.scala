package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInventoryEntriesResult extends StObject {
  
  /**
    * The time that inventory information was collected for the instance(s).
    */
  var CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.native
  
  /**
    * A list of inventory items on the instance(s).
    */
  var Entries: js.UndefOr[InventoryItemEntryList] = js.native
  
  /**
    * The instance ID targeted by the request to query inventory information.
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceId] = js.native
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * The inventory schema version used by the instance(s).
    */
  var SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.native
  
  /**
    * The type of inventory item returned by the request.
    */
  var TypeName: js.UndefOr[InventoryItemTypeName] = js.native
}
object ListInventoryEntriesResult {
  
  @scala.inline
  def apply(): ListInventoryEntriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInventoryEntriesResult]
  }
  
  @scala.inline
  implicit class ListInventoryEntriesResultMutableBuilder[Self <: ListInventoryEntriesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureTime(value: InventoryItemCaptureTime): Self = StObject.set(x, "CaptureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureTimeUndefined: Self = StObject.set(x, "CaptureTime", js.undefined)
    
    @scala.inline
    def setEntries(value: InventoryItemEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: InventoryItemEntry*): Self = StObject.set(x, "Entries", js.Array(value :_*))
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: InventoryItemSchemaVersion): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
    
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
  }
}
