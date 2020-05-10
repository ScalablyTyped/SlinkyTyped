package typingsSlinky.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadRef extends js.Object {
  /**
    * Required. An upload reference should be unique for each user. It follows
    * the form:
    * "https://streetviewpublish.googleapis.com/media/user/{account_id}/photo/{upload_reference}"
    */
  var uploadUrl: js.UndefOr[String] = js.native
}

object UploadRef {
  @scala.inline
  def apply(): UploadRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadRef]
  }
  @scala.inline
  implicit class UploadRefOps[Self <: UploadRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUploadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadUrl")(js.undefined)
        ret
    }
  }
  
}

