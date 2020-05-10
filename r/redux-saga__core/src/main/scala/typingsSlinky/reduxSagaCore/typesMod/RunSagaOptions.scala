package typingsSlinky.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunSagaOptions[A, S] extends js.Object {
  /**
    * See docs for `channel`
    */
  var channel: js.UndefOr[PredicateTakeableChannel[A]] = js.native
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var context: js.UndefOr[js.Object] = js.native
  /**
    * Used to fulfill `put` effects.
    *
    * @param output argument provided by the Saga to the `put` Effect
    */
  var dispatch: js.UndefOr[js.Function1[/* output */ A, _]] = js.native
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var effectMiddlewares: js.UndefOr[js.Array[EffectMiddleware]] = js.native
  /**
    * Used to fulfill `select` and `getState` effects
    */
  var getState: js.UndefOr[js.Function0[S]] = js.native
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var sagaMonitor: js.UndefOr[SagaMonitor] = js.native
}

object RunSagaOptions {
  @scala.inline
  def apply[A, S](): RunSagaOptions[A, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunSagaOptions[A, S]]
  }
  @scala.inline
  implicit class RunSagaOptionsOps[Self[a, s] <: RunSagaOptions[a, s], A, S] (val x: Self[A, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, S]) with Other]
    @scala.inline
    def withChannel(value: PredicateTakeableChannel[A]): Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Object): Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatch(value: /* output */ A => _): Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDispatch: Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectMiddlewares(value: js.Array[EffectMiddleware]): Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectMiddlewares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectMiddlewares: Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectMiddlewares")(js.undefined)
        ret
    }
    @scala.inline
    def withGetState(value: () => S): Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetState: Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Unit): Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withSagaMonitor(value: SagaMonitor): Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sagaMonitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSagaMonitor: Self[A, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sagaMonitor")(js.undefined)
        ret
    }
  }
  
}

