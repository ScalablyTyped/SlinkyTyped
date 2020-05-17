package typingsSlinky.gapiClientTaskqueue.gapi.client.taskqueue

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTaskqueue.anon.Fields
import typingsSlinky.gapiClientTaskqueue.anon.GroupByTag
import typingsSlinky.gapiClientTaskqueue.anon.Key
import typingsSlinky.gapiClientTaskqueue.anon.NewLeaseSeconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasksResource extends js.Object {
  /** Delete a task from a TaskQueue. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Get a particular task from a TaskQueue. */
  def get(request: Fields): Request[Task] = js.native
  /** Insert a new task in a TaskQueue */
  def insert(request: Key): Request[Task] = js.native
  /** Lease 1 or more tasks from a TaskQueue. */
  def lease(request: GroupByTag): Request[Tasks] = js.native
  /** List Tasks in a TaskQueue */
  def list(request: Key): Request[Tasks2] = js.native
  /** Update tasks that are leased out of a TaskQueue. This method supports patch semantics. */
  def patch(request: NewLeaseSeconds): Request[Task] = js.native
  /** Update tasks that are leased out of a TaskQueue. */
  def update(request: NewLeaseSeconds): Request[Task] = js.native
}

object TasksResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Fields => Request[Task],
    insert: Key => Request[Task],
    lease: GroupByTag => Request[Tasks],
    list: Key => Request[Tasks2],
    patch: NewLeaseSeconds => Request[Task],
    update: NewLeaseSeconds => Request[Task]
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
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[Task]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[Task]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLease(value: GroupByTag => Request[Tasks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[Tasks2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: NewLeaseSeconds => Request[Task]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: NewLeaseSeconds => Request[Task]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

