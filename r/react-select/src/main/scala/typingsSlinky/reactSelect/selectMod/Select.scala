package typingsSlinky.reactSelect.selectMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.TouchEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSelect.anon.ClearValue
import typingsSlinky.reactSelect.anon.Context
import typingsSlinky.reactSelect.anon.Event
import typingsSlinky.reactSelect.componentsMod.PlaceholderOrValue
import typingsSlinky.reactSelect.componentsMod.SelectComponents
import typingsSlinky.reactSelect.reactSelectStrings.first
import typingsSlinky.reactSelect.reactSelectStrings.group
import typingsSlinky.reactSelect.reactSelectStrings.input
import typingsSlinky.reactSelect.reactSelectStrings.last
import typingsSlinky.reactSelect.reactSelectStrings.listbox
import typingsSlinky.reactSelect.reactSelectStrings.next
import typingsSlinky.reactSelect.reactSelectStrings.option
import typingsSlinky.reactSelect.reactSelectStrings.previous
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.FocusDirection
import typingsSlinky.reactSelect.typesMod.InputActionMeta
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select[OptionType /* <: OptionTypeBase */]
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  
  def announceAriaLiveContext(props: Event): Unit = js.native
  
  // ==============================
  // Helpers
  // ==============================
  def announceAriaLiveSelection(props: Context): Unit = js.native
  
  // Misc. Instance Properties
  // ------------------------------
  var blockOptionHover: Boolean = js.native
  
  def blur(): Unit = js.native
  
  def blurInput(): Unit = js.native
  
  // ==============================
  // Menu Options
  // ==============================
  def buildMenuOptions(props: Props[OptionType], selectValue: OptionsType[OptionType]): MenuOptions[OptionType] = js.native
  
  // Lifecycle
  // ------------------------------
  def cacheComponents(components: SelectComponents[OptionType]): Unit = js.native
  
  var clearFocusValueOnUpdate: Boolean = js.native
  
  def clearValue(): Unit = js.native
  
  var commonProps: js.Any = js.native
  
   // TODO
  var components: SelectComponents[OptionType] = js.native
  
  // ==============================
  // Renderers
  // ==============================
  def constructAriaLiveMessage(): String = js.native
  
  // Refs
  // ------------------------------
  var controlRef: ElRef = js.native
  
  def countOptions(): Double = js.native
  
  def filterOption(option: js.Object, inputValue: String): Boolean = js.native
  
  // aliased for consumers
  def focus(): Unit = js.native
  
  // ==============================
  // Methods
  // ==============================
  def focusInput(): Unit = js.native
  
  def focusOption(direction: FocusDirection): Unit = js.native
  
  @JSName("focusValue")
  def focusValue_next(direction: next): Unit = js.native
  @JSName("focusValue")
  def focusValue_previous(direction: previous): Unit = js.native
  
  var focusedOptionRef: ElRef = js.native
  
  var formatGroupLabel: typingsSlinky.reactSelect.builtinsMod.formatGroupLabel[OptionType] = js.native
  
  def formatOptionLabel(data: OptionType, context: FormatOptionLabelContext): ReactElement = js.native
  
  def getActiveDescendentId(): js.Any = js.native
  
  // ==============================
  // Getters
  // ==============================
  def getCommonProps(): ClearValue[OptionType] = js.native
  
  def getControlRef(ref: HTMLElement): Unit = js.native
  
  @JSName("getElementId")
  def getElementId_group(element: group): String = js.native
  @JSName("getElementId")
  def getElementId_input(element: input): String = js.native
  @JSName("getElementId")
  def getElementId_listbox(element: listbox): String = js.native
  @JSName("getElementId")
  def getElementId_option(element: option): String = js.native
  
  def getFocusedOptionRef(ref: HTMLElement): Unit = js.native
  
  def getInputRef(ref: HTMLElement): Unit = js.native
  
  def getMenuListRef(ref: HTMLElement): Unit = js.native
  
  def getNextFocusedOption(options: OptionsType[OptionType]): OptionType = js.native
  
  def getNextFocusedValue(nextSelectValue: OptionsType[OptionType]): OptionType = js.native
  
  var getOptionLabel: typingsSlinky.reactSelect.builtinsMod.getOptionLabel[OptionType] = js.native
  
  var getOptionValue: typingsSlinky.reactSelect.builtinsMod.getOptionValue[OptionType] = js.native
  
  def getStyles(key: String, props: js.Object): js.Object = js.native
  
  // ==============================
  // Focus Handlers
  // ==============================
  def handleInputChange(event: SyntheticKeyboardEvent[HTMLInputElement]): Unit = js.native
  
  var hasGroups: Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def hasValue(): Boolean = js.native
  
  var initialTouchX: Double = js.native
  
  var initialTouchY: Double = js.native
  
  var inputIsHiddenAfterUpdate: Boolean | Null = js.native
  
  var inputRef: ElRef = js.native
  
  var instancePrefix: String = js.native
  
  def isClearable(): Boolean = js.native
  
  def isOptionDisabled(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
  
  def isOptionSelected(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
  
  var menuListRef: ElRef = js.native
  
  def onClearIndicatorMouseDown(event: MouseOrTouchEvent): Unit = js.native
  
  def onClearIndicatorTouchEnd(event: SyntheticTouchEvent[HTMLElement]): Unit = js.native
  
  def onCompositionEnd(): Unit = js.native
  
  def onCompositionStart(): Unit = js.native
  
  def onControlMouseDown(event: MouseOrTouchEvent): Unit = js.native
  
  def onControlTouchEnd(event: SyntheticTouchEvent[HTMLElement]): Unit = js.native
  
  def onDropdownIndicatorMouseDown(event: MouseOrTouchEvent): Unit = js.native
  
  def onDropdownIndicatorTouchEnd(event: SyntheticTouchEvent[HTMLElement]): Unit = js.native
  
  def onInputBlur(event: SyntheticFocusEvent[HTMLInputElement]): Unit = js.native
  
  def onInputChange(newValue: String, actionMeta: InputActionMeta): Unit = js.native
  
  def onInputFocus(event: SyntheticFocusEvent[HTMLInputElement]): Unit = js.native
  
  // ==============================
  // Keyboard Handlers
  // ==============================
  def onKeyDown(event: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
  
  def onMenuClose(): Unit = js.native
  
  // ==============================
  // Mouse Handlers
  // ==============================
  def onMenuMouseDown(event: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  
  def onMenuMouseMove(event: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  
  // ==============================
  // Consumer Handlers
  // ==============================
  def onMenuOpen(): Unit = js.native
  
  def onOptionHover(focusedOption: OptionType): Unit = js.native
  
  def onScroll(event: org.scalajs.dom.raw.Event): Unit = js.native
  
  def onTouchEnd(event: TouchEvent): Unit = js.native
  
  def onTouchMove(event: TouchEvent): Unit = js.native
  
  def onTouchStart(event: TouchEvent): Unit = js.native
  
  var openAfterFocus: Boolean = js.native
  
  @JSName("openMenu")
  def openMenu_first(focusOption: first): Unit = js.native
  @JSName("openMenu")
  def openMenu_last(focusOption: last): Unit = js.native
  
  def popValue(): Unit = js.native
  
  def removeValue(removedValue: OptionType): Unit = js.native
  
  def renderClearIndicator(): ReactElement = js.native
  
  def renderDropdownIndicator(): ReactElement = js.native
  
  def renderFormField(): ReactElement = js.native
  
  def renderIndicatorSeparator(): ReactElement = js.native
  
  def renderInput(): ReactElement = js.native
  
  def renderLiveRegion(): ReactElement = js.native
  
  def renderLoadingIndicator(): ReactElement = js.native
  
  def renderMenu(): ReactElement = js.native
  
  def renderPlaceholderOrValue(): PlaceholderOrValue[OptionType] | Null = js.native
  
  var scrollToFocusedOptionOnUpdate: Boolean = js.native
  
  def selectOption(newValue: OptionType): Unit = js.native
  
  def setValue(newValue: ValueType[OptionType], action: ActionTypes): Unit = js.native
  def setValue(newValue: ValueType[OptionType], action: ActionTypes, option: OptionType): Unit = js.native
  
  def shouldHideSelectedOptions(): Boolean = js.native
  
  // ==============================
  // Composition Handlers
  // ==============================
  def startListeningComposition(): Unit = js.native
  
  // ==============================
  // Touch Handlers
  // ==============================
  def startListeningToTouch(): Unit = js.native
  
  def stopListeningComposition(): Unit = js.native
  
  def stopListeningToTouch(): Unit = js.native
  
  var userIsDragging: Boolean | Null = js.native
}
