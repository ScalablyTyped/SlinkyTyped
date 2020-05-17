package typingsSlinky.baseui.tabsMod

import slinky.core.TagMod
import typingsSlinky.baseui.anon.ActiveKey
import typingsSlinky.baseui.anon.SharedPropsactiveboolean
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/tabs.TabsProps & {  activeKey ? :never,   renderAll ? :boolean,   initialState ? :baseui.baseui/tabs.State,   stateReducer ? :baseui.baseui/tabs.StateReducer} */
@js.native
trait StatefulTabsProps extends js.Object {
  var activeKey: js.UndefOr[Key] = js.native
  var children: TagMod[Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var initialState: js.UndefOr[State] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ ActiveKey, _]] = js.native
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  var overrides: js.UndefOr[TabsOverrides[SharedPropsactiveboolean]] = js.native
  var renderAll: js.UndefOr[Boolean] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
}

object StatefulTabsProps {
  @scala.inline
  def apply(): StatefulTabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulTabsProps]
  }
  @scala.inline
  implicit class StatefulTabsPropsOps[Self <: StatefulTabsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeKey")(js.undefined)
        ret
    }
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
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: State): Self = {
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
    def withOnChange(value: /* args */ ActiveKey => _): Self = {
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
    def withOrientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: TabsOverrides[SharedPropsactiveboolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = {
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

