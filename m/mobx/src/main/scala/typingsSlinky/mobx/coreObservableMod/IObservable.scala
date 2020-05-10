package typingsSlinky.mobx.coreObservableMod

import typingsSlinky.mobx.derivationMod.IDerivation
import typingsSlinky.mobx.derivationMod.IDerivationState
import typingsSlinky.mobx.utilsMod.Lambda
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservable extends IDepTreeNode {
  var diffValue: Double = js.native
  var isBeingObserved: Boolean = js.native
  var isPendingUnobservation: Boolean = js.native
  /**
    * Id of the derivation *run* that last accessed this observable.
    * If this id equals the *run* id of the current derivation,
    * the dependency is already established
    */
  var lastAccessedBy: Double = js.native
  var lowestObserverState: IDerivationState = js.native
  var observers: Set[IDerivation] = js.native
  var onBecomeObservedListeners: js.UndefOr[Set[Lambda]] = js.native
  var onBecomeUnobservedListeners: js.UndefOr[Set[Lambda]] = js.native
  def onBecomeObserved(): Unit = js.native
  def onBecomeUnobserved(): Unit = js.native
}

object IObservable {
  @scala.inline
  def apply(
    diffValue: Double,
    isBeingObserved: Boolean,
    isPendingUnobservation: Boolean,
    lastAccessedBy: Double,
    lowestObserverState: IDerivationState,
    name: String,
    observers: Set[IDerivation],
    onBecomeObserved: () => Unit,
    onBecomeUnobserved: () => Unit
  ): IObservable = {
    val __obj = js.Dynamic.literal(diffValue = diffValue.asInstanceOf[js.Any], isBeingObserved = isBeingObserved.asInstanceOf[js.Any], isPendingUnobservation = isPendingUnobservation.asInstanceOf[js.Any], lastAccessedBy = lastAccessedBy.asInstanceOf[js.Any], lowestObserverState = lowestObserverState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], onBecomeObserved = js.Any.fromFunction0(onBecomeObserved), onBecomeUnobserved = js.Any.fromFunction0(onBecomeUnobserved))
    __obj.asInstanceOf[IObservable]
  }
  @scala.inline
  implicit class IObservableOps[Self <: IObservable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiffValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBeingObserved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeingObserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPendingUnobservation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPendingUnobservation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastAccessedBy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccessedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowestObserverState(value: IDerivationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowestObserverState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObservers(value: Set[IDerivation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBecomeObserved(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBecomeObserved")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnBecomeUnobserved(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBecomeUnobserved")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnBecomeObservedListeners(value: Set[Lambda]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBecomeObservedListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBecomeObservedListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBecomeObservedListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBecomeUnobservedListeners(value: Set[Lambda]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBecomeUnobservedListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBecomeUnobservedListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBecomeUnobservedListeners")(js.undefined)
        ret
    }
  }
  
}

