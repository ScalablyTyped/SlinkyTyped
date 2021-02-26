package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSlotTypeVersionRequest extends StObject {
  
  /**
    * The name of the slot type.
    */
  var name: SlotTypeName = js.native
  
  /**
    * The version of the slot type to delete. You cannot delete the $LATEST version of the slot type. To delete the $LATEST version, use the DeleteSlotType operation.
    */
  var version: NumericalVersion = js.native
}
object DeleteSlotTypeVersionRequest {
  
  @scala.inline
  def apply(name: SlotTypeName, version: NumericalVersion): DeleteSlotTypeVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSlotTypeVersionRequest]
  }
  
  @scala.inline
  implicit class DeleteSlotTypeVersionRequestMutableBuilder[Self <: DeleteSlotTypeVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SlotTypeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: NumericalVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
