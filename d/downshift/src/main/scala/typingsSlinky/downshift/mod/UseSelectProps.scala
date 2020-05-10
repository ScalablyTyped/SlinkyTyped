package typingsSlinky.downshift.mod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSelectProps[Item] extends js.Object {
  var circularNavigation: js.UndefOr[Boolean] = js.native
  var defaultHighlightedIndex: js.UndefOr[Double] = js.native
  var defaultIsOpen: js.UndefOr[Boolean] = js.native
  var defaultSelectedItem: js.UndefOr[Item] = js.native
  var environment: js.UndefOr[Environment] = js.native
  var getA11ySelectionMessage: js.UndefOr[js.Function1[/* options */ UseSelectA11yMessageOptions[Item], String]] = js.native
  var getA11yStatusMessage: js.UndefOr[js.Function1[/* options */ UseSelectA11yMessageOptions[Item], String]] = js.native
  var getItemId: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  var highlightedIndex: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var initialHighlightedIndex: js.UndefOr[Double] = js.native
  var initialIsOpen: js.UndefOr[Boolean] = js.native
  var initialSelectedItem: js.UndefOr[Item] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var itemToString: js.UndefOr[js.Function1[/* item */ Item, String]] = js.native
  var items: js.Array[Item] = js.native
  var labelId: js.UndefOr[String] = js.native
  var menuId: js.UndefOr[String] = js.native
  var onHighlightedIndexChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.native
  var onIsOpenChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.native
  var onSelectedItemChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.native
  var onStateChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.native
  var selectedItem: js.UndefOr[Item] = js.native
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ UseSelectState[Item], 
      /* actionAndChanges */ UseSelectStateChangeOptions[Item], 
      UseSelectState[Item]
    ]
  ] = js.native
  var toggleButtonId: js.UndefOr[String] = js.native
}

object UseSelectProps {
  @scala.inline
  def apply[Item](items: js.Array[Item]): UseSelectProps[Item] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectProps[Item]]
  }
  @scala.inline
  implicit class UseSelectPropsOps[Self[item] <: UseSelectProps[item], Item] (val x: Self[Item]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Item] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Item]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Item] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Item] with Other]
    @scala.inline
    def withItems(value: js.Array[Item]): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircularNavigation(value: Boolean): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circularNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircularNavigation: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circularNavigation")(js.undefined)
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
    def withDefaultSelectedItem(value: Item): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelectedItem: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedItem")(js.undefined)
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
    def withGetA11ySelectionMessage(value: /* options */ UseSelectA11yMessageOptions[Item] => String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getA11ySelectionMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetA11ySelectionMessage: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getA11ySelectionMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withGetA11yStatusMessage(value: /* options */ UseSelectA11yMessageOptions[Item] => String): Self[Item] = {
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
    def withGetItemId(value: /* index */ Double => String): Self[Item] = {
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
    def withItemToString(value: /* item */ Item => String): Self[Item] = {
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
    def withOnHighlightedIndexChange(value: /* changes */ Partial[UseSelectState[Item]] => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHighlightedIndexChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHighlightedIndexChange: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHighlightedIndexChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIsOpenChange(value: /* changes */ Partial[UseSelectState[Item]] => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIsOpenChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIsOpenChange: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIsOpenChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectedItemChange(value: /* changes */ Partial[UseSelectState[Item]] => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectedItemChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectedItemChange: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectedItemChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStateChange(value: /* changes */ Partial[UseSelectState[Item]] => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStateChange: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.undefined)
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
    def withStateReducer(
      value: (/* state */ UseSelectState[Item], /* actionAndChanges */ UseSelectStateChangeOptions[Item]) => UseSelectState[Item]
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
    def withToggleButtonId(value: String): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleButtonId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleButtonId: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleButtonId")(js.undefined)
        ret
    }
  }
  
}

