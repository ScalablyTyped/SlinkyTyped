package typingsSlinky.blueprintjsSelect.anon

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsSlinky.blueprintjsCore.propsMod.HTMLInputProps
import typingsSlinky.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typingsSlinky.blueprintjsSelect.itemListRendererMod.ItemListRenderer
import typingsSlinky.blueprintjsSelect.itemRendererMod.IItemRendererProps
import typingsSlinky.blueprintjsSelect.itemRendererMod.ItemRenderer
import typingsSlinky.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typingsSlinky.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typingsSlinky.blueprintjsSelect.predicateMod.ItemListPredicate
import typingsSlinky.blueprintjsSelect.predicateMod.ItemPredicate
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/select.@blueprintjs/select/lib/esm/components/select/suggest.ISuggestProps<any>> */
@js.native
trait PartialISuggestPropsany extends js.Object {
  var activeItem: js.UndefOr[js.Any | ICreateNewItem] = js.native
  var className: js.UndefOr[String] = js.native
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  var createNewItemFromQuery: js.UndefOr[js.Function1[/* query */ String, _]] = js.native
  var createNewItemRenderer: js.UndefOr[
    js.Function3[
      /* query */ String, 
      /* active */ Boolean, 
      /* handleClick */ MouseEventHandler[HTMLElement], 
      js.UndefOr[ReactElement]
    ]
  ] = js.native
  var defaultSelectedItem: js.UndefOr[js.Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[Boolean] = js.native
  var initialContent: js.UndefOr[TagMod[Any]] = js.native
  var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
  var inputValueRenderer: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.native
  var itemDisabled: js.UndefOr[
    (/* keyof any */ String) | (js.Function2[/* item */ js.Any, /* index */ Double, Boolean])
  ] = js.native
  var itemListPredicate: js.UndefOr[ItemListPredicate[_]] = js.native
  var itemListRenderer: js.UndefOr[ItemListRenderer[_]] = js.native
  var itemPredicate: js.UndefOr[ItemPredicate[_]] = js.native
  var itemRenderer: js.UndefOr[ItemRenderer[_]] = js.native
  var items: js.UndefOr[js.Array[_]] = js.native
  var itemsEqual: js.UndefOr[ItemsEqualProp[_]] = js.native
  var noResults: js.UndefOr[TagMod[Any]] = js.native
  var onActiveItemChange: js.UndefOr[
    js.Function2[/* activeItem */ js.Any | Null, /* isCreateNewItem */ Boolean, Unit]
  ] = js.native
  var onItemSelect: js.UndefOr[
    js.Function2[/* item */ js.Any, /* event */ js.UndefOr[SyntheticEvent[Event, HTMLElement]], Unit]
  ] = js.native
  var onItemsPaste: js.UndefOr[js.Function1[/* items */ js.Array[_], Unit]] = js.native
  var onQueryChange: js.UndefOr[
    js.Function2[/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], Unit]
  ] = js.native
  var openOnKeyDown: js.UndefOr[Boolean] = js.native
  var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.native
  var query: js.UndefOr[String] = js.native
  var resetOnClose: js.UndefOr[Boolean] = js.native
  var resetOnQuery: js.UndefOr[Boolean] = js.native
  var resetOnSelect: js.UndefOr[Boolean] = js.native
  var scrollToActiveItem: js.UndefOr[Boolean] = js.native
  var selectedItem: js.UndefOr[js.Any] = js.native
}

object PartialISuggestPropsany {
  @scala.inline
  def apply(): PartialISuggestPropsany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialISuggestPropsany]
  }
  @scala.inline
  implicit class PartialISuggestPropsanyOps[Self <: PartialISuggestPropsany] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveItem(value: js.Any | ICreateNewItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeItem")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateNewItemFromQuery(value: /* query */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNewItemFromQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateNewItemFromQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNewItemFromQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateNewItemRenderer(
      value: (/* query */ String, /* active */ Boolean, /* handleClick */ MouseEventHandler[HTMLElement]) => js.UndefOr[ReactElement]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNewItemRenderer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreateNewItemRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNewItemRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelectedItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelectedItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedItem")(js.undefined)
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
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialContent")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: IInputGroupProps with HTMLInputProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withInputValueRenderer(value: /* item */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValueRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInputValueRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValueRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withItemDisabledFunction2(value: (/* item */ js.Any, /* index */ Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDisabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withItemDisabled(value: (/* keyof any */ String) | (js.Function2[/* item */ js.Any, /* index */ Double, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withItemListPredicate(value: (/* query */ String, /* items */ js.Array[_]) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemListPredicate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemListPredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemListPredicate")(js.undefined)
        ret
    }
    @scala.inline
    def withItemListRenderer(value: /* itemListProps */ IItemListRendererProps[_] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemListRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemListRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemListRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withItemPredicate(
      value: (/* query */ String, _, /* index */ js.UndefOr[Double], /* exactMatch */ js.UndefOr[Boolean]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemPredicate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutItemPredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemPredicate")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRenderer(value: (_, /* itemProps */ IItemRendererProps) => ReactElement | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRenderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsEqualFunction2(value: (_, _) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsEqual")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withItemsEqual(value: ItemsEqualProp[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsEqual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResultsReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoResults(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResults")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActiveItemChange(value: (/* activeItem */ js.Any | Null, /* isCreateNewItem */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveItemChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnActiveItemChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveItemChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemSelect(value: (/* item */ js.Any, /* event */ js.UndefOr[SyntheticEvent[Event, HTMLElement]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnItemSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemsPaste(value: /* items */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemsPaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemsPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemsPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnQueryChange(value: (/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQueryChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnQueryChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQueryChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnKeyDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnKeyDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withPopoverProps(value: PartialIPopoverProps with js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopoverProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnClose")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToActiveItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToActiveItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToActiveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToActiveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(js.undefined)
        ret
    }
  }
  
}

