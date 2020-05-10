package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedAlbumOptions extends js.Object {
  /**
    * True if the shared album allows collaborators (users who have joined
    * the album) to add media items to it. Defaults to false.
    */
  var isCollaborative: js.UndefOr[Boolean] = js.native
  /**
    * True if the shared album allows the owner and the collaborators (users
    * who have joined the album) to add comments to the album. Defaults to false.
    */
  var isCommentable: js.UndefOr[Boolean] = js.native
}

object SharedAlbumOptions {
  @scala.inline
  def apply(): SharedAlbumOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedAlbumOptions]
  }
  @scala.inline
  implicit class SharedAlbumOptionsOps[Self <: SharedAlbumOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCollaborative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollaborative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCollaborative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollaborative")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCommentable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCommentable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCommentable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCommentable")(js.undefined)
        ret
    }
  }
  
}

