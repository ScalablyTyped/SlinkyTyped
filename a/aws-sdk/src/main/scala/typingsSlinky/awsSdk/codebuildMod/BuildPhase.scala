package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildPhase extends js.Object {
  /**
    * Additional information about a build phase, especially to help troubleshoot a failed build.
    */
  var contexts: js.UndefOr[PhaseContexts] = js.native
  /**
    * How long, in seconds, between the starting and ending times of the build's phase.
    */
  var durationInSeconds: js.UndefOr[WrapperLong] = js.native
  /**
    * When the build phase ended, expressed in Unix time format.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    * The current status of the build phase. Valid values include:    FAILED: The build phase failed.    FAULT: The build phase faulted.    IN_PROGRESS: The build phase is still in progress.    QUEUED: The build has been submitted and is queued behind other submitted builds.    STOPPED: The build phase stopped.    SUCCEEDED: The build phase succeeded.    TIMED_OUT: The build phase timed out.  
    */
  var phaseStatus: js.UndefOr[StatusType] = js.native
  /**
    * The name of the build phase. Valid values include:    BUILD: Core build activities typically occur in this build phase.    COMPLETED: The build has been completed.    DOWNLOAD_SOURCE: Source code is being downloaded in this build phase.    FINALIZING: The build process is completing in this build phase.    INSTALL: Installation activities typically occur in this build phase.    POST_BUILD: Post-build activities typically occur in this build phase.    PRE_BUILD: Pre-build activities typically occur in this build phase.    PROVISIONING: The build environment is being set up.    QUEUED: The build has been submitted and is queued behind other submitted builds.    SUBMITTED: The build has been submitted.    UPLOAD_ARTIFACTS: Build output artifacts are being uploaded to the output location.  
    */
  var phaseType: js.UndefOr[BuildPhaseType] = js.native
  /**
    * When the build phase started, expressed in Unix time format.
    */
  var startTime: js.UndefOr[js.Date] = js.native
}

object BuildPhase {
  @scala.inline
  def apply(): BuildPhase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildPhase]
  }
  @scala.inline
  implicit class BuildPhaseOps[Self <: BuildPhase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContexts(value: PhaseContexts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationInSeconds(value: WrapperLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPhaseStatus(value: StatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhaseStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPhaseType(value: BuildPhaseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhaseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseType")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

