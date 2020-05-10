package typingsSlinky.gapiClientTaskqueue.gapi.client.taskqueue

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientTaskqueue.AnonFields
import typingsSlinky.gapiClientTaskqueue.AnonGroupByTag
import typingsSlinky.gapiClientTaskqueue.AnonKey
import typingsSlinky.gapiClientTaskqueue.AnonNewLeaseSeconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasksResource extends js.Object {
  /** Delete a task from a TaskQueue. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Get a particular task from a TaskQueue. */
  def get(request: AnonFields): Request_[Task] = js.native
  /** Insert a new task in a TaskQueue */
  def insert(request: AnonKey): Request_[Task] = js.native
  /** Lease 1 or more tasks from a TaskQueue. */
  def lease(request: AnonGroupByTag): Request_[Tasks] = js.native
  /** List Tasks in a TaskQueue */
  def list(request: AnonKey): Request_[Tasks2] = js.native
  /** Update tasks that are leased out of a TaskQueue. This method supports patch semantics. */
  def patch(request: AnonNewLeaseSeconds): Request_[Task] = js.native
  /** Update tasks that are leased out of a TaskQueue. */
  def update(request: AnonNewLeaseSeconds): Request_[Task] = js.native
}

object TasksResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Task],
    insert: AnonKey => Request_[Task],
    lease: AnonGroupByTag => Request_[Tasks],
    list: AnonKey => Request_[Tasks2],
    patch: AnonNewLeaseSeconds => Request_[Task],
    update: AnonNewLeaseSeconds => Request_[Task]
  ): TasksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), lease = js.Any.fromFunction1(lease), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TasksResource]
  }
  @scala.inline
  implicit class TasksResourceOps[Self <: TasksResource] (val x: Self) extends AnyVal {
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
    def withGet(value: AnonFields => Request_[Task]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[Task]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLease(value: AnonGroupByTag => Request_[Tasks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[Tasks2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonNewLeaseSeconds => Request_[Task]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonNewLeaseSeconds => Request_[Task]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

