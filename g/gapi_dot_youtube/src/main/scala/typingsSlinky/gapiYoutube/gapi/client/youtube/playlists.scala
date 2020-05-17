package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.GoogleApiYouTubePaginationInfo
import typingsSlinky.gapiYoutube.GoogleApiYouTubePlaylistResource
import typingsSlinky.gapiYoutube.anon.Id
import typingsSlinky.gapiYoutube.anon.Mine
import typingsSlinky.gapiYoutube.anon.Part
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait playlists extends js.Object {
  /**
    * Deletes a playlist.
    */
  def delete(`object`: Id): HttpRequest[GoogleApiYouTubePlaylistResource] = js.native
  /**
    * Creates a playlist.
    */
  def insert(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistResource] = js.native
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
    */
  def list(`object`: Mine): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]] = js.native
  /**
    * Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
    */
  def update(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistResource] = js.native
}

object playlists {
  @scala.inline
  def apply(
    delete: Id => HttpRequest[GoogleApiYouTubePlaylistResource],
    insert: Part => HttpRequest[GoogleApiYouTubePlaylistResource],
    list: Mine => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]],
    update: Part => HttpRequest[GoogleApiYouTubePlaylistResource]
  ): playlists = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[playlists]
  }
  @scala.inline
  implicit class playlistsOps[Self <: playlists] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Id => HttpRequest[GoogleApiYouTubePlaylistResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Part => HttpRequest[GoogleApiYouTubePlaylistResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Mine => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Part => HttpRequest[GoogleApiYouTubePlaylistResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

