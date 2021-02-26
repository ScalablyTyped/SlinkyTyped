package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateInstanceStorageConfigRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * A valid resource type.
    */
  var ResourceType: InstanceStorageResourceType = js.native
  
  /**
    * A valid storage type.
    */
  var StorageConfig: InstanceStorageConfig = js.native
}
object AssociateInstanceStorageConfigRequest {
  
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    ResourceType: InstanceStorageResourceType,
    StorageConfig: InstanceStorageConfig
  ): AssociateInstanceStorageConfigRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], StorageConfig = StorageConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateInstanceStorageConfigRequest]
  }
  
  @scala.inline
  implicit class AssociateInstanceStorageConfigRequestMutableBuilder[Self <: AssociateInstanceStorageConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: InstanceStorageResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageConfig(value: InstanceStorageConfig): Self = StObject.set(x, "StorageConfig", value.asInstanceOf[js.Any])
  }
}
