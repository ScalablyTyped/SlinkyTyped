package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectModerationLabelsResponse extends js.Object {
  /**
    * Shows the results of the human in the loop evaluation.
    */
  var HumanLoopActivationOutput: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.HumanLoopActivationOutput] = js.native
  /**
    * Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were detected.
    */
  var ModerationLabels: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ModerationLabels] = js.native
  /**
    * Version number of the moderation detection model that was used to detect unsafe content.
    */
  var ModerationModelVersion: js.UndefOr[String] = js.native
}

object DetectModerationLabelsResponse {
  @scala.inline
  def apply(): DetectModerationLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectModerationLabelsResponse]
  }
  @scala.inline
  implicit class DetectModerationLabelsResponseOps[Self <: DetectModerationLabelsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHumanLoopActivationOutput(value: HumanLoopActivationOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopActivationOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanLoopActivationOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopActivationOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withModerationLabels(value: ModerationLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModerationLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModerationLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModerationLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withModerationModelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModerationModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModerationModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModerationModelVersion")(js.undefined)
        ret
    }
  }
  
}

