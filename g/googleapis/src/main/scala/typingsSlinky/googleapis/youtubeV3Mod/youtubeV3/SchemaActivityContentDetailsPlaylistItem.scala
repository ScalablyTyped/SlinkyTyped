package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a new playlist item.
  */
@js.native
trait SchemaActivityContentDetailsPlaylistItem extends js.Object {
  /**
    * The value that YouTube uses to uniquely identify the playlist.
    */
  var playlistId: js.UndefOr[String] = js.native
  /**
    * ID of the item within the playlist.
    */
  var playlistItemId: js.UndefOr[String] = js.native
  /**
    * The resourceId object contains information about the resource that was
    * added to the playlist.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}

object SchemaActivityContentDetailsPlaylistItem {
  @scala.inline
  def apply(): SchemaActivityContentDetailsPlaylistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsPlaylistItem]
  }
  @scala.inline
  implicit class SchemaActivityContentDetailsPlaylistItemOps[Self <: SchemaActivityContentDetailsPlaylistItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaylistId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylistId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaylistItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylistItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: SchemaResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
        ret
    }
  }
  
}

