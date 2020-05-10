package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfig extends js.Object {
  /**
    * The environment variables for the application launch.
    */
  var environmentVariables: js.UndefOr[EnvironmentVariableMap] = js.native
  /**
    * The launch file name.
    */
  var launchFile: Command = js.native
  /**
    * The package name.
    */
  var packageName: Command = js.native
  /**
    * The port forwarding configuration.
    */
  var portForwardingConfig: js.UndefOr[PortForwardingConfig] = js.native
  /**
    * Boolean indicating whether a streaming session will be configured for the application. If True, AWS RoboMaker will configure a connection so you can interact with your application as it is running in the simulation. You must configure and luanch the component. It must have a graphical user interface. 
    */
  var streamUI: js.UndefOr[Boolean] = js.native
}

object LaunchConfig {
  @scala.inline
  def apply(launchFile: Command, packageName: Command): LaunchConfig = {
    val __obj = js.Dynamic.literal(launchFile = launchFile.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfig]
  }
  @scala.inline
  implicit class LaunchConfigOps[Self <: LaunchConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchFile(value: Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageName(value: Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentVariables(value: EnvironmentVariableMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withPortForwardingConfig(value: PortForwardingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portForwardingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortForwardingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portForwardingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamUI")(js.undefined)
        ret
    }
  }
  
}

