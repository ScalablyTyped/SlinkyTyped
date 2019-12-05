package typingsSlinky.reactDashSelect.srcSelectMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.TouchEvent
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashSelect.Anon_Action
import typingsSlinky.reactDashSelect.Anon_Context
import typingsSlinky.reactDashSelect.Anon_ContextEvent
import typingsSlinky.reactDashSelect.reactDashSelectStrings.first
import typingsSlinky.reactDashSelect.reactDashSelectStrings.group
import typingsSlinky.reactDashSelect.reactDashSelectStrings.input
import typingsSlinky.reactDashSelect.reactDashSelectStrings.last
import typingsSlinky.reactDashSelect.reactDashSelectStrings.listbox
import typingsSlinky.reactDashSelect.reactDashSelectStrings.next
import typingsSlinky.reactDashSelect.reactDashSelectStrings.option
import typingsSlinky.reactDashSelect.reactDashSelectStrings.previous
import typingsSlinky.reactDashSelect.srcComponentsMod.PlaceholderOrValue
import typingsSlinky.reactDashSelect.srcComponentsMod.SelectComponents
import typingsSlinky.reactDashSelect.srcTypesMod.ActionTypes
import typingsSlinky.reactDashSelect.srcTypesMod.FocusDirection
import typingsSlinky.reactDashSelect.srcTypesMod.InputActionMeta
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import typingsSlinky.reactDashSelect.srcTypesMod.OptionsType
import typingsSlinky.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select[OptionType /* <: OptionTypeBase */]
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  // Misc. Instance Properties
  // ------------------------------
  var blockOptionHover: Boolean = js.native
  var clearFocusValueOnUpdate: Boolean = js.native
  var commonProps: js.Any = js.native
   // TODO
  var components: SelectComponents[OptionType] = js.native
  // Refs
  // ------------------------------
  var controlRef: ElRef = js.native
  var focusedOptionRef: ElRef = js.native
  var formatGroupLabel: typingsSlinky.reactDashSelect.srcBuiltinsMod.formatGroupLabel[OptionType] = js.native
  var getOptionLabel: typingsSlinky.reactDashSelect.srcBuiltinsMod.getOptionLabel[OptionType] = js.native
  var getOptionValue: typingsSlinky.reactDashSelect.srcBuiltinsMod.getOptionValue[OptionType] = js.native
  var hasGroups: Boolean = js.native
  var initialTouchX: Double = js.native
  var initialTouchY: Double = js.native
  var inputIsHiddenAfterUpdate: Boolean | Null = js.native
  var inputRef: ElRef = js.native
  var instancePrefix: String = js.native
  var menuListRef: ElRef = js.native
  var openAfterFocus: Boolean = js.native
  var scrollToFocusedOptionOnUpdate: Boolean = js.native
  var userIsDragging: Boolean | Null = js.native
  def announceAriaLiveContext(props: Anon_ContextEvent): Unit = js.native
  // ==============================
  // Helpers
  // ==============================
  def announceAriaLiveSelection(props: Anon_Context): Unit = js.native
  def blur(): Unit = js.native
  def blurInput(): Unit = js.native
  // ==============================
  // Menu Options
  // ==============================
  def buildMenuOptions(props: Props[OptionType], selectValue: OptionsType[OptionType]): MenuOptions[OptionType] = js.native
  // Lifecycle
  // ------------------------------
  def cacheComponents(components: SelectComponents[OptionType]): Unit = js.native
  def clearValue(): Unit = js.native
  // ==============================
  // Renderers
  // ==============================
  def constructAriaLiveMessage(): String = js.native
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
  def formatOptionLabel(data: OptionType, context: FormatOptionLabelContext): TagMod[Any] = js.native
  def getActiveDescendentId(): js.Any = js.native
  // ==============================
  // Getters
  // ==============================
  def getCommonProps(): Anon_Action[OptionType] = js.native
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
  def getStyles(key: String, props: js.Object): js.Object = js.native
  // ==============================
  // Focus Handlers
  // ==============================
  def handleInputChange(event: SyntheticKeyboardEvent[HTMLInputElement]): Unit = js.native
  def hasOptions(): Boolean = js.native
  def hasValue(): Boolean = js.native
  def isClearable(): Boolean = js.native
  def isOptionDisabled(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
  def isOptionSelected(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
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
  def onScroll(event: Event): Unit = js.native
  def onTouchEnd(event: TouchEvent): Unit = js.native
  def onTouchMove(event: TouchEvent): Unit = js.native
  def onTouchStart(event: TouchEvent): Unit = js.native
  @JSName("openMenu")
  def openMenu_first(focusOption: first): Unit = js.native
  @JSName("openMenu")
  def openMenu_last(focusOption: last): Unit = js.native
  def popValue(): Unit = js.native
  def removeValue(removedValue: OptionType): Unit = js.native
  def renderClearIndicator(): TagMod[Any] = js.native
  def renderDropdownIndicator(): TagMod[Any] = js.native
  def renderFormField(): TagMod[Any] = js.native
  def renderIndicatorSeparator(): TagMod[Any] = js.native
  def renderInput(): TagMod[Any] = js.native
  def renderLiveRegion(): TagMod[Any] = js.native
  def renderLoadingIndicator(): TagMod[Any] = js.native
  def renderMenu(): TagMod[Any] = js.native
  def renderPlaceholderOrValue(): PlaceholderOrValue[OptionType] | Null = js.native
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
}

