package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfig extends js.Object {
  /**
    * The percentage of robots receiving the deployment at the same time.
    */
  var concurrentDeploymentPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The download condition file.
    */
  var downloadConditionFile: js.UndefOr[S3Object] = js.native
  /**
    * The percentage of deployments that need to fail before stopping deployment.
    */
  var failureThresholdPercentage: js.UndefOr[Percentage] = js.native
  /**
    * The amount of time, in seconds, to wait for deployment to a single robot to complete. Choose a time between 1 minute and 7 days. The default is 5 hours.
    */
  var robotDeploymentTimeoutInSeconds: js.UndefOr[DeploymentTimeout] = js.native
}

object DeploymentConfig {
  @scala.inline
  def apply(): DeploymentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfig]
  }
  @scala.inline
  implicit class DeploymentConfigOps[Self <: DeploymentConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrentDeploymentPercentage(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentDeploymentPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrentDeploymentPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentDeploymentPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadConditionFile(value: S3Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadConditionFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadConditionFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadConditionFile")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureThresholdPercentage(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureThresholdPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureThresholdPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureThresholdPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withRobotDeploymentTimeoutInSeconds(value: DeploymentTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robotDeploymentTimeoutInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRobotDeploymentTimeoutInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robotDeploymentTimeoutInSeconds")(js.undefined)
        ret
    }
  }
  
}

