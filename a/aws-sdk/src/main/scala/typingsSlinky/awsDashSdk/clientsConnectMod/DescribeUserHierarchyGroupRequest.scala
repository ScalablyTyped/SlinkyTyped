package typingsSlinky.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserHierarchyGroupRequest extends js.Object {
  /**
    * The identifier of the hierarchy group.
    */
  var HierarchyGroupId: typingsSlinky.awsDashSdk.clientsConnectMod.HierarchyGroupId = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsDashSdk.clientsConnectMod.InstanceId = js.native
}

object DescribeUserHierarchyGroupRequest {
  @scala.inline
  def apply(HierarchyGroupId: HierarchyGroupId, InstanceId: InstanceId): DescribeUserHierarchyGroupRequest = {
    val __obj = js.Dynamic.literal(HierarchyGroupId = HierarchyGroupId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeUserHierarchyGroupRequest]
  }
}

