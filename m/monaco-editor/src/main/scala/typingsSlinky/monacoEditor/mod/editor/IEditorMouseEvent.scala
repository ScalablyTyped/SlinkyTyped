package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.IMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorMouseEvent extends js.Object {
  val event: IMouseEvent = js.native
  val target: IMouseTarget = js.native
}

object IEditorMouseEvent {
  @scala.inline
  def apply(event: IMouseEvent, target: IMouseTarget): IEditorMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorMouseEvent]
  }
  @scala.inline
  implicit class IEditorMouseEventOps[Self <: IEditorMouseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: IMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: IMouseTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

