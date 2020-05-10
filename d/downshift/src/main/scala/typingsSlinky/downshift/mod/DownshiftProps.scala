package typingsSlinky.downshift.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownshiftProps[Item] extends js.Object {
  var children: js.UndefOr[ChildrenFunction[Item]] = js.native
  var defaultHighlightedIndex: js.UndefOr[Double | Null] = js.native
  var defaultIsOpen: js.UndefOr[Boolean] = js.native
  var environment: js.UndefOr[Environment] = js.native
  var getA11yStatusMessage: js.UndefOr[js.Function1[/* options */ A11yStatusMessageOptions[Item], String]] = js.native
  var getItemId: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], String]] = js.native
  var highlightedIndex: js.UndefOr[Double | Null] = js.native
  var id: js.UndefOr[String] = js.native
  var initialHighlightedIndex: js.UndefOr[Double | Null] = js.native
  var initialInputValue: js.UndefOr[String] = js.native
  var initialIsOpen: js.UndefOr[Boolean] = js.native
  var initialSelectedItem: js.UndefOr[Item] = js.native
  var inputId: js.UndefOr[String] = js.native
  var inputValue: js.UndefOr[String | Null] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var itemCount: js.UndefOr[Double] = js.native
  var itemToString: js.UndefOr[js.Function1[/* item */ Item | Null, String]] = js.native
  var labelId: js.UndefOr[String] = js.native
  var menuId: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[
    js.Function2[
      /* selectedItem */ Item | Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.native
  var onInputValueChange: js.UndefOr[
    js.Function2[/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[Item], Unit]
  ] = js.native
  var onOuterClick: js.UndefOr[js.Function1[/* stateAndHelpers */ ControllerStateAndHelpers[Item], Unit]] = js.native
  var onSelect: js.UndefOr[
    js.Function2[
      /* selectedItem */ Item | Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.native
  var onStateChange: js.UndefOr[
    js.Function2[
      /* options */ StateChangeOptions[Item], 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.native
  var onUserAction: js.UndefOr[
    js.Function2[
      /* options */ StateChangeOptions[Item], 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.native
  var scrollIntoView: js.UndefOr[js.Function2[/* node */ HTMLElement, /* menuNode */ HTMLElement, Unit]] = js.native
  var selectedItem: js.UndefOr[Item | Null] = js.native
  var selectedItemChanged: js.UndefOr[js.Function2[/* prevItem */ Item, /* item */ Item, Boolean]] = js.native
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ DownshiftState[Item], 
      /* changes */ StateChangeOptions[Item], 
      Partial[StateChangeOptions[Item]]
    ]
  ] = js.native
  var suppressRefError: js.UndefOr[Boolean] = js.native
}

object DownshiftProps {
  @scala.inline
  def apply[Item](): DownshiftProps[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownshiftProps[Item]]
  }
  @scala.inline
  implicit class DownshiftPropsOps[Self[item] <: DownshiftProps[item], Item] (val x: Self[Item]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Item] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Item]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Item] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Item] with Other]
    @scala.inline
    def withChildren(value: /* options */ ControllerStateAndHelpers[Item] => TagMod[Any]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHighlightedIndex(value: Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHighlightedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHighlightedIndex: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHighlightedIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHighlightedIndexNull: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHighlightedIndex")(null)
        ret
    }
    @scala.inline
    def withDefaultIsOpen(value: Boolean): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIsOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultIsOpen: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIsOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: Environment): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withGetA11yStatusMessage(value: /* options */ A11yStatusMessageOptions[Item] => String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getA11yStatusMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetA11yStatusMessage: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getA11yStatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemId(value: /* index */ js.UndefOr[Double] => String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetItemId: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightedIndex(value: Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightedIndex: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightedIndexNull: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(null)
        ret
    }
    @scala.inline
    def withId(value: String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialHighlightedIndex(value: Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialHighlightedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialHighlightedIndex: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialHighlightedIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialHighlightedIndexNull: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialHighlightedIndex")(null)
        ret
    }
    @scala.inline
    def withInitialInputValue(value: String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialInputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialInputValue: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialInputValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialIsOpen(value: Boolean): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIsOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialIsOpen: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIsOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSelectedItem(value: Item): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSelectedItem: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelectedItem")(js.undefined)
        ret
    }
    @scala.inline
    def withInputId(value: String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputId: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(js.undefined)
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputValue: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInputValueNull: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(null)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCount(value: Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCount: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withItemToString(value: /* item */ Item | Null => String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemToString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemToString: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemToString")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelId(value: String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelId: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelId")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuId(value: String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuId: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuId")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInputValueChange(value: (/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputValueChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInputValueChange: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputValueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOuterClick(value: /* stateAndHelpers */ ControllerStateAndHelpers[Item] => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOuterClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOuterClick: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOuterClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(
      value: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStateChange(
      value: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStateChange: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUserAction(
      value: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUserAction: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserAction")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollIntoView(value: (/* node */ HTMLElement, /* menuNode */ HTMLElement) => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollIntoView")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutScrollIntoView: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollIntoView")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItem(value: Item): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItem: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItemNull: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(null)
        ret
    }
    @scala.inline
    def withSelectedItemChanged(value: (/* prevItem */ Item, /* item */ Item) => Boolean): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectedItemChanged: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReducer(
      value: (/* state */ DownshiftState[Item], /* changes */ StateChangeOptions[Item]) => Partial[StateChangeOptions[Item]]
    ): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStateReducer: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressRefError(value: Boolean): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressRefError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressRefError: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressRefError")(js.undefined)
        ret
    }
  }
  
}

