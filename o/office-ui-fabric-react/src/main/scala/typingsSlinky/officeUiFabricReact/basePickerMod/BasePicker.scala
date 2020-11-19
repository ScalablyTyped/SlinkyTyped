package typingsSlinky.officeUiFabricReact.basePickerMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MBasePicker(newProps: P): Unit = js.native
  
  @JSName("UNSAFE_componentWillUpdate")
  def UNSAFE_componentWillUpdate_MBasePicker(newProps: P, newState: IBasePickerState): Unit = js.native
  
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
