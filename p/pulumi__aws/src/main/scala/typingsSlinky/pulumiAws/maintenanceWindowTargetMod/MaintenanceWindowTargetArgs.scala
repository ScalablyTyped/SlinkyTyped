package typingsSlinky.pulumiAws.maintenanceWindowTargetMod

import typingsSlinky.pulumiAws.inputMod.ssm.MaintenanceWindowTargetTarget
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTargetArgs extends js.Object {
  /**
    * The description of the maintenance window target.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the maintenance window target.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
    */
  val ownerInformation: js.UndefOr[Input[String]] = js.native
  /**
    * The type of target being registered with the Maintenance Window. Possible values `INSTANCE`.
    */
  val resourceType: Input[String] = js.native
  /**
    * The targets (either instances or tags). Instances are specified using Key=InstanceIds,Values=InstanceId1,InstanceId2. Tags are specified using Key=tag name,Values=tag value.
    */
  val targets: Input[js.Array[Input[MaintenanceWindowTargetTarget]]] = js.native
  /**
    * The Id of the maintenance window to register the target with.
    */
  val windowId: Input[String] = js.native
}

object MaintenanceWindowTargetArgs {
  @scala.inline
  def apply(
    resourceType: Input[String],
    targets: Input[js.Array[Input[MaintenanceWindowTargetTarget]]],
    windowId: Input[String]
  ): MaintenanceWindowTargetArgs = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTargetArgs]
  }
  @scala.inline
  implicit class MaintenanceWindowTargetArgsOps[Self <: MaintenanceWindowTargetArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: Input[js.Array[Input[MaintenanceWindowTargetTarget]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerInformation(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerInformation")(js.undefined)
        ret
    }
  }
  
}

