package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeDashUiDashFabricDashReact.libAutofillMod.Autofill
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerDotTypesMod.IBaseExtendedPicker
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerDotTypesMod.IBaseExtendedPickerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod.IBaseSelectedItemsListProps
import typingsSlinky.officeDashUiDashFabricDashReact.libFloatingPickerMod.BaseFloatingPicker
import typingsSlinky.officeDashUiDashFabricDashReact.libSelectedItemsListMod.BaseSelectedItemsList
import typingsSlinky.officeDashUiDashFabricDashReact.libSelectionMod.Selection
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesMod.BaseComponent
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/BaseExtendedPicker", "BaseExtendedPicker")
@js.native
class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
  extends BaseComponent[P, IBaseExtendedPickerState[T]]
     with IBaseExtendedPicker[T] {
  def this(basePickerProps: P) = this()
  var _addProcessedItem: js.Any = js.native
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
  var floatingPicker: ReactRef[BaseFloatingPicker[T, IBaseFloatingPickerProps[T]]] = js.native
  var floatingPickerProps: IBaseFloatingPickerProps[T] = js.native
  val highlightedItems: js.Array[T] = js.native
  var input: ReactRef[Autofill] = js.native
  val inputElement: HTMLInputElement | Null = js.native
  var root: ReactRef[HTMLDivElement] = js.native
  var selectedItemsList: ReactRef[BaseSelectedItemsList[T, IBaseSelectedItemsListProps[T]]] = js.native
  var selectedItemsListProps: IBaseSelectedItemsListProps[T] = js.native
  var selection: Selection = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MBaseExtendedPicker(newProps: P): Unit = js.native
  /* protected */ def _onSelectedItemsChanged(): Unit = js.native
  /* protected */ def _onSuggestionSelected(item: T): Unit = js.native
  /* protected */ def canAddItems(): Boolean = js.native
  def clearInput(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBaseExtendedPicker(): Unit = js.native
  /** Sets focus to the input. */
  /* CompleteClass */
  override def focus(): Unit = js.native
  /* protected */ def onBackspace(ev: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
  /* protected */ def onCopy(ev: SyntheticClipboardEvent[HTMLElement]): Unit = js.native
  /* protected */ def onInputChange(value: String): Unit = js.native
  /* protected */ def onInputClick(ev: SyntheticMouseEvent[HTMLInputElement | Autofill]): Unit = js.native
  /* protected */ def onInputFocus(ev: SyntheticFocusEvent[HTMLInputElement | Autofill]): Unit = js.native
  /* protected */ def onPaste(ev: SyntheticClipboardEvent[HTMLInputElement | Autofill]): Unit = js.native
  /* protected */ def onSelectionChange(): Unit = js.native
  /* protected */ def renderFloatingPicker(): Element = js.native
  /* protected */ def renderSelectedItemsList(): Element = js.native
}

