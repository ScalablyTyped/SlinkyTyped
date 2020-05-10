package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressDetail extends js.Object {
  /**
    * The current progress status.  Validating  Validating the deployment.  DownloadingExtracting  Downloading and extracting the bundle on the robot.  ExecutingPreLaunch  Executing pre-launch script(s) if provided.  Launching  Launching the robot application.  ExecutingPostLaunch  Executing post-launch script(s) if provided.  Finished  Deployment is complete.  
    */
  var currentProgress: js.UndefOr[RobotDeploymentStep] = js.native
  /**
    * Estimated amount of time in seconds remaining in the step. This currently only applies to the Downloading/Extracting step of the deployment. It is empty for other steps.
    */
  var estimatedTimeRemainingSeconds: js.UndefOr[GenericInteger] = js.native
  /**
    * Precentage of the step that is done. This currently only applies to the Downloading/Extracting step of the deployment. It is empty for other steps.
    */
  var percentDone: js.UndefOr[PercentDone] = js.native
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var targetResource: js.UndefOr[GenericString] = js.native
}

object ProgressDetail {
  @scala.inline
  def apply(): ProgressDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressDetail]
  }
  @scala.inline
  implicit class ProgressDetailOps[Self <: ProgressDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentProgress(value: RobotDeploymentStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedTimeRemainingSeconds(value: GenericInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedTimeRemainingSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedTimeRemainingSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedTimeRemainingSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentDone(value: PercentDone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentDone")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetResource(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResource")(js.undefined)
        ret
    }
  }
  
}

