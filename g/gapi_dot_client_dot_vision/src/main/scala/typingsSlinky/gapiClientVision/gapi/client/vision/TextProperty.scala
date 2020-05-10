package typingsSlinky.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextProperty extends js.Object {
  /** Detected start or end of a text segment. */
  var detectedBreak: js.UndefOr[DetectedBreak] = js.native
  /** A list of detected languages together with confidence. */
  var detectedLanguages: js.UndefOr[js.Array[DetectedLanguage]] = js.native
}

object TextProperty {
  @scala.inline
  def apply(): TextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProperty]
  }
  @scala.inline
  implicit class TextPropertyOps[Self <: TextProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectedBreak(value: DetectedBreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectedLanguages(value: js.Array[DetectedLanguage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedLanguages")(js.undefined)
        ret
    }
  }
  
}

