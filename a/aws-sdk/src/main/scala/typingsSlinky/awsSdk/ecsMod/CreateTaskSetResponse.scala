package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTaskSetResponse extends js.Object {
  var taskSet: js.UndefOr[TaskSet] = js.native
}

object CreateTaskSetResponse {
  @scala.inline
  def apply(): CreateTaskSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTaskSetResponse]
  }
  @scala.inline
  implicit class CreateTaskSetResponseOps[Self <: CreateTaskSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskSet(value: TaskSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSet")(js.undefined)
        ret
    }
  }
  
}

