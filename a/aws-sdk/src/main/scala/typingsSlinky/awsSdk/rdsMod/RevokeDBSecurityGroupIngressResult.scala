package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeDBSecurityGroupIngressResult extends js.Object {
  var DBSecurityGroup: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBSecurityGroup] = js.native
}

object RevokeDBSecurityGroupIngressResult {
  @scala.inline
  def apply(): RevokeDBSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeDBSecurityGroupIngressResult]
  }
  @scala.inline
  implicit class RevokeDBSecurityGroupIngressResultOps[Self <: RevokeDBSecurityGroupIngressResult] (val x: Self) extends AnyVal {
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

