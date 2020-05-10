package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupRequest extends js.Object {
  /**
    * The updated filter expression defining criteria by which to group traces.
    */
  var FilterExpression: js.UndefOr[typingsSlinky.awsSdk.xrayMod.FilterExpression] = js.native
  /**
    * The ARN that was generated upon creation.
    */
  var GroupARN: js.UndefOr[typingsSlinky.awsSdk.xrayMod.GroupARN] = js.native
  /**
    * The case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[typingsSlinky.awsSdk.xrayMod.GroupName] = js.native
}

object UpdateGroupRequest {
  @scala.inline
  def apply(): UpdateGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupRequest]
  }
  @scala.inline
  implicit class UpdateGroupRequestOps[Self <: UpdateGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withGroupARN(value: GroupARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupARN")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: GroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
        ret
    }
  }
  
}

