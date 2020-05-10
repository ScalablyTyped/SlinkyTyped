package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonAdId
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTagsResource extends js.Object {
  /** Deletes an existing event tag. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets one event tag by ID. */
  def get(request: AnonFields): Request_[EventTag] = js.native
  /** Inserts a new event tag. */
  def insert(request: AnonKey): Request_[EventTag] = js.native
  /** Retrieves a list of event tags, possibly filtered. */
  def list(request: AnonAdId): Request_[EventTagsListResponse] = js.native
  /** Updates an existing event tag. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[EventTag] = js.native
  /** Updates an existing event tag. */
  def update(request: AnonKey): Request_[EventTag] = js.native
}

object EventTagsResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[EventTag],
    insert: AnonKey => Request_[EventTag],
    list: AnonAdId => Request_[EventTagsListResponse],
    patch: AnonFields => Request_[EventTag],
    update: AnonKey => Request_[EventTag]
  ): EventTagsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EventTagsResource]
  }
  @scala.inline
  implicit class EventTagsResourceOps[Self <: EventTagsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[EventTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[EventTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAdId => Request_[EventTagsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[EventTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[EventTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

