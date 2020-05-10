package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentApplicationConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the robot application.
    */
  var application: Arn = js.native
  /**
    * The version of the application.
    */
  var applicationVersion: DeploymentVersion = js.native
  /**
    * The launch configuration.
    */
  var launchConfig: DeploymentLaunchConfig = js.native
}

object DeploymentApplicationConfig {
  @scala.inline
  def apply(application: Arn, applicationVersion: DeploymentVersion, launchConfig: DeploymentLaunchConfig): DeploymentApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], applicationVersion = applicationVersion.asInstanceOf[js.Any], launchConfig = launchConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentApplicationConfig]
  }
  @scala.inline
  implicit class DeploymentApplicationConfigOps[Self <: DeploymentApplicationConfig] (val x: Self) extends AnyVal {
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
    def withApplicationVersion(value: DeploymentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchConfig(value: DeploymentLaunchConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

