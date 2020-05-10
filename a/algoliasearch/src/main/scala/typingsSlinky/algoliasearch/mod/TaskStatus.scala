package typingsSlinky.algoliasearch.mod

import typingsSlinky.algoliasearch.algoliasearchStrings.notPublished
import typingsSlinky.algoliasearch.algoliasearchStrings.published
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskStatus extends js.Object {
  var pendingTask: Boolean = js.native
  var status: published | notPublished = js.native
}

object TaskStatus {
  @scala.inline
  def apply(pendingTask: Boolean, status: published | notPublished): TaskStatus = {
    val __obj = js.Dynamic.literal(pendingTask = pendingTask.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStatus]
  }
  @scala.inline
  implicit class TaskStatusOps[Self <: TaskStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPendingTask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: published | notPublished): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

