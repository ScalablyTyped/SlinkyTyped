package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsRdsDbInstanceVpcSecurityGroup extends js.Object {
  /**
    * The status of the VPC security group.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the VPC security group.
    */
  var VpcSecurityGroupId: js.UndefOr[NonEmptyString] = js.native
}

object AwsRdsDbInstanceVpcSecurityGroup {
  @scala.inline
  def apply(): AwsRdsDbInstanceVpcSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbInstanceVpcSecurityGroup]
  }
  @scala.inline
  implicit class AwsRdsDbInstanceVpcSecurityGroupOps[Self <: AwsRdsDbInstanceVpcSecurityGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroupId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupId")(js.undefined)
        ret
    }
  }
  
}

