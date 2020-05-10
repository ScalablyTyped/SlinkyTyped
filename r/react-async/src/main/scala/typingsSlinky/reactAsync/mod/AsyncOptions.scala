package typingsSlinky.reactAsync.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.AbortController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncOptions[T]
  extends /* prop */ StringDictionary[js.Any] {
  var debugLabel: js.UndefOr[String] = js.native
  var deferFn: js.UndefOr[DeferFn[T]] = js.native
  var dispatcher: js.UndefOr[
    js.Function3[
      /* action */ AsyncAction[T], 
      /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], 
      /* props */ AsyncProps[T], 
      Unit
    ]
  ] = js.native
  var initialValue: js.UndefOr[T] = js.native
  var onReject: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  var onResolve: js.UndefOr[js.Function1[/* data */ T, Unit]] = js.native
  var promise: js.UndefOr[js.Promise[T]] = js.native
  var promiseFn: js.UndefOr[PromiseFn[T]] = js.native
  var reducer: js.UndefOr[
    js.Function3[
      /* state */ AsyncState[T], 
      /* action */ AsyncAction[T], 
      /* internalReducer */ js.Function2[/* state */ AsyncState[T], /* action */ AsyncAction[T], AsyncState[T]], 
      AsyncState[T]
    ]
  ] = js.native
  var watch: js.UndefOr[js.Any] = js.native
  var watchFn: js.UndefOr[js.Function2[/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T], _]] = js.native
}

object AsyncOptions {
  @scala.inline
  def apply[T](): AsyncOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncOptions[T]]
  }
  @scala.inline
  implicit class AsyncOptionsOps[Self[t] <: AsyncOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDebugLabel(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferFn(
      value: (/* args */ js.Array[js.Any], /* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDeferFn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferFn")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatcher(
      value: (/* action */ AsyncAction[T], /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], /* props */ AsyncProps[T]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatcher")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDispatcher: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatcher")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReject(value: /* error */ js.Error => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReject: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResolve(value: /* data */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResolve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResolve: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResolve")(js.undefined)
        ret
    }
    @scala.inline
    def withPromise(value: js.Promise[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseFn(value: (/* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPromiseFn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseFn")(js.undefined)
        ret
    }
    @scala.inline
    def withReducer(
      value: (/* state */ AsyncState[T], /* action */ AsyncAction[T], /* internalReducer */ js.Function2[/* state */ AsyncState[T], /* action */ AsyncAction[T], AsyncState[T]]) => AsyncState[T]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutReducer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducer")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchFn(value: (/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T]) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWatchFn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchFn")(js.undefined)
        ret
    }
  }
  
}

