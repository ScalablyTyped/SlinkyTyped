package typingsSlinky.agGrid.anon

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Touch
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: js.UndefOr[typingsSlinky.agGrid.columnMod.Column] = js.undefined
  var ePopup: HTMLElement
  var mouseEvent: MouseEvent | Touch
  var rowNode: js.UndefOr[RowNode] = js.undefined
  var `type`: String
}

object Column {
  @scala.inline
  def apply(
    ePopup: HTMLElement,
    mouseEvent: MouseEvent | Touch,
    `type`: String,
    column: typingsSlinky.agGrid.columnMod.Column = null,
    rowNode: RowNode = null
  ): Column = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (rowNode != null) __obj.updateDynamic("rowNode")(rowNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

