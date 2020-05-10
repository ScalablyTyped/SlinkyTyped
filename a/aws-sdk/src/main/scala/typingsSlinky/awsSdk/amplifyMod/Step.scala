package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Step extends js.Object {
  /**
    *  URL to the artifact for the execution step. 
    */
  var artifactsUrl: js.UndefOr[ArtifactsUrl] = js.native
  /**
    *  The context for current step, will include build image if step is build. 
    */
  var context: js.UndefOr[Context] = js.native
  /**
    *  End date/ time of the execution step. 
    */
  var endTime: js.Date = js.native
  /**
    *  URL to the logs for the execution step. 
    */
  var logUrl: js.UndefOr[LogUrl] = js.native
  /**
    *  List of screenshot URLs for the execution step, if relevant. 
    */
  var screenshots: js.UndefOr[Screenshots] = js.native
  /**
    *  Start date/ time of the execution step. 
    */
  var startTime: js.Date = js.native
  /**
    *  Status of the execution step. 
    */
  var status: JobStatus = js.native
  /**
    *  The reason for current step status. 
    */
  var statusReason: js.UndefOr[StatusReason] = js.native
  /**
    *  Name of the execution step. 
    */
  var stepName: StepName = js.native
  /**
    *  URL to the test artifact for the execution step. 
    */
  var testArtifactsUrl: js.UndefOr[TestArtifactsUrl] = js.native
  /**
    *  URL to the test config for the execution step. 
    */
  var testConfigUrl: js.UndefOr[TestConfigUrl] = js.native
}

object Step {
  @scala.inline
  def apply(endTime: js.Date, startTime: js.Date, status: JobStatus, stepName: StepName): Step = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  @scala.inline
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: JobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepName(value: StepName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactsUrl(value: ArtifactsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withLogUrl(value: LogUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenshots(value: Screenshots): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenshots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshots")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusReason(value: StatusReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReason")(js.undefined)
        ret
    }
    @scala.inline
    def withTestArtifactsUrl(value: TestArtifactsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testArtifactsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestArtifactsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testArtifactsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTestConfigUrl(value: TestConfigUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testConfigUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestConfigUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testConfigUrl")(js.undefined)
        ret
    }
  }
  
}

