package typingsSlinky.reduxSagaCore.typesMod

import typingsSlinky.redux.mod.Action
import typingsSlinky.reduxSagaCore.anon.Args
import typingsSlinky.reduxSagaCore.anon.Effect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SagaMonitor extends js.Object {
  /**
    * @param action The dispatched Redux action. If the action was dispatched by
    * a Saga then the action will have a property `SAGA_ACTION` set to true
    * (`SAGA_ACTION` can be imported from `@redux-saga/symbols`).
    */
  var actionDispatched: js.UndefOr[js.Function1[/* action */ Action[_], Unit]] = js.native
  /**
    * @param effectId The ID of the yielded effect
    */
  var effectCancelled: js.UndefOr[js.Function1[/* effectId */ Double, Unit]] = js.native
  /**
    * @param effectId The ID of the yielded effect
    * @param error Error raised with the rejection of the effect
    */
  var effectRejected: js.UndefOr[js.Function2[/* effectId */ Double, /* error */ js.Any, Unit]] = js.native
  /**
    * @param effectId The ID of the yielded effect
    * @param result The result of the successful resolution of the effect. In
    *   case of `fork` or `spawn` effects, the result will be a `Task` object.
    */
  var effectResolved: js.UndefOr[js.Function2[/* effectId */ Double, /* result */ js.Any, Unit]] = js.native
  /**
    * @param effectId Unique ID assigned to the yielded effect
    * @param parentEffectId ID of the parent Effect. In the case of a `race` or
    *   `parallel` effect, all effects yielded inside will have the direct
    *   race/parallel effect as a parent. In case of a top-level effect, the
    *   parent will be the containing Saga
    * @param label In case of a `race`/`all` effect, all child effects will be
    *   assigned as label the corresponding keys of the object passed to
    *   `race`/`all`
    * @param effect The yielded effect itself
    */
  var effectTriggered: js.UndefOr[js.Function1[/* options */ Effect, Unit]] = js.native
  /**
    * @param effectId Unique ID assigned to this root saga execution
    * @param saga The generator function that starts to run
    * @param args The arguments passed to the generator function
    */
  var rootSagaStarted: js.UndefOr[js.Function1[/* options */ Args, Unit]] = js.native
}

object SagaMonitor {
  @scala.inline
  def apply(): SagaMonitor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SagaMonitor]
  }
  @scala.inline
  implicit class SagaMonitorOps[Self <: SagaMonitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionDispatched(value: /* action */ Action[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionDispatched")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionDispatched: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionDispatched")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectCancelled(value: /* effectId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectCancelled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEffectCancelled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectCancelled")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectRejected(value: (/* effectId */ Double, /* error */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectRejected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEffectRejected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectRejected")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectResolved(value: (/* effectId */ Double, /* result */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectResolved")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEffectResolved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectResolved")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectTriggered(value: /* options */ Effect => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectTriggered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEffectTriggered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectTriggered")(js.undefined)
        ret
    }
    @scala.inline
    def withRootSagaStarted(value: /* options */ Args => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootSagaStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRootSagaStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootSagaStarted")(js.undefined)
        ret
    }
  }
  
}

