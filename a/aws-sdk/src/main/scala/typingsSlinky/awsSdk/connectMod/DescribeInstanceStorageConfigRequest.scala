package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceStorageConfigRequest extends js.Object {
  
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
object DescribeInstanceStorageConfigRequest {
  
  @scala.inline
  def apply(AssociationId: AssociationId, InstanceId: InstanceId, ResourceType: InstanceStorageResourceType): DescribeInstanceStorageConfigRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceStorageConfigRequest]
  }
  
  @scala.inline
  implicit class DescribeInstanceStorageConfigRequestOps[Self <: DescribeInstanceStorageConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: InstanceStorageResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
  }
}
