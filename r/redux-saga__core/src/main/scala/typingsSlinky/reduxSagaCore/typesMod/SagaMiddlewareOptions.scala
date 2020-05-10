package typingsSlinky.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SagaMiddlewareOptions[C /* <: js.Object */] extends js.Object {
  /**
    * Initial value of the saga's context.
    */
  var context: js.UndefOr[C] = js.native
  /**
    * Allows you to intercept any effect, resolve it on your own and pass to the
    * next middleware.
    */
  var effectMiddlewares: js.UndefOr[js.Array[EffectMiddleware]] = js.native
  /**
    * If provided, the middleware will call it with uncaught errors from Sagas.
    * useful for sending uncaught exceptions to error tracking services.
    */
  var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  /**
    * If a Saga Monitor is provided, the middleware will deliver monitoring
    * events to the monitor.
    */
  var sagaMonitor: js.UndefOr[SagaMonitor] = js.native
}

object SagaMiddlewareOptions {
  @scala.inline
  def apply[C](): SagaMiddlewareOptions[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SagaMiddlewareOptions[C]]
  }
  @scala.inline
  implicit class SagaMiddlewareOptionsOps[Self[c] <: SagaMiddlewareOptions[c], C] (val x: Self[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[C] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[C] with Other]
    @scala.inline
    def withContext(value: C): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectMiddlewares(value: js.Array[EffectMiddleware]): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectMiddlewares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectMiddlewares: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectMiddlewares")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Unit): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withSagaMonitor(value: SagaMonitor): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sagaMonitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSagaMonitor: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sagaMonitor")(js.undefined)
        ret
    }
  }
  
}

