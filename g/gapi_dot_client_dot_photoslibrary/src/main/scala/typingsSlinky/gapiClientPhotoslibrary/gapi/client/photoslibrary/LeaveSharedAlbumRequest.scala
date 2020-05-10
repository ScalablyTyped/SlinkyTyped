package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaveSharedAlbumRequest extends js.Object {
  /** Token to leave the shared album on behalf of the user. */
  var shareToken: js.UndefOr[String] = js.native
}

object LeaveSharedAlbumRequest {
  @scala.inline
  def apply(): LeaveSharedAlbumRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaveSharedAlbumRequest]
  }
  @scala.inline
  implicit class LeaveSharedAlbumRequestOps[Self <: LeaveSharedAlbumRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShareToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareToken")(js.undefined)
        ret
    }
  }
  
}

