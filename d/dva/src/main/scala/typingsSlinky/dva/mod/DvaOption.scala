package typingsSlinky.dva.mod

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.MiddlewareAPI
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.redux.mod.ReducersMapObject
import typingsSlinky.redux.mod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dva.dva.Hooks & {  initialState ? :std.Object,   history ? :std.Object} */
@js.native
trait DvaOption extends js.Object {
  var extraEnhancers: js.UndefOr[js.Array[StoreEnhancer[_, js.Object]]] = js.native
  var extraReducers: js.UndefOr[ReducersMapObject[_, Action[_]]] = js.native
  var history: js.UndefOr[js.Object] = js.native
  var initialState: js.UndefOr[js.Object] = js.native
  var onAction: js.UndefOr[onActionFunc | js.Array[onActionFunc]] = js.native
  var onEffect: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[js.Function2[/* e */ js.Error, /* dispatch */ Dispatch[_], Unit]] = js.native
  var onHmr: js.UndefOr[js.Function0[Unit]] = js.native
  var onReducer: js.UndefOr[ReducerEnhancer] = js.native
  var onStateChange: js.UndefOr[js.Function0[Unit]] = js.native
}

object DvaOption {
  @scala.inline
  def apply(): DvaOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvaOption]
  }
  @scala.inline
  implicit class DvaOptionOps[Self <: DvaOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraEnhancers(value: js.Array[StoreEnhancer[_, js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraEnhancers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraEnhancers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraEnhancers")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraReducers(value: ReducersMapObject[_, Action[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraReducers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraReducers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraReducers")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActionFunction1(value: /* api */ MiddlewareAPI[js.Any, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAction(value: onActionFunc | js.Array[onActionFunc]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAction")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEffect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEffect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: (/* e */ js.Error, /* dispatch */ Dispatch[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHmr(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHmr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHmr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHmr")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReducer(value: /* reducer */ Reducer[js.Any, AnyAction] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReducer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReducer")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStateChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.undefined)
        ret
    }
  }
  
}

