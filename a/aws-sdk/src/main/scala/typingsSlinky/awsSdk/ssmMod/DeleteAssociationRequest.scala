package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAssociationRequest extends StObject {
  
  /**
    * The association ID that you want to delete.
    */
  var AssociationId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationId] = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceId] = js.native
  
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
}
object DeleteAssociationRequest {
  
  @scala.inline
  def apply(): DeleteAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAssociationRequest]
  }
  
  @scala.inline
  implicit class DeleteAssociationRequestMutableBuilder[Self <: DeleteAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
