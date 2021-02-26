package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButton
import typingsSlinky.officeUiFabricReact.suggestionsCoreMod.SuggestionsCore
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsControlProps
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterItemProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suggestionsControlMod {
  
  @js.native
  sealed trait SuggestionItemType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsControl", "SuggestionItemType")
  @js.native
  object SuggestionItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SuggestionItemType with Double] = js.native
    
    @js.native
    sealed trait footer extends SuggestionItemType
    /* 2 */ val footer: typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.footer with Double = js.native
    
    @js.native
    sealed trait header extends SuggestionItemType
    /* 0 */ val header: typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.header with Double = js.native
    
    @js.native
    sealed trait suggestion extends SuggestionItemType
    /* 1 */ val suggestion: typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.suggestion with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsControl", "SuggestionsControl")
  @js.native
  class SuggestionsControl[T] protected ()
    extends Component[ISuggestionsControlProps[T], ISuggestionsControlState[T], js.Any] {
    def this(suggestionsProps: ISuggestionsControlProps[T]) = this()
    
    var SuggestionsOfProperType: js.Any = js.native
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MSuggestionsControl(newProps: ISuggestionsControlProps[T]): Unit = js.native
    
    var _forceResolveButton: IButton = js.native
    
    var _getCurrentIndexForType: js.Any = js.native
    
    var _getNextItemSectionType: js.Any = js.native
    
    var _getPreviousItemSectionType: js.Any = js.native
    
    /* protected */ def _renderSuggestions(): ReactElement = js.native
    
    var _searchForMoreButton: IButton = js.native
    
    /**
      * Selects the next item in the suggestion item type group, given the current index
      * If none is able to be selected, returns false, otherwise returns true
      * @param itemType - The suggestion item type
      * @param currentIndex - The current index, default is -1
      */
    var _selectNextItemOfItemType: js.Any = js.native
    
    /**
      * Selects the previous item in the suggestion item type group, given the current index
      * If none is able to be selected, returns false, otherwise returns true
      * @param itemType - The suggestion item type
      * @param currentIndex - The current index. If none is provided, the default is the items length of specified type
      */
    var _selectPreviousItemOfItemType: js.Any = js.native
    
    var _selectedElement: ReactRef[HTMLDivElement] = js.native
    
    var _suggestions: ReactRef[SuggestionsCore[T]] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSuggestionsControl(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSuggestionsControl(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSuggestionsControl(): Unit = js.native
    
    val currentSuggestion: js.UndefOr[ISuggestionModel[T]] = js.native
    
    val currentSuggestionIndex: Double = js.native
    
    def executeSelectedAction(): Unit = js.native
    
    /**
      * Handles the key down, returns true, if the event was handled, false otherwise
      * @param keyCode - The keyCode to handle
      */
    def handleKeyDown(keyCode: Double): Boolean = js.native
    
    def hasSelection(): Boolean = js.native
    
    def hasSuggestionSelected(): Boolean = js.native
    
    def removeSuggestion(): Unit = js.native
    def removeSuggestion(index: Double): Unit = js.native
    
    /* protected */ def renderFooterItems(): ReactElement | Null = js.native
    
    /* protected */ def renderHeaderItems(): ReactElement | Null = js.native
    
    /**
      * Resets the selected state and selects the first selectable item
      */
    /* protected */ def resetSelectedItem(): Unit = js.native
    
    def scrollSelected(): Unit = js.native
    
    /**
      * Selects the first item
      */
    /* protected */ def selectFirstItem(): Unit = js.native
    
    /**
      * Selects the last item
      */
    /* protected */ def selectLastItem(): Unit = js.native
    
    /**
      * Selects the next selectable item
      */
    /* protected */ def selectNextItem(itemType: SuggestionItemType): Unit = js.native
    /* protected */ def selectNextItem(itemType: SuggestionItemType, originalItemType: SuggestionItemType): Unit = js.native
    
    /**
      * Selects the previous selectable item
      */
    /* protected */ def selectPreviousItem(itemType: SuggestionItemType): Unit = js.native
    /* protected */ def selectPreviousItem(itemType: SuggestionItemType, originalItemType: SuggestionItemType): Unit = js.native
    
    val selectedElement: js.UndefOr[HTMLDivElement] = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsControl", "SuggestionsHeaderFooterItem")
  @js.native
  class SuggestionsHeaderFooterItem protected ()
    extends Component[ISuggestionsHeaderFooterItemProps, js.Object, js.Any] {
    def this(props: ISuggestionsHeaderFooterItemProps) = this()
  }
  
  @js.native
  trait ISuggestionsControlState[T] extends StObject {
    
    var selectedFooterIndex: Double = js.native
    
    var selectedHeaderIndex: Double = js.native
    
    var suggestions: js.Array[ISuggestionModel[T]] = js.native
  }
  object ISuggestionsControlState {
    
    @scala.inline
    def apply[T](
      selectedFooterIndex: Double,
      selectedHeaderIndex: Double,
      suggestions: js.Array[ISuggestionModel[T]]
    ): ISuggestionsControlState[T] = {
      val __obj = js.Dynamic.literal(selectedFooterIndex = selectedFooterIndex.asInstanceOf[js.Any], selectedHeaderIndex = selectedHeaderIndex.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISuggestionsControlState[T]]
    }
    
    @scala.inline
    implicit class ISuggestionsControlStateMutableBuilder[Self <: ISuggestionsControlState[_], T] (val x: Self with ISuggestionsControlState[T]) extends AnyVal {
      
      @scala.inline
      def setSelectedFooterIndex(value: Double): Self = StObject.set(x, "selectedFooterIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedHeaderIndex(value: Double): Self = StObject.set(x, "selectedHeaderIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestions(value: js.Array[ISuggestionModel[T]]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsVarargs(value: ISuggestionModel[T]*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
    }
  }
}
