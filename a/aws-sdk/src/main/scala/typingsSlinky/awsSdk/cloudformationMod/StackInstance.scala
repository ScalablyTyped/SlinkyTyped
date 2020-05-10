package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackInstance extends js.Object {
  /**
    * [Self-managed permissions] The name of the AWS account that the stack instance is associated with.
    */
  var Account: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Account] = js.native
  /**
    * Status of the stack instance's actual configuration compared to the expected template and parameter configuration of the stack set to which it belongs.     DRIFTED: The stack differs from the expected template and parameter configuration of the stack set to which it belongs. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: AWS CloudFormation has not checked if the stack instance differs from its expected stack set configuration.    IN_SYNC: The stack instance's actual configuration matches its expected stack set configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var DriftStatus: js.UndefOr[StackDriftStatus] = js.native
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack instance. This value will be NULL for any stack instance on which drift detection has not yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * [Service-managed permissions] The organization root ID or organizational unit (OU) ID that the stack instance is associated with.
    */
  var OrganizationalUnitId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.OrganizationalUnitId] = js.native
  /**
    * A list of parameters from the stack set template whose values have been overridden in this stack instance.
    */
  var ParameterOverrides: js.UndefOr[Parameters] = js.native
  /**
    * The name of the AWS region that the stack instance is associated with.
    */
  var Region: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Region] = js.native
  /**
    * The ID of the stack instance.
    */
  var StackId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackId] = js.native
  /**
    * The name or unique ID of the stack set that the stack instance is associated with.
    */
  var StackSetId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackSetId] = js.native
  /**
    * The status of the stack instance, in terms of its synchronization with its associated stack set.    INOPERABLE: A DeleteStackInstances operation has failed and left the stack in an unstable state. Stacks in this state are excluded from further UpdateStackSet operations. You might need to perform a DeleteStackInstances operation, with RetainStacks set to true, to delete the stack instance, and then delete the stack manually.    OUTDATED: The stack isn't currently up to date with the stack set because:   The associated stack failed during a CreateStackSet or UpdateStackSet operation.    The stack was part of a CreateStackSet or UpdateStackSet operation that failed or was stopped before the stack was created or updated.       CURRENT: The stack is currently up to date with the stack set.  
    */
  var Status: js.UndefOr[StackInstanceStatus] = js.native
  /**
    * The explanation for the specific status code that is assigned to this stack instance.
    */
  var StatusReason: js.UndefOr[Reason] = js.native
}

object StackInstance {
  @scala.inline
  def apply(): StackInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackInstance]
  }
  @scala.inline
  implicit class StackInstanceOps[Self <: StackInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(js.undefined)
        ret
    }
    @scala.inline
    def withDriftStatus(value: StackDriftStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriftStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastDriftCheckTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastDriftCheckTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDriftCheckTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastDriftCheckTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationalUnitId(value: OrganizationalUnitId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationalUnitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitId")(js.undefined)
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
    @scala.inline
    def withRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: StackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
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
    def withStatus(value: StackInstanceStatus): Self = {
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
    def withStatusReason(value: Reason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReason")(js.undefined)
        ret
    }
  }
  
}

