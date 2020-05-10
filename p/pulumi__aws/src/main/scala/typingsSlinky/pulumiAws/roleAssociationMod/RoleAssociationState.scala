package typingsSlinky.pulumiAws.roleAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAssociationState extends js.Object {
  /**
    * DB Instance Identifier to associate with the IAM Role.
    */
  val dbInstanceIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
    */
  val featureName: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Instance.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}

object RoleAssociationState {
  @scala.inline
  def apply(): RoleAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleAssociationState]
  }
  @scala.inline
  implicit class RoleAssociationStateOps[Self <: RoleAssociationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbInstanceIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbInstanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbInstanceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureName")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
  }
  
}

