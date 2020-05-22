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
  def apply(ModerationLabel: ModerationLabel = null, Timestamp: js.UndefOr[Timestamp] = js.undefined): ContentModerationDetection = {
    val __obj = js.Dynamic.literal()
    if (ModerationLabel != null) __obj.updateDynamic("ModerationLabel")(ModerationLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(Timestamp)) __obj.updateDynamic("Timestamp")(Timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentModerationDetection]
  }
}

