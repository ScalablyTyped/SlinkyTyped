package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the fleet was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The deployment application configuration.
    */
  var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.native
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.native
  /**
    * The failure code of the simulation job if it failed:  BadPermissionError  AWS Greengrass requires a service-level role permission to access other services. The role must include the  AWSGreengrassResourceAccessRolePolicy managed policy.   ExtractingBundleFailure  The robot application could not be extracted from the bundle.  FailureThresholdBreached  The percentage of robots that could not be updated exceeded the percentage set for the deployment.  GreengrassDeploymentFailed  The robot application could not be deployed to the robot.  GreengrassGroupVersionDoesNotExist  The AWS Greengrass group or version associated with a robot is missing.  InternalServerError  An internal error has occurred. Retry your request, but if the problem persists, contact us with details.  MissingRobotApplicationArchitecture  The robot application does not have a source that matches the architecture of the robot.  MissingRobotDeploymentResource  One or more of the resources specified for the robot application are missing. For example, does the robot application have the correct launch package and launch file?  PostLaunchFileFailure  The post-launch script failed.  PreLaunchFileFailure  The pre-launch script failed.  ResourceNotFound  One or more deployment resources are missing. For example, do robot application source bundles still exist?   RobotDeploymentNoResponse  There is no response from the robot. It might not be powered on or connected to the internet.  
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.native
  /**
    * The failure reason of the deployment job if it failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  /**
    * The target fleet for the deployment job.
    */
  var fleet: js.UndefOr[Arn] = js.native
  /**
    * The status of the deployment job.
    */
  var status: js.UndefOr[DeploymentStatus] = js.native
  /**
    * The list of all tags added to the deployment job.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateDeploymentJobResponse {
  @scala.inline
  def apply(): CreateDeploymentJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentJobResponse]
  }
  @scala.inline
  implicit class CreateDeploymentJobResponseOps[Self <: CreateDeploymentJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentApplicationConfigs(value: DeploymentApplicationConfigs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentApplicationConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentApplicationConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentApplicationConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentConfig(value: DeploymentConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureCode(value: DeploymentJobErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withFleet(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleet")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DeploymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

