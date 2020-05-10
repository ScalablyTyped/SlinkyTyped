package typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadLineItemsResponse extends js.Object {
  /** Status of upload. */
  var uploadStatus: js.UndefOr[UploadStatus] = js.native
}

object UploadLineItemsResponse {
  @scala.inline
  def apply(): UploadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadLineItemsResponse]
  }
  @scala.inline
  implicit class UploadLineItemsResponseOps[Self <: UploadLineItemsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUploadStatus(value: UploadStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadStatus")(js.undefined)
        ret
    }
  }
  
}

