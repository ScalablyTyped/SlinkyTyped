package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTaskResponse extends js.Object {
  /**
    * The task that was stopped.
    */
  var task: js.UndefOr[Task] = js.native
}

object StopTaskResponse {
  @scala.inline
  def apply(): StopTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTaskResponse]
  }
  @scala.inline
  implicit class StopTaskResponseOps[Self <: StopTaskResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTask(value: Task): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(js.undefined)
        ret
    }
  }
  
}

