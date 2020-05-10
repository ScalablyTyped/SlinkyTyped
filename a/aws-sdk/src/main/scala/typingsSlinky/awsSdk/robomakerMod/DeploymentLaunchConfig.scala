package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentLaunchConfig extends js.Object {
  /**
    * An array of key/value pairs specifying environment variables for the robot application
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
    * The deployment post-launch file. This file will be executed after the launch file.
    */
  var postLaunchFile: js.UndefOr[Path] = js.native
  /**
    * The deployment pre-launch file. This file will be executed prior to the launch file.
    */
  var preLaunchFile: js.UndefOr[Path] = js.native
}

object DeploymentLaunchConfig {
  @scala.inline
  def apply(launchFile: Command, packageName: Command): DeploymentLaunchConfig = {
    val __obj = js.Dynamic.literal(launchFile = launchFile.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentLaunchConfig]
  }
  @scala.inline
  implicit class DeploymentLaunchConfigOps[Self <: DeploymentLaunchConfig] (val x: Self) extends AnyVal {
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
    def withPostLaunchFile(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postLaunchFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostLaunchFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postLaunchFile")(js.undefined)
        ret
    }
    @scala.inline
    def withPreLaunchFile(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preLaunchFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreLaunchFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preLaunchFile")(js.undefined)
        ret
    }
  }
  
}

