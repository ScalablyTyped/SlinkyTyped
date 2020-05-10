package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserHierarchyGroupResponse extends js.Object {
  /**
    * Information about the hierarchy group.
    */
  var HierarchyGroup: js.UndefOr[typingsSlinky.awsSdk.connectMod.HierarchyGroup] = js.native
}

object DescribeUserHierarchyGroupResponse {
  @scala.inline
  def apply(): DescribeUserHierarchyGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserHierarchyGroupResponse]
  }
  @scala.inline
  implicit class DescribeUserHierarchyGroupResponseOps[Self <: DescribeUserHierarchyGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHierarchyGroup(value: HierarchyGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HierarchyGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchyGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HierarchyGroup")(js.undefined)
        ret
    }
  }
  
}

