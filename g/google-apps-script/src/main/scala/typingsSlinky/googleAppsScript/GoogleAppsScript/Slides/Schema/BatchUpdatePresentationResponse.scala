package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdatePresentationResponse extends js.Object {
  var presentationId: js.UndefOr[String] = js.native
  var replies: js.UndefOr[js.Array[Response]] = js.native
  var writeControl: js.UndefOr[WriteControl] = js.native
}

object BatchUpdatePresentationResponse {
  @scala.inline
  def apply(): BatchUpdatePresentationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdatePresentationResponse]
  }
  @scala.inline
  implicit class BatchUpdatePresentationResponseOps[Self <: BatchUpdatePresentationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPresentationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationId")(js.undefined)
        ret
    }
    @scala.inline
    def withReplies(value: js.Array[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(js.undefined)
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

