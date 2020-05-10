package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupedResourceCount extends js.Object {
  /**
    * The name of the group that can be region, account ID, or resource type. For example, region1, region2 if the region was chosen as GroupByKey.
    */
  var GroupName: StringWithCharLimit256 = js.native
  /**
    * The number of resources in the group.
    */
  var ResourceCount: Long = js.native
}

object GroupedResourceCount {
  @scala.inline
  def apply(GroupName: StringWithCharLimit256, ResourceCount: Long): GroupedResourceCount = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], ResourceCount = ResourceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedResourceCount]
  }
  @scala.inline
  implicit class GroupedResourceCountOps[Self <: GroupedResourceCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupName(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceCount(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

