package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticClipboardEvent
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsList
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsSlinky.officeUiFabricReact.libSelectionMod.Selection
import typingsSlinky.react.mod.Component
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseSelectedItemsListMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/BaseSelectedItemsList", "BaseSelectedItemsList")
  @js.native
  class BaseSelectedItemsList[T, P /* <: IBaseSelectedItemsListProps[T] */] protected ()
    extends Component[P, IBaseSelectedItemsListState[T], js.Any]
       with IBaseSelectedItemsList[T] {
    def this(basePickerProps: P) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MBaseSelectedItemsList(newProps: P): Unit = js.native
    
    @JSName("UNSAFE_componentWillUpdate")
    def UNSAFE_componentWillUpdate_MBaseSelectedItemsList(newProps: P, newState: IBaseSelectedItemsListState[_]): Unit = js.native
    
    var _canRemoveItem: js.Any = js.native
    
    var _onSelectedItemsUpdated: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MBaseSelectedItemsList(): Unit = js.native
    
    /* protected */ def copyItems(items: js.Array[T]): Unit = js.native
    
    def hasSelectedItems(): Boolean = js.native
    
    def highlightedItems(): js.Array[T] = js.native
    
    @JSName("items")
    val items_BaseSelectedItemsList: js.Array[T] = js.native
    
    /* protected */ def onChange(): Unit = js.native
    /* protected */ def onChange(items: js.Array[T]): Unit = js.native
    
    def onCopy(ev: SyntheticClipboardEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def onItemChange(changedItem: T, index: Double): Unit = js.native
    
    /* protected */ def onSelectionChanged(): Unit = js.native
    
    def removeItem(item: T): Unit = js.native
    
    def removeItemAt(index: Double): Unit = js.native
    
    def removeItems(itemsToRemove: js.Array[_]): Unit = js.native
    
    def removeSelectedItems(): Unit = js.native
    
    /* protected */ def renderItems(): js.Array[ReactElement] = js.native
    
    def replaceItem(itemToReplace: T, itemsToReplaceWith: js.Array[T]): Unit = js.native
    
    var root: HTMLElement = js.native
    
    var selection: Selection[IObjectWithKey] = js.native
    
    def unselectAll(): Unit = js.native
    
    /**
      * Controls what happens whenever there is an action that impacts the selected items.
      * If selectedItems is provided, this will act as a controlled component and will not update its own state.
      */
    def updateItems(items: js.Array[T]): Unit = js.native
    def updateItems(items: js.Array[T], focusIndex: Double): Unit = js.native
  }
  
  @js.native
  trait IBaseSelectedItemsListState[T] extends StObject {
    
    var items: js.Array[T] = js.native
  }
  object IBaseSelectedItemsListState {
    
    @scala.inline
    def apply[T](items: js.Array[T]): IBaseSelectedItemsListState[T] = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBaseSelectedItemsListState[T]]
    }
    
    @scala.inline
    implicit class IBaseSelectedItemsListStateMutableBuilder[Self <: IBaseSelectedItemsListState[_], T] (val x: Self with IBaseSelectedItemsListState[T]) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
}
