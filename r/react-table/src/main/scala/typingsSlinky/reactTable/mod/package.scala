package typingsSlinky.reactTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Accessor[D /* <: js.Object */] = js.Function3[
    /* originalRow */ D, 
    /* index */ scala.Double, 
    /* sub */ typingsSlinky.reactTable.anon.Data[D], 
    typingsSlinky.reactTable.mod.CellValue[js.Any]
  ]
  
  type ActionType = typingsSlinky.reactTable.anon.Type with (typingsSlinky.std.Record[java.lang.String, _])
  
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
    typingsSlinky.reactTable.anon.Cell[D], 
    typingsSlinky.reactTable.anon.PartialTableCellProps
  ]
  
  type CellValue[V] = V
  
  type Column[D /* <: js.Object */] = typingsSlinky.reactTable.mod.ColumnGroup[D] | typingsSlinky.reactTable.mod.ColumnWithLooseAccessor[D] | typingsSlinky.reactTable.mod.ColumnWithStrictAccessor[D]
  
  type ColumnGroup[D /* <: js.Object */] = typingsSlinky.reactTable.mod.ColumnInterface[D] with typingsSlinky.reactTable.mod.ColumnGroupInterface[D] with (typingsSlinky.reactTable.anon.Header | typingsSlinky.reactTable.anon.Id[D]) with typingsSlinky.reactTable.anon.Accessor[D]
  
  type ColumnInterface[D /* <: js.Object */] = typingsSlinky.reactTable.mod.UseTableColumnOptions[D]
  
  type ColumnWithLooseAccessor[D /* <: js.Object */] = typingsSlinky.reactTable.mod.ColumnInterface[D] with (typingsSlinky.reactTable.mod.ColumnInterfaceBasedOnValue[D, _]) with (typingsSlinky.reactTable.anon.Header | typingsSlinky.reactTable.anon.IdIdType[D] | typingsSlinky.reactTable.anon.`0`[D]) with typingsSlinky.reactTable.anon.`1`[D]
  
  type ColumnWithStrictAccessor[D /* <: js.Object */] = typingsSlinky.reactTable.mod.ColumnInterface[D] with (typingsSlinky.reactTable.mod.ValueOf[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof D ]: {  accessor :K} & react-table.react-table.ColumnInterfaceBasedOnValue<D, D[K]>}
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
  
  type UseRowUpdater[T] = T | (js.Function1[/* prev */ T, T])
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  @scala.inline
  def actions: typingsSlinky.std.Record[java.lang.String, java.lang.String] = typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].selectDynamic("actions").asInstanceOf[typingsSlinky.std.Record[java.lang.String, java.lang.String]]
  
  @scala.inline
  def defaultColumn: typingsSlinky.std.Partial[typingsSlinky.reactTable.mod.Column[js.Object]] with (typingsSlinky.std.Record[java.lang.String, _]) = typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultColumn").asInstanceOf[typingsSlinky.std.Partial[typingsSlinky.reactTable.mod.Column[js.Object]] with (typingsSlinky.std.Record[java.lang.String, _])]
  
  @scala.inline
  def defaultGroupByFn[D /* <: js.Object */](
    rows: js.Array[typingsSlinky.reactTable.mod.Row[D]],
    columnId: typingsSlinky.reactTable.mod.IdType[D]
  ): typingsSlinky.std.Record[java.lang.String, js.Array[typingsSlinky.reactTable.mod.Row[D]]] = (typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultGroupByFn")(rows.asInstanceOf[js.Any], columnId.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.std.Record[java.lang.String, js.Array[typingsSlinky.reactTable.mod.Row[D]]]]
  
  @scala.inline
  def defaultOrderByFn[D /* <: js.Object */](
    arr: js.Array[typingsSlinky.reactTable.mod.Row[D]],
    funcs: js.Array[typingsSlinky.reactTable.mod.SortByFn[D]],
    dirs: js.Array[scala.Boolean]
  ): js.Array[typingsSlinky.reactTable.mod.Row[D]] = (typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultOrderByFn")(arr.asInstanceOf[js.Any], funcs.asInstanceOf[js.Any], dirs.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.reactTable.mod.Row[D]]]
  
  @scala.inline
  def ensurePluginOrder[D /* <: js.Object */](
    plugins: js.Array[typingsSlinky.reactTable.mod.PluginHook[D]],
    befores: js.Array[java.lang.String],
    pluginName: java.lang.String
  ): scala.Unit = (typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensurePluginOrder")(plugins.asInstanceOf[js.Any], befores.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def functionalUpdate[D /* <: js.Object */](updater: js.Any, old: typingsSlinky.std.Partial[typingsSlinky.reactTable.mod.TableState[D]]): typingsSlinky.std.Partial[typingsSlinky.reactTable.mod.TableState[D]] = (typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("functionalUpdate")(updater.asInstanceOf[js.Any], old.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.std.Partial[typingsSlinky.reactTable.mod.TableState[D]]]
  
  @scala.inline
  def loopHooks(hooks: typingsSlinky.reactTable.mod.Hooks[js.Object], args: js.Any*): scala.Unit = (typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loopHooks")(hooks.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def makePropGetter(hooks: typingsSlinky.reactTable.mod.Hooks[js.Object], meta: js.Any*): js.Any = (typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makePropGetter")(hooks.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def makeRenderer(
    instance: typingsSlinky.reactTable.mod.TableInstance[js.Object],
    column: typingsSlinky.reactTable.mod.ColumnInstance[js.Object]
  ): slinky.core.facade.ReactElement = (typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeRenderer")(instance.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  def makeRenderer(
    instance: typingsSlinky.reactTable.mod.TableInstance[js.Object],
    column: typingsSlinky.reactTable.mod.ColumnInstance[js.Object],
    meta: js.Any
  ): slinky.core.facade.ReactElement = (typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeRenderer")(instance.asInstanceOf[js.Any], column.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[slinky.core.facade.ReactElement]
  
  @scala.inline
  def reduceHooks[T /* <: js.Object */](hooks: typingsSlinky.reactTable.mod.Hooks[js.Object], initial: T, args: js.Any*): T = (typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reduceHooks")(hooks.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def safeUseLayoutEffect(effect: typingsSlinky.react.mod.EffectCallback): scala.Unit = typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("safeUseLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def safeUseLayoutEffect(effect: typingsSlinky.react.mod.EffectCallback, deps: typingsSlinky.react.mod.DependencyList): scala.Unit = (typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("safeUseLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def useAsyncDebounce[F /* <: js.Function1[/* repeated */ js.Any, _] */](defaultFn: F): F = typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncDebounce")(defaultFn.asInstanceOf[js.Any]).asInstanceOf[F]
  @scala.inline
  def useAsyncDebounce[F /* <: js.Function1[/* repeated */ js.Any, _] */](defaultFn: F, defaultWait: scala.Double): F = (typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncDebounce")(defaultFn.asInstanceOf[js.Any], defaultWait.asInstanceOf[js.Any])).asInstanceOf[F]
  
  @scala.inline
  def useGetLatest[T](obj: T): js.Function0[T] = typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useGetLatest")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]
  
  @scala.inline
  def useMountedLayoutEffect(effect: typingsSlinky.react.mod.EffectCallback): scala.Unit = typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMountedLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def useMountedLayoutEffect(effect: typingsSlinky.react.mod.EffectCallback, deps: typingsSlinky.react.mod.DependencyList): scala.Unit = (typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMountedLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def useTable[D /* <: js.Object */](
    options: typingsSlinky.reactTable.mod.TableOptions[D],
    plugins: typingsSlinky.reactTable.mod.PluginHook[D]*
  ): typingsSlinky.reactTable.mod.TableInstance[D] = (typingsSlinky.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useTable")(options.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactTable.mod.TableInstance[D]]
}
