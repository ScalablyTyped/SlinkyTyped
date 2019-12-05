package typingsSlinky.baseui

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.baseui.dataDashTableMod.RowT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClearSelection extends js.Object {
  var event: SyntheticMouseEvent[HTMLButtonElement]
  var selection: js.Array[RowT]
  def clearSelection(): js.Any
}

object Anon_ClearSelection {
  @scala.inline
  def apply(
    clearSelection: () => js.Any,
    event: SyntheticMouseEvent[HTMLButtonElement],
    selection: js.Array[RowT]
  ): Anon_ClearSelection = {
    val __obj = js.Dynamic.literal(clearSelection = js.Any.fromFunction0(clearSelection), event = event.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClearSelection]
  }
}

