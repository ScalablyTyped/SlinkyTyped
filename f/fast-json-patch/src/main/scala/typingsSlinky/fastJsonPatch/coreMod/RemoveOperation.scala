package typingsSlinky.fastJsonPatch.coreMod

import typingsSlinky.fastJsonPatch.fastJsonPatchStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveOperation
  extends BaseOperation
     with Operation {
  var op: remove = js.native
}

object RemoveOperation {
  @scala.inline
  def apply(op: remove, path: String): RemoveOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveOperation]
  }
  @scala.inline
  implicit class RemoveOperationOps[Self <: RemoveOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOp(value: remove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

