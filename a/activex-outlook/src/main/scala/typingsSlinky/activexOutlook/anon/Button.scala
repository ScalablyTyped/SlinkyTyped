package typingsSlinky.activexOutlook.anon

import typingsSlinky.activexOutlook.Outlook.OlMouseButton
import typingsSlinky.activexOutlook.Outlook.OlShiftState
import typingsSlinky.activexStdole.stdole.OLE_XPOS_CONTAINER
import typingsSlinky.activexStdole.stdole.OLE_YPOS_CONTAINER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  val Button: OlMouseButton
  val Shift: OlShiftState
  val X: OLE_XPOS_CONTAINER
  val Y: OLE_YPOS_CONTAINER
}

object Button {
  @scala.inline
  def apply(Button: OlMouseButton, Shift: OlShiftState, X: OLE_XPOS_CONTAINER, Y: OLE_YPOS_CONTAINER): Button = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

