package typingsSlinky.qlikVisualizationextensions.SelectionStateAPI

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQSelectionState extends js.Object {
  /**
    * Number of back steps available.
    */
  var backCount: Double = js.native
  /**
    * Number of forward steps available. OnData notification will be triggered after each update.
    */
  var forwardCount: Double = js.native
  /**
    * Selections
    */
  var selections: IQFieldSelections = js.native
  /**
    * State name. $ for default state.
    */
  var stateName: String = js.native
  /**
    * Cleara all selections in this state.
    * @param lockedAlso - Use to also clear locked fields.
    * @return - A promise of a Qlik engine reply.
    */
  def clearAll(lockedAlso: Boolean): IPromise[_] = js.native
  /**
    * Locks all selections in this state.
    * @return - A promise of a Qlik engine reply.
    */
  def lockAll(): IPromise[_] = js.native
  /**
    * Unlocks all selections in this state.
    * @return - A promise of a Qlik engine reply.
    */
  def unlockAll(): IPromise[_] = js.native
}

object IQSelectionState {
  @scala.inline
  def apply(
    backCount: Double,
    clearAll: Boolean => IPromise[_],
    forwardCount: Double,
    lockAll: () => IPromise[_],
    selections: IQFieldSelections,
    stateName: String,
    unlockAll: () => IPromise[_]
  ): IQSelectionState = {
    val __obj = js.Dynamic.literal(backCount = backCount.asInstanceOf[js.Any], clearAll = js.Any.fromFunction1(clearAll), forwardCount = forwardCount.asInstanceOf[js.Any], lockAll = js.Any.fromFunction0(lockAll), selections = selections.asInstanceOf[js.Any], stateName = stateName.asInstanceOf[js.Any], unlockAll = js.Any.fromFunction0(unlockAll))
    __obj.asInstanceOf[IQSelectionState]
  }
  @scala.inline
  implicit class IQSelectionStateOps[Self <: IQSelectionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearAll(value: Boolean => IPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForwardCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockAll(value: () => IPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelections(value: IQFieldSelections): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlockAll(value: () => IPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockAll")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

