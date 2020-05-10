package typingsSlinky.mobx.derivationMod

import typingsSlinky.mobx.coreObservableMod.IDepTreeNode
import typingsSlinky.mobx.coreObservableMod.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDerivation extends IDepTreeNode {
  var __mapid: String = js.native
  var dependenciesState: IDerivationState = js.native
  var isTracing: TraceMode = js.native
  var newObserving: Null | js.Array[IObservable] = js.native
  @JSName("observing")
  var observing_IDerivation: js.Array[IObservable] = js.native
  /**
    *  warn if the derivation has no dependencies after creation/update
    */
  var requiresObservable: js.UndefOr[Boolean] = js.native
  /**
    * Id of the current run of a derivation. Each time the derivation is tracked
    * this number is increased by one. This number is globally unique
    */
  var runId: Double = js.native
  /**
    * amount of dependencies used by the derivation in this run, which has not been bound yet.
    */
  var unboundDepsCount: Double = js.native
  def onBecomeStale(): Unit = js.native
}

object IDerivation {
  @scala.inline
  def apply(
    __mapid: String,
    dependenciesState: IDerivationState,
    isTracing: TraceMode,
    name: String,
    observing: js.Array[IObservable],
    onBecomeStale: () => Unit,
    runId: Double,
    unboundDepsCount: Double
  ): IDerivation = {
    val __obj = js.Dynamic.literal(__mapid = __mapid.asInstanceOf[js.Any], dependenciesState = dependenciesState.asInstanceOf[js.Any], isTracing = isTracing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observing = observing.asInstanceOf[js.Any], onBecomeStale = js.Any.fromFunction0(onBecomeStale), runId = runId.asInstanceOf[js.Any], unboundDepsCount = unboundDepsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDerivation]
  }
  @scala.inline
  implicit class IDerivationOps[Self <: IDerivation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__mapid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__mapid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependenciesState(value: IDerivationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependenciesState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTracing(value: TraceMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTracing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObserving(value: js.Array[IObservable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBecomeStale(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBecomeStale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRunId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnboundDepsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unboundDepsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewObserving(value: js.Array[IObservable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newObserving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewObservingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newObserving")(null)
        ret
    }
    @scala.inline
    def withRequiresObservable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresObservable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresObservable")(js.undefined)
        ret
    }
  }
  
}

