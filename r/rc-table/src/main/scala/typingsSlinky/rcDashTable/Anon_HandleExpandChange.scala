package typingsSlinky.rcDashTable

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcDashTable.libExpandableTableMod.ExpandChangeEventHandler
import typingsSlinky.rcDashTable.libExpandableTableMod.ExpandableTableProps
import typingsSlinky.rcDashTable.libExpandableTableMod.RenderExpandIndentCell
import typingsSlinky.rcDashTable.libExpandableTableMod.RenderTableRows
import typingsSlinky.rcDashTable.libInterfaceMod.Cell
import typingsSlinky.rcDashTable.libInterfaceMod.FixedType
import typingsSlinky.rcDashTable.libInterfaceMod.Key
import typingsSlinky.rcDashTable.libInterfaceMod.RenderRows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandleExpandChange[ValueType] extends js.Object {
  var handleExpandChange: ExpandChangeEventHandler[ValueType]
  var needIndentSpaced: Boolean
  var props: ExpandableTableProps[ValueType]
  var renderExpandIndentCell: RenderExpandIndentCell
  var renderRows: RenderTableRows[ValueType]
}

object Anon_HandleExpandChange {
  @scala.inline
  def apply[ValueType](
    handleExpandChange: (/* expanded */ Boolean, ValueType, /* event */ SyntheticMouseEvent[HTMLElement], /* rowKey */ Key, /* destroy */ Boolean) => Unit,
    needIndentSpaced: Boolean,
    props: ExpandableTableProps[ValueType],
    renderExpandIndentCell: (/* rows */ js.Array[js.Array[Cell]], /* fixed */ FixedType) => Unit,
    renderRows: (/* renderRows */ RenderRows[ValueType], /* rows */ js.Array[ReactElement], ValueType, /* index */ Double, /* indent */ Double, /* fixed */ FixedType, /* parentKey */ Key, /* ancestorKeys */ js.Array[Key]) => Unit
  ): Anon_HandleExpandChange[ValueType] = {
    val __obj = js.Dynamic.literal(handleExpandChange = js.Any.fromFunction5(handleExpandChange), needIndentSpaced = needIndentSpaced.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], renderExpandIndentCell = js.Any.fromFunction2(renderExpandIndentCell), renderRows = js.Any.fromFunction8(renderRows))
  
    __obj.asInstanceOf[Anon_HandleExpandChange[ValueType]]
  }
}

