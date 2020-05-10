package typingsSlinky.pulumiAws.outputMod.redshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupIngress extends js.Object {
  /**
    * The CIDR block to accept
    */
  var cidr: js.UndefOr[String] = js.native
  /**
    * The name of the security group to authorize
    */
  var securityGroupName: String = js.native
  /**
    * The owner Id of the security group provided
    * by `securityGroupName`.
    */
  var securityGroupOwnerId: String = js.native
}

object SecurityGroupIngress {
  @scala.inline
  def apply(securityGroupName: String, securityGroupOwnerId: String): SecurityGroupIngress = {
    val __obj = js.Dynamic.literal(securityGroupName = securityGroupName.asInstanceOf[js.Any], securityGroupOwnerId = securityGroupOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupIngress]
  }
  @scala.inline
  implicit class SecurityGroupIngressOps[Self <: SecurityGroupIngress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidr")(js.undefined)
        ret
    }
  }
  
}

