package typingsSlinky.angularCommon.httpHttpMod

import typingsSlinky.angularCommon.httpHttpMod.HttpEventType.UploadProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpUploadProgressEvent extends HttpProgressEvent {
  @JSName("type")
  var type_HttpUploadProgressEvent: UploadProgress = js.native
}

object HttpUploadProgressEvent {
  @scala.inline
  def apply(loaded: Double, `type`: UploadProgress): HttpUploadProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUploadProgressEvent]
  }
  @scala.inline
  implicit class HttpUploadProgressEventOps[Self <: HttpUploadProgressEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: UploadProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

