package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateInstanceStorageConfigResponse extends StObject {
  
  /**
    * The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
    */
  var AssociationId: js.UndefOr[typingsSlinky.awsSdk.connectMod.AssociationId] = js.native
}
object AssociateInstanceStorageConfigResponse {
  
  @scala.inline
  def apply(): AssociateInstanceStorageConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateInstanceStorageConfigResponse]
  }
  
  @scala.inline
  implicit class AssociateInstanceStorageConfigResponseMutableBuilder[Self <: AssociateInstanceStorageConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
  }
}
