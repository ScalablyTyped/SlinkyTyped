package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonPart
import typingsSlinky.gapiClientYoutube.AnonPlaylistId
import typingsSlinky.gapiClientYoutube.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistItemsResource extends js.Object {
  /** Deletes a playlist item. */
  def delete(request: AnonPrettyPrint): Request_[Unit] = js.native
  /** Adds a resource to a playlist. */
  def insert(request: AnonPart): Request_[PlaylistItem] = js.native
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or
    * retrieve one or more playlist items by their unique IDs.
    */
  def list(request: AnonPlaylistId): Request_[PlaylistItemListResponse] = js.native
  /** Modifies a playlist item. For example, you could update the item's position in the playlist. */
  def update(request: AnonPart): Request_[PlaylistItem] = js.native
}

object PlaylistItemsResource {
  @scala.inline
  def apply(
    delete: AnonPrettyPrint => Request_[Unit],
    insert: AnonPart => Request_[PlaylistItem],
    list: AnonPlaylistId => Request_[PlaylistItemListResponse],
    update: AnonPart => Request_[PlaylistItem]
  ): PlaylistItemsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlaylistItemsResource]
  }
  @scala.inline
  implicit class PlaylistItemsResourceOps[Self <: PlaylistItemsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonPrettyPrint => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPart => Request_[PlaylistItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPlaylistId => Request_[PlaylistItemListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonPart => Request_[PlaylistItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

