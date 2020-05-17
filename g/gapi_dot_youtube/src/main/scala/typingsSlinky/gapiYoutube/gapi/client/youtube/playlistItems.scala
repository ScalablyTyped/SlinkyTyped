package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.GoogleApiYouTubePaginationInfo
import typingsSlinky.gapiYoutube.GoogleApiYouTubePlaylistItemResource
import typingsSlinky.gapiYoutube.anon.Id
import typingsSlinky.gapiYoutube.anon.MaxResults
import typingsSlinky.gapiYoutube.anon.Part
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait playlistItems extends js.Object {
  /**
    * Deletes a playlist item.
    */
  def delete(`object`: Id): HttpRequest[GoogleApiYouTubePlaylistItemResource] = js.native
  /**
    * Adds a resource to a playlist.
    */
  def insert(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistItemResource] = js.native
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
    */
  def list(`object`: MaxResults): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]] = js.native
  /**
    * Modifies a playlist item. For example, you could update the item's position in the playlist.
    */
  def update(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistItemResource] = js.native
}

object playlistItems {
  @scala.inline
  def apply(
    delete: Id => HttpRequest[GoogleApiYouTubePlaylistItemResource],
    insert: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource],
    list: MaxResults => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]],
    update: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource]
  ): playlistItems = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[playlistItems]
  }
  @scala.inline
  implicit class playlistItemsOps[Self <: playlistItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Id => HttpRequest[GoogleApiYouTubePlaylistItemResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(
      value: MaxResults => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

