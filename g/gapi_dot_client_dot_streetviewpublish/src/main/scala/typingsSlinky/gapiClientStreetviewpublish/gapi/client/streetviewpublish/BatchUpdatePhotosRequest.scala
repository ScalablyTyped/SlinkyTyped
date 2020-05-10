package typingsSlinky.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdatePhotosRequest extends js.Object {
  /**
    * Required. List of
    * UpdatePhotoRequests.
    */
  var updatePhotoRequests: js.UndefOr[js.Array[UpdatePhotoRequest]] = js.native
}

object BatchUpdatePhotosRequest {
  @scala.inline
  def apply(): BatchUpdatePhotosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdatePhotosRequest]
  }
  @scala.inline
  implicit class BatchUpdatePhotosRequestOps[Self <: BatchUpdatePhotosRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdatePhotoRequests(value: js.Array[UpdatePhotoRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePhotoRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatePhotoRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePhotoRequests")(js.undefined)
        ret
    }
  }
  
}

