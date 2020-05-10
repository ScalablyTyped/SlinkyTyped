package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeploymentJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the deployment job was created.
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
    * The deployment job failure code.
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.native
  /**
    * A short description of the reason why the deployment job failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: js.UndefOr[Arn] = js.native
  /**
    * A list of robot deployment summaries.
    */
  var robotDeploymentSummary: js.UndefOr[RobotDeploymentSummary] = js.native
  /**
    * The status of the deployment job.
    */
  var status: js.UndefOr[DeploymentStatus] = js.native
  /**
    * The list of all tags added to the specified deployment job.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object DescribeDeploymentJobResponse {
  @scala.inline
  def apply(): DescribeDeploymentJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeploymentJobResponse]
  }
  @scala.inline
  implicit class DescribeDeploymentJobResponseOps[Self <: DescribeDeploymentJobResponse] (val x: Self) extends AnyVal {
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
    def withRobotDeploymentSummary(value: RobotDeploymentSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robotDeploymentSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRobotDeploymentSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robotDeploymentSummary")(js.undefined)
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

