package typingsSlinky.rcDashTable

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.rcDashTable.libInterfaceMod.LegacyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cells[ValueType] extends js.Object {
  var expanded: Boolean
  var indentSize: Double
  var onRowClick: LegacyFunction[ValueType]
  def hasExpandIcon(index: Double): Boolean
  def renderExpandIcon(): TagMod[Any]
  def renderExpandIconCell(cells: js.Array[ReactElement]): Unit
}

object Anon_Cells {
  @scala.inline
  def apply[ValueType](
    expanded: Boolean,
    hasExpandIcon: Double => Boolean,
    indentSize: Double,
    onRowClick: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Event, Element]) => Unit,
    renderExpandIcon: () => TagMod[Any],
    renderExpandIconCell: js.Array[ReactElement] => Unit
  ): Anon_Cells[ValueType] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], hasExpandIcon = js.Any.fromFunction1(hasExpandIcon), indentSize = indentSize.asInstanceOf[js.Any], onRowClick = js.Any.fromFunction3(onRowClick), renderExpandIcon = js.Any.fromFunction0(renderExpandIcon), renderExpandIconCell = js.Any.fromFunction1(renderExpandIconCell))
  
    __obj.asInstanceOf[Anon_Cells[ValueType]]
  }
}

