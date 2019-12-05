package typingsSlinky.reactDashVirtualized

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactDashVirtualized.distEsTableMod.MultiSortOptions
import typingsSlinky.reactDashVirtualized.distEsTableMod.MultiSortReturn
import typingsSlinky.reactDashVirtualized.distEsTableMod.SortDirectionStatic
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableCellDataGetter
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableCellRenderer
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableHeaderRowRenderer
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableRowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/Table", JSImport.Namespace)
@js.native
object distCommonjsTableMod extends js.Object {
  @js.native
  class Column ()
    extends typingsSlinky.reactDashVirtualized.distEsTableMod.Column
  
  @js.native
  class Table ()
    extends typingsSlinky.reactDashVirtualized.distEsTableMod.Table
  
  val SortDirection: SortDirectionStatic = js.native
  val SortIndicator: ReactComponentClass[Anon_SortDirection] = js.native
  val defaultCellDataGetter: TableCellDataGetter = js.native
  val defaultCellRenderer: TableCellRenderer = js.native
  val defaultHeaderRowRenderer: TableHeaderRowRenderer = js.native
  val defaultRowRenderer: TableRowRenderer = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ Anon_SortBy, Unit]): MultiSortReturn = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ Anon_SortBy, Unit], options: MultiSortOptions): MultiSortReturn = js.native
  def defaultHeaderRenderer(): js.Array[ReactElement] = js.native
  /* static members */
  @js.native
  object Column extends js.Object {
    var defaultProps: Anon_01CellDataGetter = js.native
    var propTypes: Anon_ArialabelCellDataGetter = js.native
  }
  
  /* static members */
  @js.native
  object Table extends js.Object {
    var defaultProps: Anon_0110 = js.native
    var propTypes: Anon_ArialabelAutoHeight = js.native
  }
  
}

