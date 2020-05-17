package typingsSlinky.agGrid.anon

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EPopup extends js.Object {
  var ePopup: HTMLElement = js.native
  var eventSource: js.Any = js.native
}

object EPopup {
  @scala.inline
  def apply(ePopup: HTMLElement, eventSource: js.Any): EPopup = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EPopup]
  }
  @scala.inline
  implicit class EPopupOps[Self <: EPopup] (val x: Self) extends AnyVal {
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

