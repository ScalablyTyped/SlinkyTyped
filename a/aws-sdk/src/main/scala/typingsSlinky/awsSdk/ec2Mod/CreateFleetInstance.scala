package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetInstance extends js.Object {
  /**
    * The IDs of the instances.
    */
  var InstanceIds: js.UndefOr[InstanceIdsSet] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * The launch templates and overrides that were used for launching the instances. The values that you specify in the Overrides replace the values in the launch template.
    */
  var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse] = js.native
  /**
    * Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
    */
  var Lifecycle: js.UndefOr[InstanceLifecycle] = js.native
  /**
    * The value is Windows for Windows instances. Otherwise, the value is blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.native
}

object CreateFleetInstance {
  @scala.inline
  def apply(): CreateFleetInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetInstance]
  }
  @scala.inline
  implicit class CreateFleetInstanceOps[Self <: CreateFleetInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceIds(value: InstanceIdsSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplateAndOverrides(value: LaunchTemplateAndOverridesResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateAndOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplateAndOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateAndOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycle(value: InstanceLifecycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lifecycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lifecycle")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: PlatformValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(js.undefined)
        ret
    }
  }
  
}

