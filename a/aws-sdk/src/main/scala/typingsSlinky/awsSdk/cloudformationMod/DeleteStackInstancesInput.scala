package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStackInstancesInput extends js.Object {
  /**
    * [Self-managed permissions] The names of the AWS accounts that you want to delete stack instances for. You can specify Accounts or DeploymentTargets, but not both.
    */
  var Accounts: js.UndefOr[AccountList] = js.native
  /**
    * [Service-managed permissions] The AWS Organizations accounts from which to delete stack instances. You can specify Accounts or DeploymentTargets, but not both.
    */
  var DeploymentTargets: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.DeploymentTargets] = js.native
  /**
    * The unique identifier for this stack set operation.  If you don't specify an operation ID, the SDK generates one automatically.  The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set operation only once, even if you retry the request multiple times. You can retry stack set operation requests to ensure that AWS CloudFormation successfully received them. Repeating this stack set operation with a new operation ID retries all stack instances whose status is OUTDATED. 
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
  /**
    * Preferences for how AWS CloudFormation performs this stack set operation.
    */
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.native
  /**
    * The regions where you want to delete stack set instances. 
    */
  var Regions: RegionList = js.native
  /**
    * Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack or add an existing, saved stack to a new stack set. For more information, see Stack set operation options.
    */
  var RetainStacks: typingsSlinky.awsSdk.cloudformationMod.RetainStacks = js.native
  /**
    * The name or unique ID of the stack set that you want to delete stack instances for.
    */
  var StackSetName: typingsSlinky.awsSdk.cloudformationMod.StackSetName = js.native
}

object DeleteStackInstancesInput {
  @scala.inline
  def apply(Regions: RegionList, RetainStacks: RetainStacks, StackSetName: StackSetName): DeleteStackInstancesInput = {
    val __obj = js.Dynamic.literal(Regions = Regions.asInstanceOf[js.Any], RetainStacks = RetainStacks.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStackInstancesInput]
  }
  @scala.inline
  implicit class DeleteStackInstancesInputOps[Self <: DeleteStackInstancesInput] (val x: Self) extends AnyVal {
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
    def withRetainStacks(value: RetainStacks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetainStacks")(value.asInstanceOf[js.Any])
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
  }
  
}

