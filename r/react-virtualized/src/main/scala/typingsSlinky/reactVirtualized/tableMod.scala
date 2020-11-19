package typingsSlinky.reactVirtualized

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactVirtualized.anon.CellDataGetter
import typingsSlinky.reactVirtualized.anon.CellRenderer
import typingsSlinky.reactVirtualized.anon.ClassName
import typingsSlinky.reactVirtualized.anon.DisableHeader
import typingsSlinky.reactVirtualized.anon.SortBy
import typingsSlinky.reactVirtualized.esTableMod.MultiSortOptions
import typingsSlinky.reactVirtualized.esTableMod.MultiSortReturn
import typingsSlinky.reactVirtualized.esTableMod.SortDirectionStatic
import typingsSlinky.reactVirtualized.esTableMod.TableCellDataGetter
import typingsSlinky.reactVirtualized.esTableMod.TableCellRenderer
import typingsSlinky.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typingsSlinky.reactVirtualized.esTableMod.TableRowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/commonjs/Table", JSImport.Namespace)
@js.native
object tableMod extends js.Object {
  
  val SortDirection: SortDirectionStatic = js.native
  
  val SortIndicator: ReactComponentClass[typingsSlinky.reactVirtualized.anon.SortDirection] = js.native
  
  def createMultiSort(sortCallback: js.Function1[/* params */ SortBy, Unit]): MultiSortReturn = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ SortBy, Unit], options: MultiSortOptions): MultiSortReturn = js.native
  
  val defaultCellDataGetter: TableCellDataGetter = js.native
  
  val defaultCellRenderer: TableCellRenderer = js.native
  
  def defaultHeaderRenderer(): js.Array[ReactElement] = js.native
  
  val defaultHeaderRowRenderer: TableHeaderRowRenderer = js.native
  
  val defaultRowRenderer: TableRowRenderer = js.native
  
  @js.native
  class Column ()
    extends typingsSlinky.reactVirtualized.esTableMod.Column
  /* static members */
  @js.native
  object Column extends js.Object {
    
    var defaultProps: CellRenderer = js.native
    
    var propTypes: CellDataGetter = js.native
  }
  
  @js.native
  class Table ()
    extends typingsSlinky.reactVirtualized.esTableMod.Table
  /* static members */
  @js.native
  object Table extends js.Object {
    
    var defaultProps: DisableHeader = js.native
    
    var propTypes: ClassName = js.native
  }
}
