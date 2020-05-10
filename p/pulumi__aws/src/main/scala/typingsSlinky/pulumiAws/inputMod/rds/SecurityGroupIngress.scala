package typingsSlinky.pulumiAws.inputMod.rds

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupIngress extends js.Object {
  /**
    * The CIDR block to accept
    */
  var cidr: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the security group to authorize
    */
  var securityGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the security group to authorize
    */
  var securityGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The owner Id of the security group provided
    * by `securityGroupName`.
    */
  var securityGroupOwnerId: js.UndefOr[Input[String]] = js.native
}

object SecurityGroupIngress {
  @scala.inline
  def apply(): SecurityGroupIngress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupIngress]
  }
  @scala.inline
  implicit class SecurityGroupIngressOps[Self <: SecurityGroupIngress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidr(value: Input[String]): Self = {
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
    @scala.inline
    def withSecurityGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupOwnerId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupOwnerId")(js.undefined)
        ret
    }
  }
  
}

