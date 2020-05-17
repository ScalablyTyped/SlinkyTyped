package typingsSlinky.gapiClientTaskqueue.gapi.client.taskqueue

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTaskqueue.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskqueuesResource extends js.Object {
  /** Get detailed information about a TaskQueue. */
  def get(request: Alt): Request[TaskQueue] = js.native
}

object TaskqueuesResource {
  @scala.inline
  def apply(get: Alt => Request[TaskQueue]): TaskqueuesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[TaskqueuesResource]
  }
  @scala.inline
  implicit class TaskqueuesResourceOps[Self <: TaskqueuesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Alt => Request[TaskQueue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

