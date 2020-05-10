package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateRoleFromGroupResponse extends js.Object {
  /**
    * The time, in milliseconds since the epoch, when the role was disassociated from the group.
    */
  var DisassociatedAt: js.UndefOr[string] = js.native
}

object DisassociateRoleFromGroupResponse {
  @scala.inline
  def apply(): DisassociateRoleFromGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateRoleFromGroupResponse]
  }
  @scala.inline
  implicit class DisassociateRoleFromGroupResponseOps[Self <: DisassociateRoleFromGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisassociatedAt(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisassociatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociatedAt")(js.undefined)
        ret
    }
  }
  
}

