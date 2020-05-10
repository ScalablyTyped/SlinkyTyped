package typingsSlinky.baseui.menuMod

import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedStatelessProps extends js.Object {
  var activedescendantId: js.UndefOr[String] = js.native
  var focusMenu: js.UndefOr[js.Function1[/* event */ FocusEvent | MouseEvent | KeyboardEvent, _]] = js.native
  var getRequiredItemProps: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, RenderItemProps]] = js.native
  var highlightedIndex: js.UndefOr[Double] = js.native
  var items: ItemsT = js.native
  var noResultsMsg: js.UndefOr[TagMod[Any]] = js.native
  var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[HTMLElement], _]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[HTMLElement], _]] = js.native
  var rootRef: js.UndefOr[Ref[_]] = js.native
  var unfocusMenu: js.UndefOr[js.Function0[_]] = js.native
}

object SharedStatelessProps {
  @scala.inline
  def apply(items: ItemsT): SharedStatelessProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStatelessProps]
  }
  @scala.inline
  implicit class SharedStatelessPropsOps[Self <: SharedStatelessProps] (val x: Self) extends AnyVal {
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
    def withActivedescendantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activedescendantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivedescendantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activedescendantId")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusMenu(value: /* event */ FocusEvent | MouseEvent | KeyboardEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusMenu")(js.undefined)
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
    def withHighlightedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightedIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResultsMsgReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoResultsMsg(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResultsMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* event */ SyntheticFocusEvent[HTMLElement] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* event */ SyntheticFocusEvent[HTMLElement] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
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
    def withUnfocusMenu(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfocusMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUnfocusMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfocusMenu")(js.undefined)
        ret
    }
  }
  
}

