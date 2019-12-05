package typingsSlinky.rcDashTable.libTableCellMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCell[ValueType]
  extends Component[TableCellProps[ValueType], js.Object, js.Any] {
  var handleClick: MouseEventHandler[HTMLElement] = js.native
}

