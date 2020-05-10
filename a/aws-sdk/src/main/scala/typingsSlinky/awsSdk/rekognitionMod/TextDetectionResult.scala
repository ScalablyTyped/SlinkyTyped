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
  def apply(): TextDetectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDetectionResult]
  }
  @scala.inline
  implicit class TextDetectionResultOps[Self <: TextDetectionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextDetection(value: TextDetection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextDetection")(js.undefined)
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

