package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupRequest extends js.Object {
  /**
    * The filter expression defining criteria by which to group traces.
    */
  var FilterExpression: js.UndefOr[typingsSlinky.awsSdk.xrayMod.FilterExpression] = js.native
  /**
    * The case-sensitive name of the new group. Default is a reserved name and names must be unique.
    */
  var GroupName: typingsSlinky.awsSdk.xrayMod.GroupName = js.native
}

object CreateGroupRequest {
  @scala.inline
  def apply(GroupName: GroupName): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupRequest]
  }
  @scala.inline
  implicit class CreateGroupRequestOps[Self <: CreateGroupRequest] (val x: Self) extends AnyVal {
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
    def withFilterExpression(value: FilterExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterExpression")(js.undefined)
        ret
    }
  }
  
}

