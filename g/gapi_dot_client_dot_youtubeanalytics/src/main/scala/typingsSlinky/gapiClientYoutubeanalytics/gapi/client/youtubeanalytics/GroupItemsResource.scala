package typingsSlinky.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutubeanalytics.anon.Alt
import typingsSlinky.gapiClientYoutubeanalytics.anon.Fields
import typingsSlinky.gapiClientYoutubeanalytics.anon.GroupId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupItemsResource extends js.Object {
  /** Removes an item from a group. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Creates a group item. */
  def insert(request: Fields): Request[GroupItem] = js.native
  /** Returns a collection of group items that match the API request parameters. */
  def list(request: GroupId): Request[GroupItemListResponse] = js.native
}

object GroupItemsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    insert: Fields => Request[GroupItem],
    list: GroupId => Request[GroupItemListResponse]
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Alt => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[GroupItem]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: GroupId => Request[GroupItemListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

