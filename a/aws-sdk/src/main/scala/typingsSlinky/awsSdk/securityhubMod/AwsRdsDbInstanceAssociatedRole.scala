package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsRdsDbInstanceAssociatedRole extends js.Object {
  /**
    * The name of the feature associated with the IAM)role.
    */
  var FeatureName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
    */
  var RoleArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * Describes the state of the association between the IAM role and the DB instance. The Status property returns one of the following values:    ACTIVE - the IAM role ARN is associated with the DB instance and can be used to access other AWS services on your behalf.    PENDING - the IAM role ARN is being associated with the DB instance.    INVALID - the IAM role ARN is associated with the DB instance, but the DB instance is unable to assume the IAM role in order to access other AWS services on your behalf.   
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}

object AwsRdsDbInstanceAssociatedRole {
  @scala.inline
  def apply(): AwsRdsDbInstanceAssociatedRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbInstanceAssociatedRole]
  }
  @scala.inline
  implicit class AwsRdsDbInstanceAssociatedRoleOps[Self <: AwsRdsDbInstanceAssociatedRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeatureName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeatureName")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
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
  }
  
}

