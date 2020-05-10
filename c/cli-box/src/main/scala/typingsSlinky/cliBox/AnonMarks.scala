package typingsSlinky.cliBox

import typingsSlinky.cliBox.mod.Marks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMarks extends js.Object {
  var marks: Marks = js.native
}

object AnonMarks {
  @scala.inline
  def apply(marks: Marks): AnonMarks = {
    val __obj = js.Dynamic.literal(marks = marks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMarks]
  }
  @scala.inline
  implicit class AnonMarksOps[Self <: AnonMarks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarks(value: Marks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

