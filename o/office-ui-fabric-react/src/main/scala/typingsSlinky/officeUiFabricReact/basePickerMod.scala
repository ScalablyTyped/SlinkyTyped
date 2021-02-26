package typingsSlinky.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.IFocusZone
import typingsSlinky.officeUiFabricReact.anon.Items
import typingsSlinky.officeUiFabricReact.autofillMod.Autofill
import typingsSlinky.officeUiFabricReact.autofillTypesMod.IAutofill
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePicker
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import typingsSlinky.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsSlinky.officeUiFabricReact.selectionMod.Selection
import typingsSlinky.officeUiFabricReact.suggestionsControllerMod.SuggestionsController
import typingsSlinky.officeUiFabricReact.suggestionsMod.Suggestions
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestions
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typingsSlinky.react.mod.Component
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basePickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/BasePicker", "BasePicker")
  @js.native
  class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
    extends Component[P, IBasePickerState, js.Any]
       with IBasePicker[T] {
    def this(basePickerProps: P) = this()
    
    /**
      * @deprecated this is no longer necessary as typescript now supports generic elements
      */
    var SuggestionOfProperType: Instantiable1[/* props */ ISuggestionsProps[T], Suggestions[T]] = js.native
    
    var _ariaMap: IPickerAriaIds = js.native
    
    var _async: js.Any = js.native
    
    var _completeGenericSuggestion: js.Any = js.native
    
    /**
      * Suggestions are normally shown after the user updates text and the text
      * is non-empty, but also when the user clicks on the input element.
      * @returns True if suggestions should be shown.
      */
    var _getShowSuggestions: js.Any = js.native
    
    var _getTextFromItem: js.Any = js.native
    
    var _id: js.Any = js.native
    
    var _onResolveSuggestions: js.Any = js.native
    
    var _onSelectedItemsUpdated: js.Any = js.native
    
    /* protected */ def _shouldFocusZoneEnterInnerZone(ev: SyntheticKeyboardEvent[HTMLElement]): Boolean = js.native
    
    var _styledSuggestions: js.Any = js.native
    
    /**
      * Takes in the current updated value and either resolves it with the new suggestions
      * or if updated value is undefined then it clears out currently suggested items
      */
    var _updateAndResolveValue: js.Any = js.native
    
    /**
      * Controls what happens whenever there is an action that impacts the selected items.
      * If `selectedItems` is provided, this will act as a controlled component and it will not update its own state.
      */
    var _updateSelectedItems: js.Any = js.native
    
    /**
      * This should be called when the user does something other than use text entry to trigger suggestions.
      *
      */
    var _userTriggeredSuggestions: js.Any = js.native
    
    /* protected */ def addItem(item: T): Unit = js.native
    
    /* protected */ def addItemByIndex(index: Double): Unit = js.native
    
    /* protected */ def canAddItems(): Boolean = js.native
    
    /* protected */ def completeSelection(item: T): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MBasePicker(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MBasePicker(oldProps: P, oldState: IBasePickerState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MBasePicker(): Unit = js.native
    
    var currentPromise: js.UndefOr[js.Thenable[_]] = js.native
    
    def dismissSuggestions(): Unit = js.native
    def dismissSuggestions(ev: js.Any): Unit = js.native
    
    var focusZone: ReactRef[IFocusZone] = js.native
    
    /* protected */ def getActiveDescendant(): js.UndefOr[String] = js.native
    
    /* protected */ def getSuggestionsAlert(): js.UndefOr[ReactElement] = js.native
    /* protected */ def getSuggestionsAlert(suggestionAlertClassName: String): js.UndefOr[ReactElement] = js.native
    
    var input: ReactRef[IAutofill] = js.native
    
    @JSName("items")
    val items_BasePicker: js.Array[T] = js.native
    
    /* protected */ def onBackspace(ev: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def onBlur(ev: SyntheticFocusEvent[HTMLElement | Autofill]): Unit = js.native
    
    /* protected */ def onChange(): Unit = js.native
    /* protected */ def onChange(items: js.Array[T]): Unit = js.native
    
    /**
      * Reveals suggestions any time the user clicks on the input element
      * without shifting focus.
      */
    /* protected */ def onClick(ev: SyntheticMouseEvent[HTMLInputElement]): Unit = js.native
    
    /**
      * Only to be called when there is nothing in the input. Checks to see if the consumer has
      * provided a function to resolve suggestions
      */
    /* protected */ def onEmptyInputFocus(): Unit = js.native
    
    /* protected */ def onGetMoreResults(): Unit = js.native
    
    /* protected */ def onInputBlur(ev: SyntheticFocusEvent[HTMLInputElement | Autofill]): Unit = js.native
    
    /* protected */ def onInputChange(value: String): Unit = js.native
    
    /* protected */ def onInputFocus(ev: SyntheticFocusEvent[HTMLInputElement | Autofill]): Unit = js.native
    
    /* protected */ def onItemChange(changedItem: T, index: Double): Unit = js.native
    
    /* protected */ def onKeyDown(ev: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def onSelectionChange(): Unit = js.native
    
    /* protected */ def onSuggestionClick(ev: SyntheticMouseEvent[HTMLElement], item: js.Any, index: Double): Unit = js.native
    
    /* protected */ def onSuggestionRemove(ev: SyntheticMouseEvent[HTMLElement], item: T, index: Double): Unit = js.native
    
    /* protected */ def onSuggestionSelect(): Unit = js.native
    
    def refocusSuggestions(keyCode: Double): Unit = js.native
    
    /* protected */ def removeItem(item: IPickerItemProps[T]): Unit = js.native
    /* protected */ def removeItem(item: IPickerItemProps[T], focusNextItem: Boolean): Unit = js.native
    
    /* protected */ def removeItems(itemsToRemove: js.Array[_]): Unit = js.native
    
    /* protected */ def renderItems(): js.Array[ReactElement] = js.native
    
    /* protected */ def renderSuggestions(): ReactElement | Null = js.native
    
    /* protected */ def resetFocus(): Unit = js.native
    /* protected */ def resetFocus(index: Double): Unit = js.native
    
    /* protected */ def resolveNewValue(updatedValue: String, suggestions: js.Array[T]): Unit = js.native
    
    var root: ReactRef[HTMLDivElement] = js.native
    
    var selection: Selection[IObjectWithKey] = js.native
    
    var suggestionElement: ReactRef[ISuggestions[T]] = js.native
    
    var suggestionStore: SuggestionsController[T] = js.native
    
    /* protected */ def updateSuggestions(suggestions: js.Array[_]): Unit = js.native
    
    /* protected */ def updateSuggestionsList(suggestions: js.Array[T]): Unit = js.native
    /* protected */ def updateSuggestionsList(suggestions: js.Array[T], updatedValue: String): Unit = js.native
    /* protected */ def updateSuggestionsList(suggestions: js.Thenable[js.Array[T]]): Unit = js.native
    /* protected */ def updateSuggestionsList(suggestions: js.Thenable[js.Array[T]], updatedValue: String): Unit = js.native
    
    /* protected */ def updateValue(updatedValue: String): Unit = js.native
  }
  /* static members */
  object BasePicker {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/BasePicker", "BasePicker.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(newProps: IBasePickerProps[_]): Items | Null = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/BasePicker", "BasePickerListBelow")
  @js.native
  class BasePickerListBelow[T, P /* <: IBasePickerProps[T] */] protected () extends BasePicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  trait IBasePickerState extends StObject {
    
    var isFocused: js.UndefOr[Boolean] = js.native
    
    var isMostRecentlyUsedVisible: js.UndefOr[Boolean] = js.native
    
    var isResultsFooterVisible: js.UndefOr[Boolean] = js.native
    
    var isSearching: js.UndefOr[Boolean] = js.native
    
    var items: js.UndefOr[js.Any] = js.native
    
    var moreSuggestionsAvailable: js.UndefOr[Boolean] = js.native
    
    var selectedIndices: js.UndefOr[js.Array[Double]] = js.native
    
    var suggestedDisplayValue: js.UndefOr[String] = js.native
    
    var suggestionsLoading: js.UndefOr[Boolean] = js.native
    
    var suggestionsVisible: js.UndefOr[Boolean] = js.native
  }
  object IBasePickerState {
    
    @scala.inline
    def apply(): IBasePickerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBasePickerState]
    }
    
    @scala.inline
    implicit class IBasePickerStateMutableBuilder[Self <: IBasePickerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      @scala.inline
      def setIsMostRecentlyUsedVisible(value: Boolean): Self = StObject.set(x, "isMostRecentlyUsedVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMostRecentlyUsedVisibleUndefined: Self = StObject.set(x, "isMostRecentlyUsedVisible", js.undefined)
      
      @scala.inline
      def setIsResultsFooterVisible(value: Boolean): Self = StObject.set(x, "isResultsFooterVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResultsFooterVisibleUndefined: Self = StObject.set(x, "isResultsFooterVisible", js.undefined)
      
      @scala.inline
      def setIsSearching(value: Boolean): Self = StObject.set(x, "isSearching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSearchingUndefined: Self = StObject.set(x, "isSearching", js.undefined)
      
      @scala.inline
      def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setMoreSuggestionsAvailable(value: Boolean): Self = StObject.set(x, "moreSuggestionsAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoreSuggestionsAvailableUndefined: Self = StObject.set(x, "moreSuggestionsAvailable", js.undefined)
      
      @scala.inline
      def setSelectedIndices(value: js.Array[Double]): Self = StObject.set(x, "selectedIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndicesUndefined: Self = StObject.set(x, "selectedIndices", js.undefined)
      
      @scala.inline
      def setSelectedIndicesVarargs(value: Double*): Self = StObject.set(x, "selectedIndices", js.Array(value :_*))
      
      @scala.inline
      def setSuggestedDisplayValue(value: String): Self = StObject.set(x, "suggestedDisplayValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestedDisplayValueUndefined: Self = StObject.set(x, "suggestedDisplayValue", js.undefined)
      
      @scala.inline
      def setSuggestionsLoading(value: Boolean): Self = StObject.set(x, "suggestionsLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsLoadingUndefined: Self = StObject.set(x, "suggestionsLoading", js.undefined)
      
      @scala.inline
      def setSuggestionsVisible(value: Boolean): Self = StObject.set(x, "suggestionsVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsVisibleUndefined: Self = StObject.set(x, "suggestionsVisible", js.undefined)
    }
  }
  
  @js.native
  trait IPickerAriaIds extends StObject {
    
    /**
      * Aria id for selected items container component
      */
    var selectedItems: String = js.native
    
    /**
      * Aria id for selected suggestion alert component
      */
    var selectedSuggestionAlert: String = js.native
    
    /**
      * Aria id for suggestions list component
      */
    var suggestionList: String = js.native
  }
  object IPickerAriaIds {
    
    @scala.inline
    def apply(selectedItems: String, selectedSuggestionAlert: String, suggestionList: String): IPickerAriaIds = {
      val __obj = js.Dynamic.literal(selectedItems = selectedItems.asInstanceOf[js.Any], selectedSuggestionAlert = selectedSuggestionAlert.asInstanceOf[js.Any], suggestionList = suggestionList.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPickerAriaIds]
    }
    
    @scala.inline
    implicit class IPickerAriaIdsMutableBuilder[Self <: IPickerAriaIds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedItems(value: String): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedSuggestionAlert(value: String): Self = StObject.set(x, "selectedSuggestionAlert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionList(value: String): Self = StObject.set(x, "suggestionList", value.asInstanceOf[js.Any])
    }
  }
}
