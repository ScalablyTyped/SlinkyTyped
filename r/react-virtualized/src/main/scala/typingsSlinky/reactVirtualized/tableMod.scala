package typingsSlinky.reactVirtualized

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactVirtualized.esTableMod.MultiSortOptions
import typingsSlinky.reactVirtualized.esTableMod.MultiSortReturn
import typingsSlinky.reactVirtualized.esTableMod.SortDirectionStatic
import typingsSlinky.reactVirtualized.esTableMod.TableCellDataGetter
import typingsSlinky.reactVirtualized.esTableMod.TableCellRenderer
import typingsSlinky.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typingsSlinky.reactVirtualized.esTableMod.TableRowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/Table", JSImport.Namespace)
@js.native
object tableMod extends js.Object {
  @js.native
  class Column ()
    extends typingsSlinky.reactVirtualized.esTableMod.Column
  
  @js.native
  class Table ()
    extends typingsSlinky.reactVirtualized.esTableMod.Table
  
  val SortDirection: SortDirectionStatic = js.native
  val SortIndicator: ReactComponentClass[AnonSortDirection] = js.native
  val defaultCellDataGetter: TableCellDataGetter = js.native
  val defaultCellRenderer: TableCellRenderer = js.native
  val defaultHeaderRowRenderer: TableHeaderRowRenderer = js.native
  val defaultRowRenderer: TableRowRenderer = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ AnonSortBy, Unit]): MultiSortReturn = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ AnonSortBy, Unit], options: MultiSortOptions): MultiSortReturn = js.native
  def defaultHeaderRenderer(): js.Array[ReactElement] = js.native
  /* static members */
  @js.native
  object Column extends js.Object {
    var defaultProps: AnonCellRenderer = js.native
    var propTypes: AnonCellDataGetter = js.native
  }
  
  /* static members */
  @js.native
  object Table extends js.Object {
    var defaultProps: AnonDisableHeader = js.native
    var propTypes: AnonClassName = js.native
  }
  
}

