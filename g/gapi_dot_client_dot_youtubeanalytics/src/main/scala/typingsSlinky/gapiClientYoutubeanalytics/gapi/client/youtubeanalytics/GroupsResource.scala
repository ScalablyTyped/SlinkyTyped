package typingsSlinky.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutubeanalytics.AnonAlt
import typingsSlinky.gapiClientYoutubeanalytics.AnonFields
import typingsSlinky.gapiClientYoutubeanalytics.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsResource extends js.Object {
  /** Deletes a group. */
  def delete(request: AnonAlt): Request_[Unit] = js.native
  /** Creates a group. */
  def insert(request: AnonFields): Request_[Group] = js.native
  /**
    * Returns a collection of groups that match the API request parameters. For example, you can retrieve all groups that the authenticated user owns, or you
    * can retrieve one or more groups by their unique IDs.
    */
  def list(request: AnonKey): Request_[GroupListResponse] = js.native
  /** Modifies a group. For example, you could change a group's title. */
  def update(request: AnonFields): Request_[Group] = js.native
}

object GroupsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    insert: AnonFields => Request_[Group],
    list: AnonKey => Request_[GroupListResponse],
    update: AnonFields => Request_[Group]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[GroupsResource]
  }
  @scala.inline
  implicit class GroupsResourceOps[Self <: GroupsResource] (val x: Self) extends AnyVal {
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
    def withInsert(value: AnonFields => Request_[Group]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[GroupListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFields => Request_[Group]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

