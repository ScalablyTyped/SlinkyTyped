package typingsSlinky.reactTable.mod

import typingsSlinky.reactTable.anon.PartialTableToggleHideAll
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-table.react-table.TableInstance<D> & {  column :react-table.react-table.ColumnInstance<D>} */
@js.native
trait HeaderProps[D /* <: js.Object */] extends StObject {
  
  var allColumns: js.Array[ColumnInstance[D]] = js.native
  
  var allColumnsHidden: Boolean = js.native
  
  var column: ColumnInstance[D] = js.native
  
  var columns: js.Array[ColumnInstance[D]] = js.native
  
  var data: js.Array[D] = js.native
  
  var defaultColumn: js.UndefOr[Partial[Column[D]]] = js.native
  
  var dispatch: TableDispatch[_] = js.native
  
  var flatHeaders: js.Array[ColumnInstance[D]] = js.native
  
  var flatRows: js.Array[Row[D]] = js.native
  
  var footerGroups: js.Array[HeaderGroup[D]] = js.native
  
  def getHooks(): Hooks[D] = js.native
  
  var getRowId: js.UndefOr[
    js.Function3[
      /* originalRow */ D, 
      /* relativeIndex */ Double, 
      /* parent */ js.UndefOr[Row[D]], 
      String
    ]
  ] = js.native
  
  var getSubRows: js.UndefOr[js.Function2[/* originalRow */ D, /* relativeIndex */ Double, js.Array[D]]] = js.native
  
  def getTableBodyProps(): TableBodyProps = js.native
  def getTableBodyProps(propGetter: TableBodyPropGetter[D]): TableBodyProps = js.native
  
  def getTableProps(): TableProps = js.native
  def getTableProps(propGetter: TablePropGetter[D]): TableProps = js.native
  
  def getToggleHideAllColumnsProps(): TableToggleHideAllColumnProps = js.native
  def getToggleHideAllColumnsProps(props: PartialTableToggleHideAll): TableToggleHideAllColumnProps = js.native
  
  var headerGroups: js.Array[HeaderGroup[D]] = js.native
  
  var headers: js.Array[ColumnInstance[D]] = js.native
  
  var initialState: js.UndefOr[Partial[TableState[D]]] = js.native
  
  var plugins: js.Array[PluginHook[D]] = js.native
  
  def prepareRow(row: Row[D]): Unit = js.native
  
  var rows: js.Array[Row[D]] = js.native
  
  var rowsById: Record[String, Row[D]] = js.native
  
  def setHiddenColumns(param: js.Array[IdType[D]]): Unit = js.native
  def setHiddenColumns(param: UpdateHiddenColumns[D]): Unit = js.native
  
  var state: TableState[D] = js.native
  
  var stateReducer: js.UndefOr[
    js.Function4[
      /* newState */ TableState[D], 
      /* action */ ActionType, 
      /* previousState */ TableState[D], 
      /* instance */ js.UndefOr[TableInstance[D]], 
      TableState[D]
    ]
  ] = js.native
  
  def toggleHideAllColumns(): Unit = js.native
  def toggleHideAllColumns(value: Boolean): Unit = js.native
  
  def toggleHideColumn(columnId: IdType[D]): Unit = js.native
  def toggleHideColumn(columnId: IdType[D], value: Boolean): Unit = js.native
  
  var totalColumnsWidth: Double = js.native
  
  var useControlledState: js.UndefOr[
    js.Function2[
      /* state */ TableState[D], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      TableState[D]
    ]
  ] = js.native
  
  var visibleColumns: js.Array[ColumnInstance[D]] = js.native
}
