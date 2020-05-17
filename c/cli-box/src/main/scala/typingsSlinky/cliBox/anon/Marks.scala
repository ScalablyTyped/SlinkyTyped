package typingsSlinky.cliBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Marks extends js.Object {
  var marks: typingsSlinky.cliBox.mod.Marks = js.native
}

object Marks {
  @scala.inline
  def apply(marks: typingsSlinky.cliBox.mod.Marks): Marks = {
    val __obj = js.Dynamic.literal(marks = marks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marks]
  }
  @scala.inline
  implicit class MarksOps[Self <: Marks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarks(value: typingsSlinky.cliBox.mod.Marks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

