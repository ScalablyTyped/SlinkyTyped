package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.AnonId
import typingsSlinky.gapiYoutube.AnonMine
import typingsSlinky.gapiYoutube.AnonPart
import typingsSlinky.gapiYoutube.GoogleApiYouTubePaginationInfo
import typingsSlinky.gapiYoutube.GoogleApiYouTubePlaylistResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait playlists extends js.Object {
  /**
    * Deletes a playlist.
    */
  def delete(`object`: AnonId): HttpRequest[GoogleApiYouTubePlaylistResource] = js.native
  /**
    * Creates a playlist.
    */
  def insert(`object`: AnonPart): HttpRequest[GoogleApiYouTubePlaylistResource] = js.native
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
    */
  def list(`object`: AnonMine): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]] = js.native
  /**
    * Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
    */
  def update(`object`: AnonPart): HttpRequest[GoogleApiYouTubePlaylistResource] = js.native
}

object playlists {
  @scala.inline
  def apply(
    delete: AnonId => HttpRequest[GoogleApiYouTubePlaylistResource],
    insert: AnonPart => HttpRequest[GoogleApiYouTubePlaylistResource],
    list: AnonMine => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]],
    update: AnonPart => HttpRequest[GoogleApiYouTubePlaylistResource]
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
    def withDelete(value: AnonId => HttpRequest[GoogleApiYouTubePlaylistResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPart => HttpRequest[GoogleApiYouTubePlaylistResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMine => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonPart => HttpRequest[GoogleApiYouTubePlaylistResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

