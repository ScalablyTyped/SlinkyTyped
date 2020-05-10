package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStackInstancesInput extends js.Object {
  /**
    * [Self-managed permissions] The names of one or more AWS accounts that you want to create stack instances in the specified region(s) for. You can specify Accounts or DeploymentTargets, but not both.
    */
  var Accounts: js.UndefOr[AccountList] = js.native
  /**
    * [Service-managed permissions] The AWS Organizations accounts for which to create stack instances in the specified Regions. You can specify Accounts or DeploymentTargets, but not both.
    */
  var DeploymentTargets: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.DeploymentTargets] = js.native
  /**
    * The unique identifier for this stack set operation.  The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set operation only once, even if you retry the request multiple times. You might retry stack set operation requests to ensure that AWS CloudFormation successfully received them. If you don't specify an operation ID, the SDK generates one automatically.  Repeating this stack set operation with a new operation ID retries all stack instances whose status is OUTDATED. 
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
  /**
    * Preferences for how AWS CloudFormation performs this stack set operation.
    */
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.native
  /**
    * A list of stack set parameters whose values you want to override in the selected stack instances. Any overridden parameter values will be applied to all stack instances in the specified accounts and regions. When specifying parameters and their values, be aware of how AWS CloudFormation sets parameter values during stack instance operations:   To override the current value for a parameter, include the parameter and specify its value.   To leave a parameter set to its present value, you can do one of the following:   Do not include the parameter in the list.   Include the parameter and specify UsePreviousValue as true. (You cannot specify both a value and set UsePreviousValue to true.)     To set all overridden parameter back to the values specified in the stack set, specify a parameter list but do not include any parameters.   To leave all parameters set to their present values, do not specify this property at all.   During stack set updates, any parameter values overridden for a stack instance are not updated, but retain their overridden value. You can only override the parameter values that are specified in the stack set; to add or delete a parameter itself, use UpdateStackSet to update the stack set template.
    */
  var ParameterOverrides: js.UndefOr[Parameters] = js.native
  /**
    * The names of one or more regions where you want to create stack instances using the specified AWS account(s). 
    */
  var Regions: RegionList = js.native
  /**
    * The name or unique ID of the stack set that you want to create stack instances from.
    */
  var StackSetName: typingsSlinky.awsSdk.cloudformationMod.StackSetName = js.native
}

object CreateStackInstancesInput {
  @scala.inline
  def apply(Regions: RegionList, StackSetName: StackSetName): CreateStackInstancesInput = {
    val __obj = js.Dynamic.literal(Regions = Regions.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStackInstancesInput]
  }
  @scala.inline
  implicit class CreateStackInstancesInputOps[Self <: CreateStackInstancesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegions(value: RegionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackSetName(value: StackSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccounts(value: AccountList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentTargets(value: DeploymentTargets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationId(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationId")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationPreferences(value: StackSetOperationPreferences): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationPreferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationPreferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationPreferences")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterOverrides(value: Parameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterOverrides")(js.undefined)
        ret
    }
  }
  
}

