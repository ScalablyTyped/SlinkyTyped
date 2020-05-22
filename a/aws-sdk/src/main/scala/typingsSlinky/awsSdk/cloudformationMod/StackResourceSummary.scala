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
    ResourceType: ResourceType,
    DriftInformation: StackResourceDriftInformationSummary = null,
    PhysicalResourceId: PhysicalResourceId = null,
    ResourceStatusReason: ResourceStatusReason = null
  ): StackResourceSummary = {
    val __obj = js.Dynamic.literal(LastUpdatedTimestamp = LastUpdatedTimestamp.asInstanceOf[js.Any], LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceStatus = ResourceStatus.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    if (DriftInformation != null) __obj.updateDynamic("DriftInformation")(DriftInformation.asInstanceOf[js.Any])
    if (PhysicalResourceId != null) __obj.updateDynamic("PhysicalResourceId")(PhysicalResourceId.asInstanceOf[js.Any])
    if (ResourceStatusReason != null) __obj.updateDynamic("ResourceStatusReason")(ResourceStatusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceSummary]
  }
}

