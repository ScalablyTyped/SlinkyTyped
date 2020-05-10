package typingsSlinky.reactTable.mod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  columns  :std.Array<react-table.react-table.Column<D>>,   data  :std.Array<D>} & std.Partial<{  initialState  :std.Partial<react-table.react-table.TableState<D>>, stateReducer (newState : react-table.react-table.TableState<D>, action : react-table.react-table.ActionType, previousState : react-table.react-table.TableState<D>): react-table.react-table.TableState<D>, useControlledState (state : react-table.react-table.TableState<D>, meta : react-table.react-table.Meta<D, never, react-table.react-table.MetaBase<D>>): react-table.react-table.TableState<D>,   defaultColumn  :std.Partial<react-table.react-table.Column<D>>, getSubRows (originalRow : D, relativeIndex : number): std.Array<D>, getRowId (originalRow : D, relativeIndex : number, parent ? : react-table.react-table.Row<D>): string}> */
@js.native
trait UseTableOptions[D /* <: js.Object */] extends js.Object {
  var columns: js.Array[Column[D]] = js.native
  var data: js.Array[D] = js.native
  var defaultColumn: js.UndefOr[Partial[Column[D]]] = js.native
  var getRowId: js.UndefOr[
    js.Function3[
      /* originalRow */ D, 
      /* relativeIndex */ Double, 
      /* parent */ js.UndefOr[Row[D]], 
      String
    ]
  ] = js.native
  var getSubRows: js.UndefOr[js.Function2[/* originalRow */ D, /* relativeIndex */ Double, js.Array[D]]] = js.native
  var initialState: js.UndefOr[Partial[TableState[D]]] = js.native
  var stateReducer: js.UndefOr[
    js.Function3[
      /* newState */ TableState[D], 
      /* action */ ActionType, 
      /* previousState */ TableState[D], 
      TableState[D]
    ]
  ] = js.native
  var useControlledState: js.UndefOr[
    js.Function2[
      /* state */ TableState[D], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      TableState[D]
    ]
  ] = js.native
}

object UseTableOptions {
  @scala.inline
  def apply[D](columns: js.Array[Column[D]], data: js.Array[D]): UseTableOptions[D] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseTableOptions[D]]
  }
  @scala.inline
  implicit class UseTableOptionsOps[Self[d] <: UseTableOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withColumns(value: js.Array[Column[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultColumn(value: Partial[Column[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColumn: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowId(
      value: (/* originalRow */ D, /* relativeIndex */ Double, /* parent */ js.UndefOr[Row[D]]) => String
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowId")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetRowId: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSubRows(value: (/* originalRow */ D, /* relativeIndex */ Double) => js.Array[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubRows")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetSubRows: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubRows")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: Partial[TableState[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReducer(
      value: (/* newState */ TableState[D], /* action */ ActionType, /* previousState */ TableState[D]) => TableState[D]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStateReducer: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.undefined)
        ret
    }
    @scala.inline
    def withUseControlledState(
      value: (/* state */ TableState[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]]) => TableState[D]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useControlledState")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUseControlledState: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useControlledState")(js.undefined)
        ret
    }
  }
  
}

