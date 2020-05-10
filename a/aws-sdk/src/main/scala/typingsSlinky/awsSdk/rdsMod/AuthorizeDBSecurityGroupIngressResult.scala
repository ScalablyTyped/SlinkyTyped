package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeDBSecurityGroupIngressResult extends js.Object {
  var DBSecurityGroup: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBSecurityGroup] = js.native
}

object AuthorizeDBSecurityGroupIngressResult {
  @scala.inline
  def apply(): AuthorizeDBSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeDBSecurityGroupIngressResult]
  }
  @scala.inline
  implicit class AuthorizeDBSecurityGroupIngressResultOps[Self <: AuthorizeDBSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBSecurityGroup(value: DBSecurityGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSecurityGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSecurityGroup")(js.undefined)
        ret
    }
  }
  
}

