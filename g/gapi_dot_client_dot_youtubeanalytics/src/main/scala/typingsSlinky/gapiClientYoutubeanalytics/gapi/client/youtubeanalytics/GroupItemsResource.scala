package typingsSlinky.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutubeanalytics.AnonAlt
import typingsSlinky.gapiClientYoutubeanalytics.AnonFields
import typingsSlinky.gapiClientYoutubeanalytics.AnonGroupId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupItemsResource extends js.Object {
  /** Removes an item from a group. */
  def delete(request: AnonAlt): Request_[Unit] = js.native
  /** Creates a group item. */
  def insert(request: AnonFields): Request_[GroupItem] = js.native
  /** Returns a collection of group items that match the API request parameters. */
  def list(request: AnonGroupId): Request_[GroupItemListResponse] = js.native
}

object GroupItemsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    insert: AnonFields => Request_[GroupItem],
    list: AnonGroupId => Request_[GroupItemListResponse]
  ): GroupItemsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GroupItemsResource]
  }
  @scala.inline
  implicit class GroupItemsResourceOps[Self <: GroupItemsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonFields => Request_[GroupItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonGroupId => Request_[GroupItemListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

