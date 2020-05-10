package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RobotDeployment extends js.Object {
  /**
    * The robot deployment Amazon Resource Name (ARN).
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the deployment finished.
    */
  var deploymentFinishTime: js.UndefOr[js.Date] = js.native
  /**
    * The time, in milliseconds since the epoch, when the deployment was started.
    */
  var deploymentStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The robot deployment failure code.
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.native
  /**
    * A short description of the reason why the robot deployment failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  /**
    * Information about how the deployment is progressing.
    */
  var progressDetail: js.UndefOr[ProgressDetail] = js.native
  /**
    * The status of the robot deployment.
    */
  var status: js.UndefOr[RobotStatus] = js.native
}

object RobotDeployment {
  @scala.inline
  def apply(): RobotDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RobotDeployment]
  }
  @scala.inline
  implicit class RobotDeploymentOps[Self <: RobotDeployment] (val x: Self) extends AnyVal {
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
    def withDeploymentFinishTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentFinishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentFinishTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentFinishTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentStartTime")(js.undefined)
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
    def withProgressDetail(value: ProgressDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: RobotStatus): Self = {
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
  }
  
}

