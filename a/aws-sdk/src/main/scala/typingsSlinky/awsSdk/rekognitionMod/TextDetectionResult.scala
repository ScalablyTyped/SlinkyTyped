package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDetectionResult extends js.Object {
  /**
    * Details about text detected in a video.
    */
  var TextDetection: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.TextDetection] = js.native
  /**
    * The time, in milliseconds from the start of the video, that the text was detected.
    */
  var Timestamp: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Timestamp] = js.native
}

object TextDetectionResult {
  @scala.inline
  def apply(TextDetection: TextDetection = null, Timestamp: js.UndefOr[Timestamp] = js.undefined): TextDetectionResult = {
    val __obj = js.Dynamic.literal()
    if (TextDetection != null) __obj.updateDynamic("TextDetection")(TextDetection.asInstanceOf[js.Any])
    if (!js.isUndefined(Timestamp)) __obj.updateDynamic("Timestamp")(Timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDetectionResult]
  }
}

