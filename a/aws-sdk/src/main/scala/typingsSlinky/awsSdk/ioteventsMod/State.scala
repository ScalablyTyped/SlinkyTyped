package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  /**
    * When entering this state, perform these actions if the condition is TRUE.
    */
  var onEnter: js.UndefOr[OnEnterLifecycle] = js.native
  /**
    * When exiting this state, perform these actions if the specified condition is TRUE.
    */
  var onExit: js.UndefOr[OnExitLifecycle] = js.native
  /**
    * When an input is received and the condition is TRUE, perform the specified actions.
    */
  var onInput: js.UndefOr[OnInputLifecycle] = js.native
  /**
    * The name of the state.
    */
  var stateName: StateName = js.native
}

object State {
  @scala.inline
  def apply(stateName: StateName): State = {
    val __obj = js.Dynamic.literal(stateName = stateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateName(value: StateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEnter(value: OnEnterLifecycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExit(value: OnExitLifecycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: OnInputLifecycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
  }
  
}

