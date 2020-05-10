package typingsSlinky.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeletePhotosRequest extends js.Object {
  /**
    * Required. IDs of the Photos. For HTTP
    * GET requests, the URL query parameter should be
    * `photoIds=<id1>&photoIds=<id2>&...`.
    */
  var photoIds: js.UndefOr[js.Array[String]] = js.native
}

object BatchDeletePhotosRequest {
  @scala.inline
  def apply(): BatchDeletePhotosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeletePhotosRequest]
  }
  @scala.inline
  implicit class BatchDeletePhotosRequestOps[Self <: BatchDeletePhotosRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhotoIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotoIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoIds")(js.undefined)
        ret
    }
  }
  
}

