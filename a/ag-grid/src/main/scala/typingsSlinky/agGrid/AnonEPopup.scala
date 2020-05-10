package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEPopup extends js.Object {
  var ePopup: HTMLElement = js.native
  var eventSource: js.Any = js.native
}

object AnonEPopup {
  @scala.inline
  def apply(ePopup: HTMLElement, eventSource: js.Any): AnonEPopup = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEPopup]
  }
  @scala.inline
  implicit class AnonEPopupOps[Self <: AnonEPopup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEPopup(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ePopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

