package typingsSlinky.baseui.accordionMod

import typingsSlinky.baseui.AnonExpandedBoolean
import typingsSlinky.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedStatefulPanelContainerProps extends js.Object {
  var initialState: js.UndefOr[PanelState] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ AnonExpandedBoolean, _]] = js.native
  var stateReducer: js.UndefOr[StateReducer[PanelState]] = js.native
}

object SharedStatefulPanelContainerProps {
  @scala.inline
  def apply(): SharedStatefulPanelContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStatefulPanelContainerProps]
  }
  @scala.inline
  implicit class SharedStatefulPanelContainerPropsOps[Self <: SharedStatefulPanelContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialState(value: PanelState): Self = {
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
    def withOnChange(value: /* args */ AnonExpandedBoolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReducer(value: (expand, PanelState, PanelState) => PanelState): Self = {
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

