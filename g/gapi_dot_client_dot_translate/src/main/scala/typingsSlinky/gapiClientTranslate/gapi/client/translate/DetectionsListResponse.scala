package typingsSlinky.gapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectionsListResponse extends js.Object {
  /** A detections contains detection results of several text */
  var detections: js.UndefOr[js.Array[_]] = js.native
}

object DetectionsListResponse {
  @scala.inline
  def apply(): DetectionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectionsListResponse]
  }
  @scala.inline
  implicit class DetectionsListResponseOps[Self <: DetectionsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetections(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detections")(js.undefined)
        ret
    }
  }
  
}

