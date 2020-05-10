package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeClusterSecurityGroupIngressResult extends js.Object {
  var ClusterSecurityGroup: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.ClusterSecurityGroup] = js.native
}

object AuthorizeClusterSecurityGroupIngressResult {
  @scala.inline
  def apply(): AuthorizeClusterSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeClusterSecurityGroupIngressResult]
  }
  @scala.inline
  implicit class AuthorizeClusterSecurityGroupIngressResultOps[Self <: AuthorizeClusterSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterSecurityGroup(value: ClusterSecurityGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterSecurityGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSecurityGroup")(js.undefined)
        ret
    }
  }
  
}

