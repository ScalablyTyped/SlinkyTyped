package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateInstanceStorageConfigRequest extends StObject {
  
  /**
    * The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
    */
  var AssociationId: typingsSlinky.awsSdk.connectMod.AssociationId = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * A valid resource type.
    */
  var ResourceType: InstanceStorageResourceType = js.native
}
object DisassociateInstanceStorageConfigRequest {
  
  @scala.inline
  def apply(AssociationId: AssociationId, InstanceId: InstanceId, ResourceType: InstanceStorageResourceType): DisassociateInstanceStorageConfigRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateInstanceStorageConfigRequest]
  }
  
  @scala.inline
  implicit class DisassociateInstanceStorageConfigRequestMutableBuilder[Self <: DisassociateInstanceStorageConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: InstanceStorageResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
