package typingsSlinky.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationFieldProperties extends StObject {
  
  /**
    *  Specifies if the destination field can be created by the current user. 
    */
  var isCreatable: js.UndefOr[Boolean] = js.native
  
  /**
    *  Specifies if the destination field can have a null value. 
    */
  var isNullable: js.UndefOr[Boolean] = js.native
  
  /**
    *  Specifies whether the field can be updated during an UPDATE or UPSERT write operation. 
    */
  var isUpdatable: js.UndefOr[Boolean] = js.native
  
  /**
    *  Specifies if the flow run can either insert new rows in the destination field if they do not already exist, or update them if they do. 
    */
  var isUpsertable: js.UndefOr[Boolean] = js.native
  
  /**
    *  A list of supported write operations. For each write operation listed, this field can be used in idFieldNames when that write operation is present as a destination option. 
    */
  var supportedWriteOperations: js.UndefOr[SupportedWriteOperationList] = js.native
}
object DestinationFieldProperties {
  
  @scala.inline
  def apply(): DestinationFieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationFieldProperties]
  }
  
  @scala.inline
  implicit class DestinationFieldPropertiesMutableBuilder[Self <: DestinationFieldProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCreatable(value: Boolean): Self = StObject.set(x, "isCreatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCreatableUndefined: Self = StObject.set(x, "isCreatable", js.undefined)
    
    @scala.inline
    def setIsNullable(value: Boolean): Self = StObject.set(x, "isNullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNullableUndefined: Self = StObject.set(x, "isNullable", js.undefined)
    
    @scala.inline
    def setIsUpdatable(value: Boolean): Self = StObject.set(x, "isUpdatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUpdatableUndefined: Self = StObject.set(x, "isUpdatable", js.undefined)
    
    @scala.inline
    def setIsUpsertable(value: Boolean): Self = StObject.set(x, "isUpsertable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUpsertableUndefined: Self = StObject.set(x, "isUpsertable", js.undefined)
    
    @scala.inline
    def setSupportedWriteOperations(value: SupportedWriteOperationList): Self = StObject.set(x, "supportedWriteOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedWriteOperationsUndefined: Self = StObject.set(x, "supportedWriteOperations", js.undefined)
    
    @scala.inline
    def setSupportedWriteOperationsVarargs(value: WriteOperationType*): Self = StObject.set(x, "supportedWriteOperations", js.Array(value :_*))
  }
}
