package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinSharedAlbumRequest extends js.Object {
  /** Token to join the shared album on behalf of the user. */
  var shareToken: js.UndefOr[String] = js.native
}

object JoinSharedAlbumRequest {
  @scala.inline
  def apply(): JoinSharedAlbumRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoinSharedAlbumRequest]
  }
  @scala.inline
  implicit class JoinSharedAlbumRequestOps[Self <: JoinSharedAlbumRequest] (val x: Self) extends AnyVal {
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

