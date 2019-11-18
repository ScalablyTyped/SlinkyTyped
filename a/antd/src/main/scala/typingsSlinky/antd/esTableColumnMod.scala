package typingsSlinky.antd

import typingsSlinky.antd.esTableInterfaceMod.ColumnProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/table/Column", JSImport.Namespace)
@js.native
object esTableColumnMod extends js.Object {
  @js.native
  class default[T] ()
    extends Component[ColumnProps[T], ComponentState, js.Any]
  
  type Column[T] = Component[ColumnProps[T], ComponentState, js.Any]
}

