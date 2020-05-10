package typingsSlinky.gapiTranslate.gapi.client.language

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiTranslate.AnonFields
import typingsSlinky.gapiTranslate.GoogleApiTranslateDetectionListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait detections extends js.Object {
  /**
  		 * Detect the language of text.
  		 */
  def list(`object`: AnonFields): HttpRequest[GoogleApiTranslateDetectionListResponse] = js.native
}

object detections {
  @scala.inline
  def apply(list: AnonFields => HttpRequest[GoogleApiTranslateDetectionListResponse]): detections = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[detections]
  }
  @scala.inline
  implicit class detectionsOps[Self <: detections] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonFields => HttpRequest[GoogleApiTranslateDetectionListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

