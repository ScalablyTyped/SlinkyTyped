package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserHierarchyGroupRequest extends js.Object {
  
  /**
    * The identifier of the hierarchy group.
    */
  var HierarchyGroupId: typingsSlinky.awsSdk.connectMod.HierarchyGroupId = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
}
object DescribeUserHierarchyGroupRequest {
  
  @scala.inline
  def apply(HierarchyGroupId: HierarchyGroupId, InstanceId: InstanceId): DescribeUserHierarchyGroupRequest = {
    val __obj = js.Dynamic.literal(HierarchyGroupId = HierarchyGroupId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserHierarchyGroupRequest]
  }
  
  @scala.inline
  implicit class DescribeUserHierarchyGroupRequestOps[Self <: DescribeUserHierarchyGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHierarchyGroupId(value: HierarchyGroupId): Self = this.set("HierarchyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
  }
}
