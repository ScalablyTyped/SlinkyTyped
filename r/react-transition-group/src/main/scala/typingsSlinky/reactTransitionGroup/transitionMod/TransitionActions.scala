package typingsSlinky.reactTransitionGroup.transitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionActions extends js.Object {
  /**
    * Normally a component is not transitioned if it is shown when the
    * `<Transition>` component mounts. If you want to transition on the first
    * mount set  appear to true, and the component will transition in as soon
    * as the `<Transition>` mounts. Note: there are no specific "appear" states.
    * appear only adds an additional enter transition.
    */
  var appear: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable enter transitions.
    */
  var enter: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable exit transitions.
    */
  var exit: js.UndefOr[Boolean] = js.native
}

object TransitionActions {
  @scala.inline
  def apply(): TransitionActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionActions]
  }
  @scala.inline
  implicit class TransitionActionsOps[Self <: TransitionActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appear")(js.undefined)
        ret
    }
    @scala.inline
    def withEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.undefined)
        ret
    }
  }
  
}

