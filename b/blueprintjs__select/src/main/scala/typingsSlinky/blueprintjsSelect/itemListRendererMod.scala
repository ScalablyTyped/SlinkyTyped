package typingsSlinky.blueprintjsSelect

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemListRendererMod {
  
  @JSImport("@blueprintjs/select/lib/esm/common/itemListRenderer", "renderFilteredItems")
  @js.native
  def renderFilteredItems(props: IItemListRendererProps[_]): ReactElement = js.native
  @JSImport("@blueprintjs/select/lib/esm/common/itemListRenderer", "renderFilteredItems")
  @js.native
  def renderFilteredItems(
    props: IItemListRendererProps[_],
    noResults: js.UndefOr[ReactElement],
    initialContent: ReactElement
  ): ReactElement = js.native
  @JSImport("@blueprintjs/select/lib/esm/common/itemListRenderer", "renderFilteredItems")
  @js.native
  def renderFilteredItems(props: IItemListRendererProps[_], noResults: ReactElement): ReactElement = js.native
  
  @js.native
  trait IItemListRendererProps[T] extends StObject {
    
    /**
      * The currently focused item (for keyboard interactions), or `null` to
      * indicate that no item is active.
      */
    var activeItem: T | ICreateNewItem | Null = js.native
    
    /**
      * Array of items filtered by `itemListPredicate` or `itemPredicate`.
      * See `items` for the full list of items.
      *
      * Use `renderFilteredItems()` utility function from this library to
      * map each item in this array through `renderItem`, with support for
      * optional `noResults` and `initialContent` states.
      */
    var filteredItems: js.Array[T] = js.native
    
    /**
      * Array of all items in the list.
      * See `filteredItems` for a filtered array based on `query` and predicate props.
      */
    var items: js.Array[T] = js.native
    
    /**
      * A ref handler that should be attached to the parent HTML element of the menu items.
      * This is required for the active item to scroll into view automatically.
      */
    def itemsParentRef(): Unit = js.native
    def itemsParentRef(ref: HTMLElement): Unit = js.native
    
    /**
      * The current query string.
      */
    var query: String = js.native
    
    /**
      * Call this function to render the "create new item" view component.
      * @returns null when creating a new item is not available, and undefined if the createNewItemRenderer returns undefined
      */
    def renderCreateItem(): js.UndefOr[ReactElement | Null] = js.native
    
    /**
      * Call this function to render an item.
      * This retrieves the modifiers for the item and delegates actual rendering
      * to the owner component's `itemRenderer` prop.
      */
    def renderItem(item: T, index: Double): ReactElement | Null = js.native
  }
  
  type ItemListRenderer[T] = js.Function1[/* itemListProps */ IItemListRendererProps[T], ReactElement | Null]
}
