package typingsSlinky.baseui.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.baseui.dataTableMod.RowT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearSelection extends js.Object {
  var event: SyntheticMouseEvent[HTMLButtonElement] = js.native
  var selection: js.Array[RowT] = js.native
  def clearSelection(): js.Any = js.native
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
  @scala.inline
  implicit class ClearSelectionOps[Self <: ClearSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearSelection(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEvent(value: SyntheticMouseEvent[HTMLButtonElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[RowT]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

