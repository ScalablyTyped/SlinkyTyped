package typingsSlinky.reactTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Accessor[D /* <: js.Object */] = js.Function3[
    /* originalRow */ D, 
    /* index */ scala.Double, 
    /* sub */ typingsSlinky.reactTable.AnonData[D], 
    typingsSlinky.reactTable.mod.CellValue[js.Any]
  ]
  type ActionType = typingsSlinky.reactTable.AnonType with (typingsSlinky.std.Record[java.lang.String, _])
  type AggregatedValue = js.Any
  type Aggregator[D /* <: js.Object */] = typingsSlinky.reactTable.mod.AggregatorFn[D] | typingsSlinky.reactTable.mod.DefaultAggregators | java.lang.String
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
    typingsSlinky.reactTable.AnonCell[D], 
    typingsSlinky.reactTable.PartialTableCellProps
  ]
  type CellValue[V] = V
  type Column[D /* <: js.Object */] = typingsSlinky.reactTable.mod.ColumnGroup[D] | typingsSlinky.reactTable.mod.ColumnWithLooseAccessor[D] | typingsSlinky.reactTable.mod.ColumnWithStrictAccessor[D]
  type ColumnGroup[D /* <: js.Object */] = typingsSlinky.reactTable.mod.ColumnInterface[D] with typingsSlinky.reactTable.mod.ColumnGroupInterface[D] with (typingsSlinky.reactTable.AnonHeader | typingsSlinky.reactTable.AnonId[D]) with typingsSlinky.reactTable.AnonAccessor[D]
  type ColumnInterface[D /* <: js.Object */] = typingsSlinky.reactTable.mod.UseTableColumnOptions[D]
  type ColumnWithLooseAccessor[D /* <: js.Object */] = typingsSlinky.reactTable.mod.ColumnInterface[D] with (typingsSlinky.reactTable.mod.ColumnInterfaceBasedOnValue[D, _]) with (typingsSlinky.reactTable.AnonHeader | typingsSlinky.reactTable.AnonIdIdType[D] | typingsSlinky.reactTable.Anon0[D]) with typingsSlinky.reactTable.Anon1[D]
  type ColumnWithStrictAccessor[D /* <: js.Object */] = typingsSlinky.reactTable.mod.ColumnInterface[D] with (typingsSlinky.reactTable.mod.ValueOf[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof D ]: {  accessor  :K} & react-table.react-table.ColumnInterfaceBasedOnValue<D, D[K]>}
    */ typingsSlinky.reactTable.reactTableStrings.ColumnWithStrictAccessor with org.scalablytyped.runtime.TopLevel[D]
  ])
  type FilterTypes[D /* <: js.Object */] = typingsSlinky.std.Record[java.lang.String, typingsSlinky.reactTable.mod.FilterValue]
  type FilterValue = js.Any
  type Filters[D /* <: js.Object */] = js.Array[typingsSlinky.reactTable.AnonValue[D]]
  type FooterGroupPropGetter[D /* <: js.Object */] = typingsSlinky.reactTable.mod.PropGetter[
    D, 
    typingsSlinky.reactTable.mod.TableFooterGroupProps, 
    typingsSlinky.reactTable.AnonColumn[D], 
    typingsSlinky.reactTable.PartialTableFooterGroupPr
  ]
  type FooterPropGetter[D /* <: js.Object */] = typingsSlinky.reactTable.mod.PropGetter[
    D, 
    typingsSlinky.reactTable.mod.TableFooterProps, 
    typingsSlinky.reactTable.AnonColumn[D], 
    typingsSlinky.reactTable.PartialTableFooterProps
  ]
  type HeaderGroupPropGetter[D /* <: js.Object */] = typingsSlinky.reactTable.mod.PropGetter[
    D, 
    typingsSlinky.reactTable.mod.TableHeaderGroupProps, 
    typingsSlinky.reactTable.AnonColumn[D], 
    typingsSlinky.reactTable.PartialTableHeaderGroupPr
  ]
  type HeaderPropGetter[D /* <: js.Object */] = typingsSlinky.reactTable.mod.PropGetter[
    D, 
    typingsSlinky.reactTable.mod.TableHeaderProps, 
    typingsSlinky.reactTable.AnonColumn[D], 
    typingsSlinky.reactTable.PartialTableHeaderProps
  ]
  type Hooks[D /* <: js.Object */] = typingsSlinky.reactTable.mod.UseTableHooks[D]
  type IdType[D] = typingsSlinky.reactTable.mod.StringKey[D] | java.lang.String
  type Meta[D /* <: js.Object */, Extension, M] = (M with Extension) | M
  type PropGetter[D /* <: js.Object */, Props, T /* <: js.Object */, P] = (js.Function2[
    /* props */ P, 
    /* meta */ typingsSlinky.reactTable.mod.Meta[D, T, typingsSlinky.reactTable.mod.MetaBase[D]], 
    P | js.Array[P]
  ]) | P | js.Array[P]
  type Renderer[Props] = slinky.core.ReactComponentClass[Props] | slinky.core.facade.ReactElement | typingsSlinky.react.mod.ReactText | typingsSlinky.react.mod.ReactFragment
  type Row[D /* <: js.Object */] = typingsSlinky.reactTable.mod.UseTableRowProps[D]
  type RowPropGetter[D /* <: js.Object */] = typingsSlinky.reactTable.mod.PropGetter[
    D, 
    typingsSlinky.reactTable.mod.TableRowProps, 
    typingsSlinky.reactTable.AnonRow[D], 
    typingsSlinky.reactTable.PartialTableRowProps
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
    typingsSlinky.reactTable.PartialTableBodyProps
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
    typingsSlinky.reactTable.PartialTableProps
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
  type UseRowUpdater[T] = T | (js.Function1[/* prev */ T, T])
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
