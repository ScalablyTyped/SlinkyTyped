package typingsSlinky.reactVirtualized.mod

import typingsSlinky.reactVirtualized.anon.CellDataGetter
import typingsSlinky.reactVirtualized.anon.CellRenderer
import typingsSlinky.reactVirtualized.esTableMod.ColumnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized", "Column")
@js.native
class Column protected ()
  extends typingsSlinky.reactVirtualized.esTableMod.Column {
  def this(props: ColumnProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ColumnProps, context: js.Any) = this()
}
/* static members */
object Column {
  
  @JSImport("react-virtualized", "Column")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized", "Column.defaultProps")
  @js.native
  def defaultProps: CellRenderer = js.native
  @scala.inline
  def defaultProps_=(x: CellRenderer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-virtualized", "Column.propTypes")
  @js.native
  def propTypes: CellDataGetter = js.native
  @scala.inline
  def propTypes_=(x: CellDataGetter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
