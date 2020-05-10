package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockServiceLinkedRoleRequest extends js.Object {
  var RoleArn: stringMin1Max1600 = js.native
  var Timeout: integerMin1Max29000 = js.native
}

object LockServiceLinkedRoleRequest {
  @scala.inline
  def apply(RoleArn: stringMin1Max1600, Timeout: integerMin1Max29000): LockServiceLinkedRoleRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockServiceLinkedRoleRequest]
  }
  @scala.inline
  implicit class LockServiceLinkedRoleRequestOps[Self <: LockServiceLinkedRoleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleArn(value: stringMin1Max1600): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: integerMin1Max29000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

