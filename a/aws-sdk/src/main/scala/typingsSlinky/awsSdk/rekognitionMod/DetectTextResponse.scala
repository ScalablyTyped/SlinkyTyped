package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectTextResponse extends js.Object {
  /**
    * An array of text that was detected in the input image.
    */
  var TextDetections: js.UndefOr[TextDetectionList] = js.native
  /**
    * The model version used to detect text.
    */
  var TextModelVersion: js.UndefOr[String] = js.native
}

object DetectTextResponse {
  @scala.inline
  def apply(): DetectTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectTextResponse]
  }
  @scala.inline
  implicit class DetectTextResponseOps[Self <: DetectTextResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextDetections(value: TextDetectionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextDetections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDetections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextDetections")(js.undefined)
        ret
    }
    @scala.inline
    def withTextModelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextModelVersion")(js.undefined)
        ret
    }
  }
  
}

