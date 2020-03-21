package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEPopup extends js.Object {
  var ePopup: HTMLElement
  var eventSource: js.Any
}

object AnonEPopup {
  @scala.inline
  def apply(ePopup: HTMLElement, eventSource: js.Any): AnonEPopup = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEPopup]
  }
}

