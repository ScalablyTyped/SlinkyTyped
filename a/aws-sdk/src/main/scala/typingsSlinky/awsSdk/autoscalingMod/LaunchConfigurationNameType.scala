package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfigurationNameType extends js.Object {
  /**
    * The name of the launch configuration.
    */
  var LaunchConfigurationName: ResourceName = js.native
}

object LaunchConfigurationNameType {
  @scala.inline
  def apply(LaunchConfigurationName: ResourceName): LaunchConfigurationNameType = {
    val __obj = js.Dynamic.literal(LaunchConfigurationName = LaunchConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationNameType]
  }
  @scala.inline
  implicit class LaunchConfigurationNameTypeOps[Self <: LaunchConfigurationNameType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchConfigurationName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchConfigurationName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

