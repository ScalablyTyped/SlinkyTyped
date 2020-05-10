package typingsSlinky.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupQuery extends js.Object {
  /**
    * The name of a resource group that is associated with a specific resource query.
    */
  var GroupName: typingsSlinky.awsSdk.resourcegroupsMod.GroupName = js.native
  /**
    * The resource query which determines which AWS resources are members of the associated resource group.
    */
  var ResourceQuery: typingsSlinky.awsSdk.resourcegroupsMod.ResourceQuery = js.native
}

object GroupQuery {
  @scala.inline
  def apply(GroupName: GroupName, ResourceQuery: ResourceQuery): GroupQuery = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], ResourceQuery = ResourceQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupQuery]
  }
  @scala.inline
  implicit class GroupQueryOps[Self <: GroupQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupName(value: GroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceQuery(value: ResourceQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceQuery")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

