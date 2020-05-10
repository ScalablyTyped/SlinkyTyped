package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGmail.AnonFields
import typingsSlinky.gapiClientGmail.AnonKey
import typingsSlinky.gapiClientGmail.AnonLabelIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadsResource extends js.Object {
  /** Immediately and permanently deletes the specified thread. This operation cannot be undone. Prefer threads.trash instead. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets the specified thread. */
  def get(request: AnonKey): Request_[Thread] = js.native
  /** Lists the threads in the user's mailbox. */
  def list(request: AnonLabelIds): Request_[ListThreadsResponse] = js.native
  /** Modifies the labels applied to the thread. This applies to all messages in the thread. */
  def modify(request: AnonFields): Request_[Thread] = js.native
  /** Moves the specified thread to the trash. */
  def trash(request: AnonFields): Request_[Thread] = js.native
  /** Removes the specified thread from the trash. */
  def untrash(request: AnonFields): Request_[Thread] = js.native
}

object ThreadsResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonKey => Request_[Thread],
    list: AnonLabelIds => Request_[ListThreadsResponse],
    modify: AnonFields => Request_[Thread],
    trash: AnonFields => Request_[Thread],
    untrash: AnonFields => Request_[Thread]
  ): ThreadsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), modify = js.Any.fromFunction1(modify), trash = js.Any.fromFunction1(trash), untrash = js.Any.fromFunction1(untrash))
    __obj.asInstanceOf[ThreadsResource]
  }
  @scala.inline
  implicit class ThreadsResourceOps[Self <: ThreadsResource] (val x: Self) extends AnyVal {
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
    def withGet(value: AnonKey => Request_[Thread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonLabelIds => Request_[ListThreadsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withModify(value: AnonFields => Request_[Thread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrash(value: AnonFields => Request_[Thread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trash")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUntrash(value: AnonFields => Request_[Thread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untrash")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

