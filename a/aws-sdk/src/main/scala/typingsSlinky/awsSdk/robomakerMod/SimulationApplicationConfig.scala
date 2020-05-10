package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationApplicationConfig extends js.Object {
  /**
    * The application information for the simulation application.
    */
  var application: Arn = js.native
  /**
    * The version of the simulation application.
    */
  var applicationVersion: js.UndefOr[Version] = js.native
  /**
    * The launch configuration for the simulation application.
    */
  var launchConfig: LaunchConfig = js.native
}

object SimulationApplicationConfig {
  @scala.inline
  def apply(application: Arn, launchConfig: LaunchConfig): SimulationApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], launchConfig = launchConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationApplicationConfig]
  }
  @scala.inline
  implicit class SimulationApplicationConfigOps[Self <: SimulationApplicationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchConfig(value: LaunchConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationVersion")(js.undefined)
        ret
    }
  }
  
}

