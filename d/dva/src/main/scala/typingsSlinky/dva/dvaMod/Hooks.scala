package typingsSlinky.dva.dvaMod

import typingsSlinky.redux.reduxMod.Action
import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Dispatch
import typingsSlinky.redux.reduxMod.Reducer
import typingsSlinky.redux.reduxMod.ReducersMapObject
import typingsSlinky.redux.reduxMod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  var extraEnhancers: js.UndefOr[js.Array[StoreEnhancer[_, js.Object]]] = js.undefined
  var extraReducers: js.UndefOr[ReducersMapObject[_, Action[_]]] = js.undefined
  var onAction: js.UndefOr[onActionFunc | js.Array[onActionFunc]] = js.undefined
  var onEffect: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function2[/* e */ js.Error, /* dispatch */ Dispatch[_], Unit]] = js.undefined
  var onHmr: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onReducer: js.UndefOr[ReducerEnhancer] = js.undefined
  var onStateChange: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Hooks {
  @scala.inline
  def apply(
    extraEnhancers: js.Array[StoreEnhancer[_, js.Object]] = null,
    extraReducers: ReducersMapObject[_, Action[_]] = null,
    onAction: onActionFunc | js.Array[onActionFunc] = null,
    onEffect: () => Unit = null,
    onError: (/* e */ js.Error, /* dispatch */ Dispatch[_]) => Unit = null,
    onHmr: () => Unit = null,
    onReducer: /* reducer */ Reducer[js.Any, AnyAction] => Unit = null,
    onStateChange: () => Unit = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (extraEnhancers != null) __obj.updateDynamic("extraEnhancers")(extraEnhancers.asInstanceOf[js.Any])
    if (extraReducers != null) __obj.updateDynamic("extraReducers")(extraReducers.asInstanceOf[js.Any])
    if (onAction != null) __obj.updateDynamic("onAction")(onAction.asInstanceOf[js.Any])
    if (onEffect != null) __obj.updateDynamic("onEffect")(js.Any.fromFunction0(onEffect))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2(onError))
    if (onHmr != null) __obj.updateDynamic("onHmr")(js.Any.fromFunction0(onHmr))
    if (onReducer != null) __obj.updateDynamic("onReducer")(js.Any.fromFunction1(onReducer))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction0(onStateChange))
    __obj.asInstanceOf[Hooks]
  }
}

