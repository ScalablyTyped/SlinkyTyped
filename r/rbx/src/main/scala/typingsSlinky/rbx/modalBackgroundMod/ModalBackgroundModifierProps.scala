package typingsSlinky.rbx.modalBackgroundMod

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalBackgroundModifierProps extends js.Object {
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.native
}

object ModalBackgroundModifierProps {
  @scala.inline
  def apply(): ModalBackgroundModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalBackgroundModifierProps]
  }
  @scala.inline
  implicit class ModalBackgroundModifierPropsOps[Self <: ModalBackgroundModifierProps] (val x: Self) extends AnyVal {
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
    def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

