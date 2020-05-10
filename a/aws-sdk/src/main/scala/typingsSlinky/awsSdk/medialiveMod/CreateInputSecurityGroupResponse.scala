package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInputSecurityGroupResponse extends js.Object {
  var SecurityGroup: js.UndefOr[InputSecurityGroup] = js.native
}

object CreateInputSecurityGroupResponse {
  @scala.inline
  def apply(): CreateInputSecurityGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputSecurityGroupResponse]
  }
  @scala.inline
  implicit class CreateInputSecurityGroupResponseOps[Self <: CreateInputSecurityGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityGroup(value: InputSecurityGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroup")(js.undefined)
        ret
    }
  }
  
}

