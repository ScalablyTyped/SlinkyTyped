package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistId extends js.Object {
  /**
    * The value that YouTube uses to uniquely identify the playlist.
    */
  var playlistId: String = js.native
  /**
    * The value that YouTube uses to uniquely identify the item in the playlist.
    */
  var playlistItemId: String = js.native
  /**
    *  The resourceId object contains information that identifies the resource that was added to the playlist.
    */
  var resourceId: Kind = js.native
}

object PlaylistId {
  @scala.inline
  def apply(playlistId: String, playlistItemId: String, resourceId: Kind): PlaylistId = {
    val __obj = js.Dynamic.literal(playlistId = playlistId.asInstanceOf[js.Any], playlistItemId = playlistItemId.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistId]
  }
  @scala.inline
  implicit class PlaylistIdOps[Self <: PlaylistId] (val x: Self) extends AnyVal {
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
    def withPlaylistItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: Kind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

