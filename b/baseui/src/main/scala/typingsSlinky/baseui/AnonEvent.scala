package typingsSlinky.baseui

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.baseui.dataTableMod.RowT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: SyntheticMouseEvent[HTMLButtonElement]
  var row: RowT
}

object AnonEvent {
  @scala.inline
  def apply(event: SyntheticMouseEvent[HTMLButtonElement], row: RowT): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

