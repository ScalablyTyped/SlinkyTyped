package typingsSlinky.mobx

import typingsSlinky.mobx.mobxStrings.always
import typingsSlinky.mobx.mobxStrings.never
import typingsSlinky.mobx.mobxStrings.observed
import typingsSlinky.mobx.mobxStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComputedConfigurable extends js.Object {
  var computedConfigurable: js.UndefOr[Boolean] = js.native
  var computedRequiresReaction: js.UndefOr[Boolean] = js.native
  var disableErrorBoundaries: js.UndefOr[Boolean] = js.native
  var enforceActions: js.UndefOr[Boolean | strict | never | always | observed] = js.native
  var isolateGlobalState: js.UndefOr[Boolean] = js.native
  /**
    * (Experimental)
    * Warn if observables are accessed outside a reactive context
    */
  var observableRequiresReaction: js.UndefOr[Boolean] = js.native
  /**
    * (Experimental)
    * Warn if you try to create to derivation / reactive context without accessing any observable.
    */
  var reactionRequiresObservable: js.UndefOr[Boolean] = js.native
  var reactionScheduler: js.UndefOr[js.Function1[/* f */ js.Function0[Unit], Unit]] = js.native
}

object AnonComputedConfigurable {
  @scala.inline
  def apply(): AnonComputedConfigurable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonComputedConfigurable]
  }
  @scala.inline
  implicit class AnonComputedConfigurableOps[Self <: AnonComputedConfigurable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputedConfigurable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computedConfigurable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputedConfigurable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computedConfigurable")(js.undefined)
        ret
    }
    @scala.inline
    def withComputedRequiresReaction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computedRequiresReaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputedRequiresReaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computedRequiresReaction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableErrorBoundaries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableErrorBoundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableErrorBoundaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableErrorBoundaries")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceActions(value: Boolean | strict | never | always | observed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceActions")(js.undefined)
        ret
    }
    @scala.inline
    def withIsolateGlobalState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolateGlobalState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsolateGlobalState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolateGlobalState")(js.undefined)
        ret
    }
    @scala.inline
    def withObservableRequiresReaction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observableRequiresReaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservableRequiresReaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observableRequiresReaction")(js.undefined)
        ret
    }
    @scala.inline
    def withReactionRequiresObservable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactionRequiresObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReactionRequiresObservable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactionRequiresObservable")(js.undefined)
        ret
    }
    @scala.inline
    def withReactionScheduler(value: /* f */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactionScheduler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReactionScheduler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactionScheduler")(js.undefined)
        ret
    }
  }
  
}

