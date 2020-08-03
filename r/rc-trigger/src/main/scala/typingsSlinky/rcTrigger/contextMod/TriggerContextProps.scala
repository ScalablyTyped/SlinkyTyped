package typingsSlinky.rcTrigger.contextMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerContextProps extends js.Object {
  var onPopupMouseDown: MouseEventHandler[HTMLElement]
}

object TriggerContextProps {
  @scala.inline
  def apply(onPopupMouseDown: SyntheticMouseEvent[HTMLElement] => Unit): TriggerContextProps = {
    val __obj = js.Dynamic.literal(onPopupMouseDown = js.Any.fromFunction1(onPopupMouseDown))
    __obj.asInstanceOf[TriggerContextProps]
  }
  @scala.inline
  implicit class TriggerContextPropsOps[Self <: TriggerContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnPopupMouseDown(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = this.set("onPopupMouseDown", js.Any.fromFunction1(value))
  }
  
}

