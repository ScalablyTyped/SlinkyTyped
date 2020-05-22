package typingsSlinky.baseui.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.baseui.dataTableMod.RowT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearSelection extends js.Object {
  var event: SyntheticMouseEvent[HTMLButtonElement]
  var selection: js.Array[RowT]
  def clearSelection(): js.Any
}

object ClearSelection {
  @scala.inline
  def apply(
    clearSelection: () => js.Any,
    event: SyntheticMouseEvent[HTMLButtonElement],
    selection: js.Array[RowT]
  ): ClearSelection = {
    val __obj = js.Dynamic.literal(clearSelection = js.Any.fromFunction0(clearSelection), event = event.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearSelection]
  }
}

