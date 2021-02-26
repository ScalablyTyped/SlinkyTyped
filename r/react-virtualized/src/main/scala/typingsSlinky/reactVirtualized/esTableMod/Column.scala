package typingsSlinky.reactVirtualized.esTableMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactVirtualized.anon.CellDataGetter
import typingsSlinky.reactVirtualized.anon.CellRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/es/Table", "Column")
@js.native
class Column protected ()
  extends Component[ColumnProps, js.Object, js.Any] {
  def this(props: ColumnProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ColumnProps, context: js.Any) = this()
}
/* static members */
object Column {
  
  @JSImport("react-virtualized/dist/es/Table", "Column")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized/dist/es/Table", "Column.defaultProps")
  @js.native
  def defaultProps: CellRenderer = js.native
  @scala.inline
  def defaultProps_=(x: CellRenderer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-virtualized/dist/es/Table", "Column.propTypes")
  @js.native
  def propTypes: CellDataGetter = js.native
  @scala.inline
  def propTypes_=(x: CellDataGetter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
