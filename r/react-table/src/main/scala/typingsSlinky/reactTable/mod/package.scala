package typingsSlinky.reactTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Accessor[D /* <: js.Object */] = js.Function3[
    /* originalRow */ D, 
    /* index */ scala.Double, 
    /* sub */ typingsSlinky.reactTable.anon.Data[D], 
    typingsSlinky.reactTable.mod.CellValue[js.Any]
  ]
  type ActionType = typingsSlinky.reactTable.anon.Type with (typingsSlinky.std.Record[java.lang.String, _])
  type AggregatedValue = js.Any
  type AggregatorFn[D /* <: js.Object */] = js.Function3[
    /* columnValues */ js.Array[typingsSlinky.reactTable.mod.CellValue[js.Any]], 
    /* rows */ js.Array[typingsSlinky.reactTable.mod.Row[D]], 
    /* isAggregated */ scala.Boolean, 
    typingsSlinky.reactTable.mod.AggregatedValue
  ]
  type Cell[D /* <: js.Object */, V] = typingsSlinky.reactTable.mod.UseTableCellProps[D, V]
  type CellPropGetter[D /* <: js.Object */] = typingsSlinky.reactTable.mod.PropGetter[
    D, 
    typingsSlinky.reactTable.mod.TableCellProps, 
    typingsSlinky.reactTable.anon.Cell[D], 
    typingsSlinky.reactTable.anon.PartialTableCellProps
  ]
  type CellValue[V] = V
  type ColumnGroup[D /* <: js.Object */] = typingsSlinky.reactTable.mod.ColumnInterface[D] with typingsSlinky.reactTable.mod.ColumnGroupInterface[D] with (typingsSlinky.reactTable.anon.Header | typingsSlinky.reactTable.anon.Id[D]) with typingsSlinky.reactTable.anon.Accessor[D]
  type ColumnInterface[D /* <: js.Object */] = typingsSlinky.reactTable.mod.UseTableColumnOptions[D]
  type ColumnWithLooseAccessor[D /* <: js.Object */] = typingsSlinky.reactTable.mod.ColumnInterface[D] with (typingsSlinky.reactTable.mod.ColumnInterfaceBasedOnValue[D, _]) with (typingsSlinky.reactTable.anon.Header | typingsSlinky.reactTable.anon.IdIdType[D] | typingsSlinky.reactTable.anon.`0`[D]) with typingsSlinky.reactTable.anon.`1`[D]
  type ColumnWithStrictAccessor[D /* <: js.Object */] = typingsSlinky.reactTable.mod.ColumnInterface[D] with (typingsSlinky.reactTable.mod.ValueOf[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof D ]: {  accessor  :K} & react-table.react-table.ColumnInterfaceBasedOnValue<D, D[K]>}
    */ typingsSlinky.reactTable.reactTableStrings.ColumnWithStrictAccessor with org.scalablytyped.runtime.TopLevel[D]
  ])
  type FilterTypes[D /* <: js.Object */] = typingsSlinky.std.Record[java.lang.String, typingsSlinky.reactTable.mod.FilterValue]
  type FilterValue = js.Any
  type Filters[D /* <: js.Object */] = js.Array[typingsSlinky.reactTable.anon.Value[D]]
  type FooterGroupPropGetter[D /* <: js.Object */] = typingsSlinky.reactTable.mod.PropGetter[
    D, 
    typingsSlinky.reactTable.mod.TableFooterGroupProps, 
    typingsSlinky.reactTable.anon.Column[D], 
    typingsSlinky.reactTable.anon.PartialTableFooterGroupPr
  ]
  type FooterPropGetter[D /* <: js.Object */] = typingsSlinky.reactTable.mod.PropGetter[
    D, 
    typingsSlinky.reactTable.mod.TableFooterProps, 
    typingsSlinky.reactTable.anon.Column[D], 
    typingsSlinky.reactTable.anon.PartialTableFooterProps
  ]
  type HeaderGroupPropGetter[D /* <: js.Object */] = typingsSlinky.reactTable.mod.PropGetter[
    D, 
    typingsSlinky.reactTable.mod.TableHeaderGroupProps, 
    typingsSlinky.reactTable.anon.Column[D], 
    typingsSlinky.reactTable.anon.PartialTableHeaderGroupPr
  ]
  type HeaderPropGetter[D /* <: js.Object */] = typingsSlinky.reactTable.mod.PropGetter[
    D, 
    typingsSlinky.reactTable.mod.TableHeaderProps, 
    typingsSlinky.reactTable.anon.Column[D], 
    typingsSlinky.reactTable.anon.PartialTableHeaderProps
  ]
  type Hooks[D /* <: js.Object */] = typingsSlinky.reactTable.mod.UseTableHooks[D]
  type Row[D /* <: js.Object */] = typingsSlinky.reactTable.mod.UseTableRowProps[D]
  type RowPropGetter[D /* <: js.Object */] = typingsSlinky.reactTable.mod.PropGetter[
    D, 
    typingsSlinky.reactTable.mod.TableRowProps, 
    typingsSlinky.reactTable.anon.Row[D], 
    typingsSlinky.reactTable.anon.PartialTableRowProps
  ]
  type SortByFn[D /* <: js.Object */] = js.Function4[
    /* rowA */ typingsSlinky.reactTable.mod.Row[D], 
    /* rowB */ typingsSlinky.reactTable.mod.Row[D], 
    /* columnId */ typingsSlinky.reactTable.mod.IdType[D], 
    /* desc */ js.UndefOr[scala.Boolean], 
    scala.Double
  ]
  type StringKey[D] = typingsSlinky.std.Extract[/* keyof D */ java.lang.String, java.lang.String]
  type TableBodyPropGetter[D /* <: js.Object */] = typingsSlinky.reactTable.mod.PropGetter[
    D, 
    typingsSlinky.reactTable.mod.TableBodyProps, 
    scala.Nothing, 
    typingsSlinky.reactTable.anon.PartialTableBodyProps
  ]
  type TableBodyProps = typingsSlinky.reactTable.mod.TableCommonProps
  type TableCellProps = typingsSlinky.reactTable.mod.TableKeyedProps
  type TableDispatch[A] = js.Function1[/* action */ A, scala.Unit]
  type TableExpandedToggleProps = typingsSlinky.reactTable.mod.TableKeyedProps
  type TableFooterGroupProps = typingsSlinky.reactTable.mod.TableKeyedProps
  type TableFooterProps = typingsSlinky.reactTable.mod.TableKeyedProps
  type TableHeaderGroupProps = typingsSlinky.reactTable.mod.TableKeyedProps
  type TableHeaderProps = typingsSlinky.reactTable.mod.TableKeyedProps
  type TableOptions[D /* <: js.Object */] = typingsSlinky.reactTable.mod.UseTableOptions[D]
  type TablePropGetter[D /* <: js.Object */] = typingsSlinky.reactTable.mod.PropGetter[
    D, 
    typingsSlinky.reactTable.mod.TableProps, 
    scala.Nothing, 
    typingsSlinky.reactTable.anon.PartialTableProps
  ]
  type TableProps = typingsSlinky.reactTable.mod.TableCommonProps
  type TableRowProps = typingsSlinky.reactTable.mod.TableKeyedProps
  type TableToggleAllRowsSelectedProps = typingsSlinky.reactTable.mod.TableToggleCommonProps
  type TableToggleHideAllColumnProps = typingsSlinky.reactTable.mod.TableToggleCommonProps
  type TableToggleRowsSelectedProps = typingsSlinky.reactTable.mod.TableToggleCommonProps
  type UpdateHiddenColumns[D /* <: js.Object */] = js.Function1[
    /* oldHidden */ js.Array[typingsSlinky.reactTable.mod.IdType[D]], 
    js.Array[typingsSlinky.reactTable.mod.IdType[D]]
  ]
  type UseRowStateLocalState[D /* <: js.Object */, T] = typingsSlinky.std.Record[typingsSlinky.reactTable.mod.IdType[D], T]
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
