package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareInfo extends js.Object {
  /**
    * True if the user has joined the album. This is always true for the owner
    * of the shared album.
    */
  var isJoined: js.UndefOr[Boolean] = js.native
  /** True if the user owns the album. */
  var isOwned: js.UndefOr[Boolean] = js.native
  /**
    * A token that can be used by other users to join this shared album via the
    * API.
    */
  var shareToken: js.UndefOr[String] = js.native
  /**
    * A link to the album that's now shared on the Google Photos website and app.
    * Anyone with the link can access this shared album and see all of the items
    * present in the album.
    */
  var shareableUrl: js.UndefOr[String] = js.native
  /** Options that control the sharing of an album. */
  var sharedAlbumOptions: js.UndefOr[SharedAlbumOptions] = js.native
}

object ShareInfo {
  @scala.inline
  def apply(): ShareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareInfo]
  }
  @scala.inline
  implicit class ShareInfoOps[Self <: ShareInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsJoined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJoined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsJoined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJoined")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOwned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOwned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOwned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOwned")(js.undefined)
        ret
    }
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
    @scala.inline
    def withShareableUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareableUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareableUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareableUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedAlbumOptions(value: SharedAlbumOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedAlbumOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedAlbumOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedAlbumOptions")(js.undefined)
        ret
    }
  }
  
}

