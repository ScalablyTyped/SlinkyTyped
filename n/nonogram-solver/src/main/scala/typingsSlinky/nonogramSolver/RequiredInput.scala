package typingsSlinky.nonogramSolver

import typingsSlinky.nonogramSolver.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<nonogram-solver.nonogram-solver.Input> */
@js.native
trait RequiredInput extends js.Object {
  var columns: js.Array[js.Array[Double]] = js.native
  var content: js.Array[State] = js.native
  var rows: js.Array[js.Array[Double]] = js.native
}

object RequiredInput {
  @scala.inline
  def apply(columns: js.Array[js.Array[Double]], content: js.Array[State], rows: js.Array[js.Array[Double]]): RequiredInput = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredInput]
  }
  @scala.inline
  implicit class RequiredInputOps[Self <: RequiredInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: js.Array[State]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

