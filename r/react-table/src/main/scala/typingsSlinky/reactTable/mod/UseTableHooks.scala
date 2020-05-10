package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ @js.native
trait UseTableHooks[D /* <: js.Object */] extends js.Object {
  var allColumns: js.Array[
    js.Function2[
      /* allColumns */ js.Array[ColumnInstance[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Column[D]]
    ]
  ] = js.native
  var allColumnsDeps: js.Array[
    js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
  ] = js.native
  var columns: js.Array[
    js.Function2[
      /* columns */ js.Array[Column[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Column[D]]
    ]
  ] = js.native
  var columnsDeps: js.Array[
    js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
  ] = js.native
  var getCellProps: js.Array[CellPropGetter[D]] = js.native
  var getFooterGroupProps: js.Array[FooterGroupPropGetter[D]] = js.native
  var getFooterProps: js.Array[FooterPropGetter[D]] = js.native
  var getHeaderGroupProps: js.Array[HeaderGroupPropGetter[D]] = js.native
  var getHeaderProps: js.Array[HeaderPropGetter[D]] = js.native
  var getRowProps: js.Array[RowPropGetter[D]] = js.native
  var getTableBodyProps: js.Array[TableBodyPropGetter[D]] = js.native
  var getTableProps: js.Array[TablePropGetter[D]] = js.native
  var headerGroups: js.Array[
    js.Function2[
      /* allColumns */ js.Array[HeaderGroup[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[HeaderGroup[D]]
    ]
  ] = js.native
  var headerGroupsDeps: js.Array[
    js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
  ] = js.native
  var prepareRow: js.Array[
    js.Function2[/* row */ Row[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], Unit]
  ] = js.native
  var stateReducers: js.Array[
    js.Function4[
      /* newState */ TableState[D], 
      /* action */ ActionType, 
      /* previousState */ js.UndefOr[TableState[D]], 
      /* instance */ js.UndefOr[TableInstance[D]], 
      js.UndefOr[ReducerTableState[D]]
    ]
  ] = js.native
  var useControlledState: js.Array[
    js.Function2[
      /* state */ TableState[D], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      TableState[D]
    ]
  ] = js.native
  var useFinalInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]] = js.native
  var useInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]] = js.native
  var useInstanceBeforeDimensions: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]] = js.native
  var useOptions: js.Array[
    js.Function2[/* options */ TableOptions[D], /* args */ TableOptions[D], TableOptions[D]]
  ] = js.native
  var visibleColumns: js.Array[
    js.Function2[
      /* allColumns */ js.Array[ColumnInstance[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Column[D]]
    ]
  ] = js.native
  var visibleColumnsDeps: js.Array[
    js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
  ] = js.native
}

object UseTableHooks {
  @scala.inline
  def apply[D](
    allColumns: js.Array[
      js.Function2[
        /* allColumns */ js.Array[ColumnInstance[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Column[D]]
      ]
    ],
    allColumnsDeps: js.Array[
      js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
    ],
    columns: js.Array[
      js.Function2[
        /* columns */ js.Array[Column[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Column[D]]
      ]
    ],
    columnsDeps: js.Array[
      js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
    ],
    getCellProps: js.Array[CellPropGetter[D]],
    getFooterGroupProps: js.Array[FooterGroupPropGetter[D]],
    getFooterProps: js.Array[FooterPropGetter[D]],
    getHeaderGroupProps: js.Array[HeaderGroupPropGetter[D]],
    getHeaderProps: js.Array[HeaderPropGetter[D]],
    getRowProps: js.Array[RowPropGetter[D]],
    getTableBodyProps: js.Array[TableBodyPropGetter[D]],
    getTableProps: js.Array[TablePropGetter[D]],
    headerGroups: js.Array[
      js.Function2[
        /* allColumns */ js.Array[HeaderGroup[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[HeaderGroup[D]]
      ]
    ],
    headerGroupsDeps: js.Array[
      js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
    ],
    prepareRow: js.Array[
      js.Function2[/* row */ Row[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], Unit]
    ],
    stateReducers: js.Array[
      js.Function4[
        /* newState */ TableState[D], 
        /* action */ ActionType, 
        /* previousState */ js.UndefOr[TableState[D]], 
        /* instance */ js.UndefOr[TableInstance[D]], 
        js.UndefOr[ReducerTableState[D]]
      ]
    ],
    useControlledState: js.Array[
      js.Function2[
        /* state */ TableState[D], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        TableState[D]
      ]
    ],
    useFinalInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]],
    useInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]],
    useInstanceBeforeDimensions: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]],
    useOptions: js.Array[
      js.Function2[/* options */ TableOptions[D], /* args */ TableOptions[D], TableOptions[D]]
    ],
    visibleColumns: js.Array[
      js.Function2[
        /* allColumns */ js.Array[ColumnInstance[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Column[D]]
      ]
    ],
    visibleColumnsDeps: js.Array[
      js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
    ]
  ): UseTableHooks[D] = {
    val __obj = js.Dynamic.literal(allColumns = allColumns.asInstanceOf[js.Any], allColumnsDeps = allColumnsDeps.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsDeps = columnsDeps.asInstanceOf[js.Any], getCellProps = getCellProps.asInstanceOf[js.Any], getFooterGroupProps = getFooterGroupProps.asInstanceOf[js.Any], getFooterProps = getFooterProps.asInstanceOf[js.Any], getHeaderGroupProps = getHeaderGroupProps.asInstanceOf[js.Any], getHeaderProps = getHeaderProps.asInstanceOf[js.Any], getRowProps = getRowProps.asInstanceOf[js.Any], getTableBodyProps = getTableBodyProps.asInstanceOf[js.Any], getTableProps = getTableProps.asInstanceOf[js.Any], headerGroups = headerGroups.asInstanceOf[js.Any], headerGroupsDeps = headerGroupsDeps.asInstanceOf[js.Any], prepareRow = prepareRow.asInstanceOf[js.Any], stateReducers = stateReducers.asInstanceOf[js.Any], useControlledState = useControlledState.asInstanceOf[js.Any], useFinalInstance = useFinalInstance.asInstanceOf[js.Any], useInstance = useInstance.asInstanceOf[js.Any], useInstanceBeforeDimensions = useInstanceBeforeDimensions.asInstanceOf[js.Any], useOptions = useOptions.asInstanceOf[js.Any], visibleColumns = visibleColumns.asInstanceOf[js.Any], visibleColumnsDeps = visibleColumnsDeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseTableHooks[D]]
  }
  @scala.inline
  implicit class UseTableHooksOps[Self[d] <: UseTableHooks[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAllColumns(
      value: js.Array[
          js.Function2[
            /* allColumns */ js.Array[ColumnInstance[D]], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[Column[D]]
          ]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllColumnsDeps(
      value: js.Array[
          js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allColumnsDeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(
      value: js.Array[
          js.Function2[
            /* columns */ js.Array[Column[D]], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[Column[D]]
          ]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnsDeps(
      value: js.Array[
          js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsDeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCellProps(value: js.Array[CellPropGetter[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFooterGroupProps(value: js.Array[FooterGroupPropGetter[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFooterGroupProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFooterProps(value: js.Array[FooterPropGetter[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFooterProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHeaderGroupProps(value: js.Array[HeaderGroupPropGetter[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderGroupProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHeaderProps(value: js.Array[HeaderPropGetter[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRowProps(value: js.Array[RowPropGetter[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTableBodyProps(value: js.Array[TableBodyPropGetter[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTableBodyProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTableProps(value: js.Array[TablePropGetter[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTableProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderGroups(
      value: js.Array[
          js.Function2[
            /* allColumns */ js.Array[HeaderGroup[D]], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[HeaderGroup[D]]
          ]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderGroupsDeps(
      value: js.Array[
          js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerGroupsDeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrepareRow(
      value: js.Array[
          js.Function2[/* row */ Row[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], Unit]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateReducers(
      value: js.Array[
          js.Function4[
            /* newState */ TableState[D], 
            /* action */ ActionType, 
            /* previousState */ js.UndefOr[TableState[D]], 
            /* instance */ js.UndefOr[TableInstance[D]], 
            js.UndefOr[ReducerTableState[D]]
          ]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseControlledState(
      value: js.Array[
          js.Function2[
            /* state */ TableState[D], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            TableState[D]
          ]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useControlledState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseFinalInstance(value: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFinalInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseInstance(value: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseInstanceBeforeDimensions(value: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInstanceBeforeDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseOptions(
      value: js.Array[
          js.Function2[/* options */ TableOptions[D], /* args */ TableOptions[D], TableOptions[D]]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleColumns(
      value: js.Array[
          js.Function2[
            /* allColumns */ js.Array[ColumnInstance[D]], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[Column[D]]
          ]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleColumnsDeps(
      value: js.Array[
          js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
        ]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleColumnsDeps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

