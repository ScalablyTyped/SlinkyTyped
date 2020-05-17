package typingsSlinky.baseui.accordionMod

import slinky.core.TagMod
import typingsSlinky.baseui.anon.ExpandedBoolean
import typingsSlinky.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/accordion.SharedStatefulPanelContainerProps & {  children  :react.react.ReactNode} */
@js.native
trait StatefulPanelContainerProps extends js.Object {
  var children: TagMod[Any] = js.native
  var initialState: js.UndefOr[PanelState] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ ExpandedBoolean, _]] = js.native
  var stateReducer: js.UndefOr[StateReducer[PanelState]] = js.native
}

object StatefulPanelContainerProps {
  @scala.inline
  def apply(): StatefulPanelContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPanelContainerProps]
  }
  @scala.inline
  implicit class StatefulPanelContainerPropsOps[Self <: StatefulPanelContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
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
    def withOnChange(value: /* args */ ExpandedBoolean => _): Self = {
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

