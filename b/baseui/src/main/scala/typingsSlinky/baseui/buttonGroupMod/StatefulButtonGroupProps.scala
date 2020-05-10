package typingsSlinky.baseui.buttonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulButtonGroupProps extends ButtonGroupProps {
  var initialState: js.UndefOr[InitialState] = js.native
  var stateReducer: js.UndefOr[
    js.Function3[
      /* stateType */ STATE_CHANGE_TYPE, 
      /* nextState */ State, 
      /* currentState */ State, 
      State
    ]
  ] = js.native
}

object StatefulButtonGroupProps {
  @scala.inline
  def apply(): StatefulButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulButtonGroupProps]
  }
  @scala.inline
  implicit class StatefulButtonGroupPropsOps[Self <: StatefulButtonGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialState(value: InitialState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReducer(
      value: (/* stateType */ STATE_CHANGE_TYPE, /* nextState */ State, /* currentState */ State) => State
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStateReducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.undefined)
        ret
    }
  }
  
}

