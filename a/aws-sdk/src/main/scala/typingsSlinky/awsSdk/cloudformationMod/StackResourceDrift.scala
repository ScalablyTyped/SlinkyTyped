package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackResourceDrift extends js.Object {
  /**
    * A JSON structure containing the actual property values of the stack resource. For resources whose StackResourceDriftStatus is DELETED, this structure will not be present. 
    */
  var ActualProperties: js.UndefOr[Properties] = js.native
  /**
    * A JSON structure containing the expected property values of the stack resource, as defined in the stack template and any values specified as template parameters.  For resources whose StackResourceDriftStatus is DELETED, this structure will not be present. 
    */
  var ExpectedProperties: js.UndefOr[Properties] = js.native
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: typingsSlinky.awsSdk.cloudformationMod.LogicalResourceId = js.native
  /**
    * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS CloudFormation. 
    */
  var PhysicalResourceId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.PhysicalResourceId] = js.native
  /**
    * Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation uses context key-value pairs in cases where a resource's logical and physical IDs are not enough to uniquely identify that resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
    */
  var PhysicalResourceIdContext: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.PhysicalResourceIdContext] = js.native
  /**
    * A collection of the resource properties whose actual values differ from their expected values. These will be present only for resources whose StackResourceDriftStatus is MODIFIED. 
    */
  var PropertyDifferences: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.PropertyDifferences] = js.native
  /**
    * The type of the resource.
    */
  var ResourceType: typingsSlinky.awsSdk.cloudformationMod.ResourceType = js.native
  /**
    * The ID of the stack.
    */
  var StackId: typingsSlinky.awsSdk.cloudformationMod.StackId = js.native
  /**
    * Status of the resource's actual configuration compared to its expected configuration    DELETED: The resource differs from its expected template configuration because the resource has been deleted.    MODIFIED: One or more resource properties differ from their expected values (as defined in the stack template and any values specified as template parameters).    IN_SYNC: The resources's actual configuration matches its expected template configuration.    NOT_CHECKED: AWS CloudFormation does not currently return this value.  
    */
  var StackResourceDriftStatus: typingsSlinky.awsSdk.cloudformationMod.StackResourceDriftStatus = js.native
  /**
    * Time at which AWS CloudFormation performed drift detection on the stack resource.
    */
  var Timestamp: js.Date = js.native
}

object StackResourceDrift {
  @scala.inline
  def apply(
    LogicalResourceId: LogicalResourceId,
    ResourceType: ResourceType,
    StackId: StackId,
    StackResourceDriftStatus: StackResourceDriftStatus,
    Timestamp: js.Date
  ): StackResourceDrift = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], StackResourceDriftStatus = StackResourceDriftStatus.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceDrift]
  }
  @scala.inline
  implicit class StackResourceDriftOps[Self <: StackResourceDrift] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogicalResourceId(value: LogicalResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackId(value: StackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackResourceDriftStatus(value: StackResourceDriftStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackResourceDriftStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActualProperties(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActualProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActualProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedProperties(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpectedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpectedProperties")(js.undefined)
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
    def withPhysicalResourceIdContext(value: PhysicalResourceIdContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalResourceIdContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicalResourceIdContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalResourceIdContext")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyDifferences(value: PropertyDifferences): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyDifferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyDifferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyDifferences")(js.undefined)
        ret
    }
  }
  
}

