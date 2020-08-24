package typingsSlinky.blueprintjsSelect.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsSelect.anon.PartialIPopoverProps
import typingsSlinky.blueprintjsSelect.anon.PartialITagInputProps
import typingsSlinky.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typingsSlinky.blueprintjsSelect.itemRendererMod.IItemRendererProps
import typingsSlinky.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typingsSlinky.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typingsSlinky.blueprintjsSelect.multiSelectMod.IMultiSelectProps
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiSelect {
  @JSImport("@blueprintjs/select", "MultiSelect")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsSelect.mod.MultiSelect[T]] {
    @scala.inline
    def activeItem(value: T | ICreateNewItem): this.type = set("activeItem", value.asInstanceOf[js.Any])
    @scala.inline
    def activeItemNull: this.type = set("activeItem", null)
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def createNewItemFromQuery(value: /* query */ String => T): this.type = set("createNewItemFromQuery", js.Any.fromFunction1(value))
    @scala.inline
    def createNewItemRenderer(
      value: (/* query */ String, /* active */ Boolean, /* handleClick */ MouseEventHandler[HTMLElement]) => js.UndefOr[ReactElement]
    ): this.type = set("createNewItemRenderer", js.Any.fromFunction3(value))
    @scala.inline
    def fill(value: Boolean): this.type = set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def initialContentReactElement(value: ReactElement): this.type = set("initialContent", value.asInstanceOf[js.Any])
    @scala.inline
    def initialContent(value: ReactElement): this.type = set("initialContent", value.asInstanceOf[js.Any])
    @scala.inline
    def initialContentNull: this.type = set("initialContent", null)
    @scala.inline
    def itemDisabledFunction2(value: (T, /* index */ Double) => Boolean): this.type = set("itemDisabled", js.Any.fromFunction2(value))
    @scala.inline
    def itemDisabled(value: (/* keyof T */ String) | (js.Function2[T, /* index */ Double, Boolean])): this.type = set("itemDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def itemListPredicate(value: (/* query */ String, /* items */ js.Array[T]) => js.Array[T]): this.type = set("itemListPredicate", js.Any.fromFunction2(value))
    @scala.inline
    def itemListRenderer(value: /* itemListProps */ IItemListRendererProps[T] => ReactElement | Null): this.type = set("itemListRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def itemPredicate(
      value: (/* query */ String, T, /* index */ js.UndefOr[Double], /* exactMatch */ js.UndefOr[Boolean]) => Boolean
    ): this.type = set("itemPredicate", js.Any.fromFunction4(value))
    @scala.inline
    def itemsEqualFunction2(value: (T, T) => Boolean): this.type = set("itemsEqual", js.Any.fromFunction2(value))
    @scala.inline
    def itemsEqual(value: ItemsEqualProp[T]): this.type = set("itemsEqual", value.asInstanceOf[js.Any])
    @scala.inline
    def noResultsReactElement(value: ReactElement): this.type = set("noResults", value.asInstanceOf[js.Any])
    @scala.inline
    def noResults(value: ReactElement): this.type = set("noResults", value.asInstanceOf[js.Any])
    @scala.inline
    def onActiveItemChange(value: (/* activeItem */ T | Null, /* isCreateNewItem */ Boolean) => Unit): this.type = set("onActiveItemChange", js.Any.fromFunction2(value))
    @scala.inline
    def onItemsPaste(value: /* items */ js.Array[T] => Unit): this.type = set("onItemsPaste", js.Any.fromFunction1(value))
    @scala.inline
    def onQueryChange(value: (/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit): this.type = set("onQueryChange", js.Any.fromFunction2(value))
    @scala.inline
    def openOnKeyDown(value: Boolean): this.type = set("openOnKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def popoverProps(value: PartialIPopoverProps with js.Object): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    @scala.inline
    def query(value: String): this.type = set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def resetOnQuery(value: Boolean): this.type = set("resetOnQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def resetOnSelect(value: Boolean): this.type = set("resetOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollToActiveItem(value: Boolean): this.type = set("scrollToActiveItem", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedItemsVarargs(value: T*): this.type = set("selectedItems", js.Array(value :_*))
    @scala.inline
    def selectedItems(value: js.Array[T]): this.type = set("selectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def tagInputProps(value: PartialITagInputProps with js.Object): this.type = set("tagInputProps", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: IMultiSelectProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](
    itemRenderer: (T, /* itemProps */ IItemRendererProps) => ReactElement | Null,
    items: js.Array[T],
    onItemSelect: (T, js.UndefOr[SyntheticEvent[Event, HTMLElement]]) => Unit,
    tagRenderer: T => ReactElement
  ): Builder[T] = {
    val __props = js.Dynamic.literal(itemRenderer = js.Any.fromFunction2(itemRenderer), items = items.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction2(onItemSelect), tagRenderer = js.Any.fromFunction1(tagRenderer))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[IMultiSelectProps[T]]))
  }
}

