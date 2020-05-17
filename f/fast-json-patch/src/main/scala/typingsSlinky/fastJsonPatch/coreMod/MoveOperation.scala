package typingsSlinky.fastJsonPatch.coreMod

import typingsSlinky.fastJsonPatch.fastJsonPatchStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveOperation
  extends BaseOperation
     with Operation {
  var from: String = js.native
  var op: move = js.native
}

object MoveOperation {
  @scala.inline
  def apply(from: String, op: move, path: String): MoveOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveOperation]
  }
  @scala.inline
  implicit class MoveOperationOps[Self <: MoveOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp(value: move): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

