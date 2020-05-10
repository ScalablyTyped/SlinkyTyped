package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateDocumentRequest extends js.Object {
  var requests: js.UndefOr[js.Array[Request]] = js.native
  var writeControl: js.UndefOr[WriteControl] = js.native
}

object BatchUpdateDocumentRequest {
  @scala.inline
  def apply(): BatchUpdateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateDocumentRequest]
  }
  @scala.inline
  implicit class BatchUpdateDocumentRequestOps[Self <: BatchUpdateDocumentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequests(value: js.Array[Request]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteControl(value: WriteControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeControl")(js.undefined)
        ret
    }
  }
  
}

