package typingsSlinky.gapiClientTaskqueue.gapi.client.taskqueue

import typingsSlinky.gapiClientTaskqueue.anon.AdminEmails
import typingsSlinky.gapiClientTaskqueue.anon.LeasedLastHour
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskQueue extends js.Object {
  /** ACLs that are applicable to this TaskQueue object. */
  var acl: js.UndefOr[AdminEmails] = js.native
  /** Name of the taskqueue. */
  var id: js.UndefOr[String] = js.native
  /** The kind of REST object returned, in this case taskqueue. */
  var kind: js.UndefOr[String] = js.native
  /** The number of times we should lease out tasks before giving up on them. If unset we lease them out forever until a worker deletes the task. */
  var maxLeases: js.UndefOr[Double] = js.native
  /** Statistics for the TaskQueue object in question. */
  var stats: js.UndefOr[LeasedLastHour] = js.native
}

object TaskQueue {
  @scala.inline
  def apply(): TaskQueue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskQueue]
  }
  @scala.inline
  implicit class TaskQueueOps[Self <: TaskQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcl(value: AdminEmails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLeases(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLeases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLeases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLeases")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: LeasedLastHour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
  }
  
}

