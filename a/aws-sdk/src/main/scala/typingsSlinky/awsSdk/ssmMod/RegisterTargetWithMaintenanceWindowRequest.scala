package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTargetWithMaintenanceWindowRequest extends js.Object {
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ClientToken] = js.native
  /**
    * An optional description for the target.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * An optional name for the target.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this maintenance window.
    */
  var OwnerInformation: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OwnerInformation] = js.native
  /**
    * The type of target being registered with the maintenance window.
    */
  var ResourceType: MaintenanceWindowResourceType = js.native
  /**
    * The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances.  Example 1: Specify instance IDs  Key=InstanceIds,Values=instance-id-1,instance-id-2,instance-id-3    Example 2: Use tag key-pairs applied to instances  Key=tag:my-tag-key,Values=my-tag-value-1,my-tag-value-2    Example 3: Use tag-keys applied to instances  Key=tag-key,Values=my-tag-key-1,my-tag-key-2    Example 4: Use resource group names  Key=resource-groups:Name,Values=resource-group-name    Example 5: Use filters for resource group types  Key=resource-groups:ResourceTypeFilters,Values=resource-type-1,resource-type-2    For Key=resource-groups:ResourceTypeFilters, specify resource types in the following format  Key=resource-groups:ResourceTypeFilters,Values=AWS::EC2::INSTANCE,AWS::EC2::VPC    For more information about these examples formats, including the best use case for each one, see Examples: Register Targets with a Maintenance Window in the AWS Systems Manager User Guide.
    */
  var Targets: typingsSlinky.awsSdk.ssmMod.Targets = js.native
  /**
    * The ID of the maintenance window the target should be registered with.
    */
  var WindowId: MaintenanceWindowId = js.native
}

object RegisterTargetWithMaintenanceWindowRequest {
  @scala.inline
  def apply(ResourceType: MaintenanceWindowResourceType, Targets: Targets, WindowId: MaintenanceWindowId): RegisterTargetWithMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any], WindowId = WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTargetWithMaintenanceWindowRequest]
  }
  @scala.inline
  implicit class RegisterTargetWithMaintenanceWindowRequestOps[Self <: RegisterTargetWithMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceType(value: MaintenanceWindowResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: Targets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowId(value: MaintenanceWindowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: MaintenanceWindowDescription): Self = {
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
    def withName(value: MaintenanceWindowName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerInformation(value: OwnerInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerInformation")(js.undefined)
        ret
    }
  }
  
}

