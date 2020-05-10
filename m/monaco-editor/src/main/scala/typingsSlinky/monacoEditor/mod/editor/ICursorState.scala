package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.IPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICursorState extends js.Object {
  var inSelectionMode: Boolean = js.native
  var position: IPosition = js.native
  var selectionStart: IPosition = js.native
}

object ICursorState {
  @scala.inline
  def apply(inSelectionMode: Boolean, position: IPosition, selectionStart: IPosition): ICursorState = {
    val __obj = js.Dynamic.literal(inSelectionMode = inSelectionMode.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorState]
  }
  @scala.inline
  implicit class ICursorStateOps[Self <: ICursorState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInSelectionMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inSelectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: IPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionStart(value: IPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

