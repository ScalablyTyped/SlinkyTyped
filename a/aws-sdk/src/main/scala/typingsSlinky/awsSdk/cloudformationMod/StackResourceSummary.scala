package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackResourceSummary extends js.Object {
  /**
    * Information about whether the resource's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackResourceDriftInformationSummary] = js.native
  /**
    * Time the status was updated.
    */
  var LastUpdatedTimestamp: js.Date = js.native
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: typingsSlinky.awsSdk.cloudformationMod.LogicalResourceId = js.native
  /**
    * The name or unique identifier that corresponds to a physical instance ID of the resource.
    */
  var PhysicalResourceId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.PhysicalResourceId] = js.native
  /**
    * Current status of the resource.
    */
  var ResourceStatus: typingsSlinky.awsSdk.cloudformationMod.ResourceStatus = js.native
  /**
    * Success/failure message associated with the resource.
    */
  var ResourceStatusReason: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ResourceStatusReason] = js.native
  /**
    * Type of resource. (For more information, go to  AWS Resource Types Reference in the AWS CloudFormation User Guide.)
    */
  var ResourceType: typingsSlinky.awsSdk.cloudformationMod.ResourceType = js.native
}

object StackResourceSummary {
  @scala.inline
  def apply(
    LastUpdatedTimestamp: js.Date,
    LogicalResourceId: LogicalResourceId,
    ResourceStatus: ResourceStatus,
    ResourceType: ResourceType
  ): StackResourceSummary = {
    val __obj = js.Dynamic.literal(LastUpdatedTimestamp = LastUpdatedTimestamp.asInstanceOf[js.Any], LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceStatus = ResourceStatus.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceSummary]
  }
  @scala.inline
  implicit class StackResourceSummaryOps[Self <: StackResourceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastUpdatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalResourceId(value: LogicalResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceStatus(value: ResourceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDriftInformation(value: StackResourceDriftInformationSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriftInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withPhysicalResourceId(value: PhysicalResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicalResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceStatusReason(value: ResourceStatusReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceStatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceStatusReason")(js.undefined)
        ret
    }
  }
  
}

