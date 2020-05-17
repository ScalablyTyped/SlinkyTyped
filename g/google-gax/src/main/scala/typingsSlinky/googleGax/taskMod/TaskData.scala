package typingsSlinky.googleGax.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskData extends js.Object {
  var bytes: Double = js.native
  var callback: TaskCallback = js.native
  var cancelled: js.UndefOr[Boolean] = js.native
  var elements: js.Array[TaskElement] = js.native
}

object TaskData {
  @scala.inline
  def apply(bytes: Double, callback: TaskCallback, elements: js.Array[TaskElement]): TaskData = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskData]
  }
  @scala.inline
  implicit class TaskDataOps[Self <: TaskData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: TaskCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElements(value: js.Array[TaskElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(js.undefined)
        ret
    }
  }
  
}

