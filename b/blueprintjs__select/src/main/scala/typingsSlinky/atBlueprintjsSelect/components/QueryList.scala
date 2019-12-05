package typingsSlinky.atBlueprintjsSelect.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsSelect.libEsmCommonItemListRendererMod.IItemListRendererProps
import typingsSlinky.atBlueprintjsSelect.libEsmCommonItemRendererMod.IItemRendererProps
import typingsSlinky.atBlueprintjsSelect.libEsmCommonListItemsPropsMod.ItemsEqualProp
import typingsSlinky.atBlueprintjsSelect.libEsmCommonListItemsUtilsMod.ICreateNewItem
import typingsSlinky.atBlueprintjsSelect.libEsmComponentsQueryDashListQueryListMod.IQueryListProps
import typingsSlinky.atBlueprintjsSelect.libEsmComponentsQueryDashListQueryListMod.IQueryListRendererProps
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object QueryList
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsSelect.libEsmComponentsMod.QueryList[js.Any]] {
  @JSImport("@blueprintjs/select/lib/esm/components", "QueryList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, onKeyDown, onKeyUp */
  def apply[T](
    itemRenderer: (T, /* itemProps */ IItemRendererProps) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null,
    items: js.Array[T],
    onItemSelect: (T, js.UndefOr[SyntheticEvent[Event, HTMLElement]]) => Unit,
    renderer: IQueryListRendererProps[T] => typingsSlinky.react.reactMod._Global_.JSX.Element,
    activeItem: T | ICreateNewItem = null,
    createNewItemFromQuery: /* query */ String => T = null,
    createNewItemRenderer: (/* query */ String, /* active */ Boolean, /* handleClick */ MouseEventHandler[HTMLElement]) => js.UndefOr[typingsSlinky.react.reactMod._Global_.JSX.Element] = null,
    initialContent: TagMod[Any] = null,
    itemDisabled: String | (js.Function2[T, /* index */ Double, Boolean]) = null,
    itemListPredicate: (/* query */ String, /* items */ js.Array[T]) => js.Array[T] = null,
    itemListRenderer: /* itemListProps */ IItemListRendererProps[T] => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    itemPredicate: (/* query */ String, T, /* index */ js.UndefOr[Double], /* exactMatch */ js.UndefOr[Boolean]) => Boolean = null,
    itemsEqual: ItemsEqualProp[T] = null,
    noResults: TagMod[Any] = null,
    onActiveItemChange: (/* activeItem */ T | Null, /* isCreateNewItem */ Boolean) => Unit = null,
    onItemsPaste: /* items */ js.Array[T] => Unit = null,
    onQueryChange: (/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit = null,
    query: String = null,
    resetOnQuery: js.UndefOr[Boolean] = js.undefined,
    resetOnSelect: js.UndefOr[Boolean] = js.undefined,
    scrollToActiveItem: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsSelect.libEsmComponentsMod.QueryList[js.Any]] = {
    val __obj = js.Dynamic.literal(itemRenderer = js.Any.fromFunction2(itemRenderer), items = items.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction2(onItemSelect), renderer = js.Any.fromFunction1(renderer))
    if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem.asInstanceOf[js.Any])
    if (createNewItemFromQuery != null) __obj.updateDynamic("createNewItemFromQuery")(js.Any.fromFunction1(createNewItemFromQuery))
    if (createNewItemRenderer != null) __obj.updateDynamic("createNewItemRenderer")(js.Any.fromFunction3(createNewItemRenderer))
    if (initialContent != null) __obj.updateDynamic("initialContent")(initialContent.asInstanceOf[js.Any])
    if (itemDisabled != null) __obj.updateDynamic("itemDisabled")(itemDisabled.asInstanceOf[js.Any])
    if (itemListPredicate != null) __obj.updateDynamic("itemListPredicate")(js.Any.fromFunction2(itemListPredicate))
    if (itemListRenderer != null) __obj.updateDynamic("itemListRenderer")(js.Any.fromFunction1(itemListRenderer))
    if (itemPredicate != null) __obj.updateDynamic("itemPredicate")(js.Any.fromFunction4(itemPredicate))
    if (itemsEqual != null) __obj.updateDynamic("itemsEqual")(itemsEqual.asInstanceOf[js.Any])
    if (noResults != null) __obj.updateDynamic("noResults")(noResults.asInstanceOf[js.Any])
    if (onActiveItemChange != null) __obj.updateDynamic("onActiveItemChange")(js.Any.fromFunction2(onActiveItemChange))
    if (onItemsPaste != null) __obj.updateDynamic("onItemsPaste")(js.Any.fromFunction1(onItemsPaste))
    if (onQueryChange != null) __obj.updateDynamic("onQueryChange")(js.Any.fromFunction2(onQueryChange))
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnQuery)) __obj.updateDynamic("resetOnQuery")(resetOnQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnSelect)) __obj.updateDynamic("resetOnSelect")(resetOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToActiveItem)) __obj.updateDynamic("scrollToActiveItem")(scrollToActiveItem.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atBlueprintjsSelect.libEsmComponentsMod.QueryList[js.Any]]]
  }
  type Props = IQueryListProps[js.Any]
}

