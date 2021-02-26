package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPicker
import typingsSlinky.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsSlinky.officeUiFabricReact.libAutofillMod.Autofill
import typingsSlinky.officeUiFabricReact.libFloatingPickerMod.BaseFloatingPicker
import typingsSlinky.officeUiFabricReact.libSelectedItemsListMod.BaseSelectedItemsList
import typingsSlinky.officeUiFabricReact.libSelectionMod.Selection
import typingsSlinky.react.mod.Component
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseExtendedPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/BaseExtendedPicker", "BaseExtendedPicker")
  @js.native
  class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
    extends Component[P, IBaseExtendedPickerState[T], js.Any]
       with IBaseExtendedPicker[T] {
    def this(basePickerProps: P) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MBaseExtendedPicker(newProps: P): Unit = js.native
    
    var _addProcessedItem: js.Any = js.native
    
    /* protected */ def _onSelectedItemsChanged(): Unit = js.native
    
    /* protected */ def _onSuggestionSelected(item: T): Unit = js.native
    
    /**
      * The floating picker is the source of truth for if the menu has been opened or not.
      *
      * Because this isn't tracked inside the state of this component, we need to
      * force an update here to keep the rendered output that depends on the picker being open
      * in sync with the state
      *
      * Called when the suggestions is shown or closed
      */
    var _onSuggestionsShownOrHidden: js.Any = js.native
    
    /* protected */ def canAddItems(): Boolean = js.native
    
    def clearInput(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MBaseExtendedPicker(): Unit = js.native
    
    var floatingPicker: ReactRef[BaseFloatingPicker[T, IBaseFloatingPickerProps[T]]] = js.native
    
    var floatingPickerProps: IBaseFloatingPickerProps[T] = js.native
    
    val highlightedItems: js.Array[T] = js.native
    
    var input: ReactRef[Autofill] = js.native
    
    val inputElement: HTMLInputElement | Null = js.native
    
    /* protected */ def onBackspace(ev: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def onCopy(ev: SyntheticClipboardEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def onInputChange(value: String): Unit = js.native
    /* protected */ def onInputChange(value: String, composing: Boolean): Unit = js.native
    
    /* protected */ def onInputClick(ev: SyntheticMouseEvent[HTMLInputElement | Autofill]): Unit = js.native
    
    /* protected */ def onInputFocus(ev: SyntheticFocusEvent[HTMLInputElement | Autofill]): Unit = js.native
    
    /* protected */ def onPaste(ev: SyntheticClipboardEvent[HTMLInputElement | Autofill]): Unit = js.native
    
    /* protected */ def onSelectionChange(): Unit = js.native
    
    /* protected */ def renderFloatingPicker(): ReactElement = js.native
    
    /* protected */ def renderSelectedItemsList(): ReactElement = js.native
    
    var root: ReactRef[HTMLDivElement] = js.native
    
    var selectedItemsList: ReactRef[BaseSelectedItemsList[T, IBaseSelectedItemsListProps[T]]] = js.native
    
    var selectedItemsListProps: IBaseSelectedItemsListProps[T] = js.native
    
    var selection: Selection[IObjectWithKey] = js.native
  }
  
  @js.native
  trait IBaseExtendedPickerState[T] extends StObject {
    
    var queryString: String | Null = js.native
    
    var selectedItems: js.Array[T] | Null = js.native
    
    var suggestionItems: js.Array[T] | Null = js.native
  }
  object IBaseExtendedPickerState {
    
    @scala.inline
    def apply[T](): IBaseExtendedPickerState[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseExtendedPickerState[T]]
    }
    
    @scala.inline
    implicit class IBaseExtendedPickerStateMutableBuilder[Self <: IBaseExtendedPickerState[_], T] (val x: Self with IBaseExtendedPickerState[T]) extends AnyVal {
      
      @scala.inline
      def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringNull: Self = StObject.set(x, "queryString", null)
      
      @scala.inline
      def setSelectedItems(value: js.Array[T]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsNull: Self = StObject.set(x, "selectedItems", null)
      
      @scala.inline
      def setSelectedItemsVarargs(value: T*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
      
      @scala.inline
      def setSuggestionItems(value: js.Array[T]): Self = StObject.set(x, "suggestionItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionItemsNull: Self = StObject.set(x, "suggestionItems", null)
      
      @scala.inline
      def setSuggestionItemsVarargs(value: T*): Self = StObject.set(x, "suggestionItems", js.Array(value :_*))
    }
  }
}
