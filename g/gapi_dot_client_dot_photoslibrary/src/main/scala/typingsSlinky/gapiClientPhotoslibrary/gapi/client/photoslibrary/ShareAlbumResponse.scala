package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareAlbumResponse extends js.Object {
  /** Output only. Information about the shared album. */
  var shareInfo: js.UndefOr[ShareInfo] = js.native
}

object ShareAlbumResponse {
  @scala.inline
  def apply(): ShareAlbumResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareAlbumResponse]
  }
  @scala.inline
  implicit class ShareAlbumResponseOps[Self <: ShareAlbumResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShareInfo(value: ShareInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareInfo")(js.undefined)
        ret
    }
  }
  
}

