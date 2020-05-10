package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonButton extends js.Object {
  def button(ref: HTMLElement): Unit = js.native
}

object AnonButton {
  @scala.inline
  def apply(button: HTMLElement => Unit): AnonButton = {
    val __obj = js.Dynamic.literal(button = js.Any.fromFunction1(button))
    __obj.asInstanceOf[AnonButton]
  }
  @scala.inline
  implicit class AnonButtonOps[Self <: AnonButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

