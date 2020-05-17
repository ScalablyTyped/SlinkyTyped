package typingsSlinky.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadId extends js.Object {
  var uploadId: String = js.native
}

object UploadId {
  @scala.inline
  def apply(uploadId: String): UploadId = {
    val __obj = js.Dynamic.literal(uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadId]
  }
  @scala.inline
  implicit class UploadIdOps[Self <: UploadId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUploadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

