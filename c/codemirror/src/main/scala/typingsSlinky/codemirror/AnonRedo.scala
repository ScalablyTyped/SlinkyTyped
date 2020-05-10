package typingsSlinky.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRedo extends js.Object {
  var redo: Double = js.native
  var undo: Double = js.native
}

object AnonRedo {
  @scala.inline
  def apply(redo: Double, undo: Double): AnonRedo = {
    val __obj = js.Dynamic.literal(redo = redo.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRedo]
  }
  @scala.inline
  implicit class AnonRedoOps[Self <: AnonRedo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

