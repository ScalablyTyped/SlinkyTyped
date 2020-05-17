package typingsSlinky.baseui.menuMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import typingsSlinky.baseui.anon.Item
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.focus
import typingsSlinky.baseui.baseuiStrings.mouseEnter
import typingsSlinky.baseui.baseuiStrings.moveDown
import typingsSlinky.baseui.baseuiStrings.moveUp
import typingsSlinky.baseui.baseuiStrings.reset
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulContainerProps extends js.Object {
  var addMenuToNesting: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.native
  var children: js.UndefOr[js.Function1[/* args */ RenderProps, TagMod[Any]]] = js.native
  var getChildMenu: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.native
  var getParentMenu: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.native
  var getRequiredItemProps: js.UndefOr[GetRequiredItemProps] = js.native
  var initialState: js.UndefOr[StatefulContainerState] = js.native
  var items: ItemsT = js.native
  var onActiveDescendantChange: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  var onItemSelect: js.UndefOr[OnItemSelect] = js.native
  var removeMenuFromNesting: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.native
  var rootRef: js.UndefOr[Ref[_]] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
}

object StatefulContainerProps {
  @scala.inline
  def apply(items: ItemsT): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerProps]
  }
  @scala.inline
  implicit class StatefulContainerPropsOps[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: ItemsT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddMenuToNesting(value: /* ref */ Ref[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMenuToNesting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddMenuToNesting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMenuToNesting")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: /* args */ RenderProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withGetChildMenu(value: /* ref */ Ref[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetChildMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParentMenu(value: /* ref */ Ref[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetParentMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRequiredItemProps(value: (/* item */ js.Any, /* index */ Double) => RenderItemProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequiredItemProps")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetRequiredItemProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequiredItemProps")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: StatefulContainerState): Self = {
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
    def withOnActiveDescendantChange(value: /* id */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveDescendantChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnActiveDescendantChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveDescendantChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemSelect(value: /* args */ Item => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveMenuFromNesting(value: /* ref */ Ref[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMenuFromNesting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveMenuFromNesting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMenuFromNesting")(js.undefined)
        ret
    }
    @scala.inline
    def withRootRefRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootRefFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRootRef(value: Ref[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootRef")(js.undefined)
        ret
    }
    @scala.inline
    def withRootRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootRef")(null)
        ret
    }
    @scala.inline
    def withStateReducer(
      value: (/* changeType */ moveDown | moveUp | reset | click | focus | mouseEnter, /* changes */ StatefulContainerState, /* currentState */ StatefulContainerState) => StatefulContainerState
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

