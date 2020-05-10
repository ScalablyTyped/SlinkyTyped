package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentModerationDetection extends js.Object {
  /**
    * The unsafe content label detected by in the stored video.
    */
  var ModerationLabel: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ModerationLabel] = js.native
  /**
    * Time, in milliseconds from the beginning of the video, that the unsafe content label was detected.
    */
  var Timestamp: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Timestamp] = js.native
}

object ContentModerationDetection {
  @scala.inline
  def apply(): ContentModerationDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentModerationDetection]
  }
  @scala.inline
  implicit class ContentModerationDetectionOps[Self <: ContentModerationDetection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModerationLabel(value: ModerationLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModerationLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModerationLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModerationLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
        ret
    }
  }
  
}

