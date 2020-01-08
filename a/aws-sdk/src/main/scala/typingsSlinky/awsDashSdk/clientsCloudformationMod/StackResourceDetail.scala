package typingsSlinky.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackResourceDetail extends js.Object {
  /**
    * User defined description associated with the resource.
    */
  var Description: js.UndefOr[typingsSlinky.awsDashSdk.clientsCloudformationMod.Description] = js.native
  /**
    * Information about whether the resource's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackResourceDriftInformation] = js.native
  /**
    * Time the status was updated.
    */
  var LastUpdatedTimestamp: js.Date = js.native
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: typingsSlinky.awsDashSdk.clientsCloudformationMod.LogicalResourceId = js.native
  /**
    * The content of the Metadata attribute declared for the resource. For more information, see Metadata Attribute in the AWS CloudFormation User Guide.
    */
  var Metadata: js.UndefOr[typingsSlinky.awsDashSdk.clientsCloudformationMod.Metadata] = js.native
  /**
    * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS CloudFormation.
    */
  var PhysicalResourceId: js.UndefOr[typingsSlinky.awsDashSdk.clientsCloudformationMod.PhysicalResourceId] = js.native
  /**
    * Current status of the resource.
    */
  var ResourceStatus: typingsSlinky.awsDashSdk.clientsCloudformationMod.ResourceStatus = js.native
  /**
    * Success/failure message associated with the resource.
    */
  var ResourceStatusReason: js.UndefOr[typingsSlinky.awsDashSdk.clientsCloudformationMod.ResourceStatusReason] = js.native
  /**
    * Type of resource. ((For more information, go to  AWS Resource Types Reference in the AWS CloudFormation User Guide.)
    */
  var ResourceType: typingsSlinky.awsDashSdk.clientsCloudformationMod.ResourceType = js.native
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typingsSlinky.awsDashSdk.clientsCloudformationMod.StackId] = js.native
  /**
    * The name associated with the stack.
    */
  var StackName: js.UndefOr[typingsSlinky.awsDashSdk.clientsCloudformationMod.StackName] = js.native
}

object StackResourceDetail {
  @scala.inline
  def apply(
    LastUpdatedTimestamp: js.Date,
    LogicalResourceId: LogicalResourceId,
    ResourceStatus: ResourceStatus,
    ResourceType: ResourceType,
    Description: Description = null,
    DriftInformation: StackResourceDriftInformation = null,
    Metadata: Metadata = null,
    PhysicalResourceId: PhysicalResourceId = null,
    ResourceStatusReason: ResourceStatusReason = null,
    StackId: StackId = null,
    StackName: StackName = null
  ): StackResourceDetail = {
    val __obj = js.Dynamic.literal(LastUpdatedTimestamp = LastUpdatedTimestamp.asInstanceOf[js.Any], LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceStatus = ResourceStatus.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DriftInformation != null) __obj.updateDynamic("DriftInformation")(DriftInformation.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (PhysicalResourceId != null) __obj.updateDynamic("PhysicalResourceId")(PhysicalResourceId.asInstanceOf[js.Any])
    if (ResourceStatusReason != null) __obj.updateDynamic("ResourceStatusReason")(ResourceStatusReason.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (StackName != null) __obj.updateDynamic("StackName")(StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceDetail]
  }
}

