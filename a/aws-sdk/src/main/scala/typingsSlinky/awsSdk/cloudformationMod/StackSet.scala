package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSet extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the IAM role used to create or update the stack set. Use customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Prerequisites: Granting Permissions for Stack Set Operations in the AWS CloudFormation User Guide.
    */
  var AdministrationRoleARN: js.UndefOr[RoleARN_] = js.native
  /**
    * [Service-managed permissions] Describes whether StackSets automatically deploys to AWS Organizations accounts that are added to a target organization or organizational unit (OU).
    */
  var AutoDeployment: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.AutoDeployment] = js.native
  /**
    * The capabilities that are allowed in the stack set. Some stack set templates might include resources that can affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management (IAM) users. For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates. 
    */
  var Capabilities: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Capabilities] = js.native
  /**
    * A description of the stack set that you specify when the stack set is created or updated.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  /**
    * The name of the IAM execution role used to create or update the stack set.  Use customized execution roles to control which stack resources users and groups can include in their stack sets. 
    */
  var ExecutionRoleName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ExecutionRoleName] = js.native
  /**
    * [Service-managed permissions] The organization root ID or organizational unit (OUs) IDs to which stacks in your stack set have been deployed.
    */
  var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.native
  /**
    * A list of input parameters for a stack set.
    */
  var Parameters: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Parameters] = js.native
  /**
    * Describes how the IAM roles required for stack set operations are created.   With self-managed permissions, you must create the administrator and execution roles required to deploy to target accounts. For more information, see Grant Self-Managed Stack Set Permissions.   With service-managed permissions, StackSets automatically creates the IAM roles required to deploy to accounts managed by AWS Organizations. For more information, see Grant Service-Managed Stack Set Permissions.  
    */
  var PermissionModel: js.UndefOr[PermissionModels] = js.native
  /**
    * The Amazon Resource Number (ARN) of the stack set.
    */
  var StackSetARN: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackSetARN] = js.native
  /**
    * Detailed information about the drift status of the stack set. For stack sets, contains information about the last completed drift operation performed on the stack set. Information about drift operations currently in progress is not included.
    */
  var StackSetDriftDetectionDetails: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackSetDriftDetectionDetails] = js.native
  /**
    * The ID of the stack set.
    */
  var StackSetId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackSetId] = js.native
  /**
    * The name that's associated with the stack set.
    */
  var StackSetName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackSetName] = js.native
  /**
    * The status of the stack set.
    */
  var Status: js.UndefOr[StackSetStatus] = js.native
  /**
    * A list of tags that specify information about the stack set. A maximum number of 50 tags can be specified.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Tags] = js.native
  /**
    * The structure that contains the body of the template that was used to create or update the stack set.
    */
  var TemplateBody: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TemplateBody] = js.native
}

object StackSet {
  @scala.inline
  def apply(): StackSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSet]
  }
  @scala.inline
  implicit class StackSetOps[Self <: StackSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdministrationRoleARN(value: RoleARN_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdministrationRoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrationRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdministrationRoleARN")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDeployment(value: AutoDeployment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDeployment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeployment")(js.undefined)
        ret
    }
    @scala.inline
    def withCapabilities(value: Capabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionRoleName(value: ExecutionRoleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRoleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRoleName")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationalUnitIds(value: OrganizationalUnitIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationalUnitIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitIds")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: Parameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionModel(value: PermissionModels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionModel")(js.undefined)
        ret
    }
    @scala.inline
    def withStackSetARN(value: StackSetARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetARN")(js.undefined)
        ret
    }
    @scala.inline
    def withStackSetDriftDetectionDetails(value: StackSetDriftDetectionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetDriftDetectionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetDriftDetectionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetDriftDetectionDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withStackSetId(value: StackSetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withStackSetName(value: StackSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: StackSetStatus): Self = {
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
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateBody(value: TemplateBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateBody")(js.undefined)
        ret
    }
  }
  
}

