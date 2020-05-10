package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupResult extends js.Object {
  /**
    * The group that was requested. Contains the name of the group, the ARN of the group, and the filter expression that assigned to the group.
    */
  var Group: js.UndefOr[typingsSlinky.awsSdk.xrayMod.Group] = js.native
}

object GetGroupResult {
  @scala.inline
  def apply(): GetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupResult]
  }
  @scala.inline
  implicit class GetGroupResultOps[Self <: GetGroupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: Group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(js.undefined)
        ret
    }
  }
  
}

