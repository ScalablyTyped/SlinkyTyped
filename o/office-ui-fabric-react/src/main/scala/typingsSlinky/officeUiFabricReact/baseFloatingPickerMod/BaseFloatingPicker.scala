package typingsSlinky.officeUiFabricReact.baseFloatingPickerMod

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Selection
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPicker
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.suggestionsControlMod.SuggestionsControl
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsControlProps
import typingsSlinky.officeUiFabricReact.suggestionsStoreMod.SuggestionsStore
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/BaseFloatingPicker", "BaseFloatingPicker")
@js.native
class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
  extends Component[P, IBaseFloatingPickerState, js.Any]
     with IBaseFloatingPicker {
  def this(basePickerProps: P) = this()
  
  var SuggestionsControlOfProperType: Instantiable1[/* props */ ISuggestionsControlProps[T], SuggestionsControl[T]] = js.native
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MBaseFloatingPicker(newProps: IBaseFloatingPickerProps[T]): Unit = js.native
  
  var _async: js.Any = js.native
  
  var _bindToInputElement: js.Any = js.native
  
  var _onResolveSuggestions: js.Any = js.native
  
  var _onValidateInput: js.Any = js.native
  
  var _unbindFromInputElement: js.Any = js.native
  
  var _updateActiveDescendant: js.Any = js.native
  
  var _updateSuggestionsVisible: js.Any = js.native
  
  def completeSuggestion(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MBaseFloatingPicker(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MBaseFloatingPicker(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBaseFloatingPicker(): Unit = js.native
  
  var currentPromise: js.Thenable[js.Array[T]] = js.native
  
  val currentSelectedSuggestionIndex: Double = js.native
  
  def forceResolveSuggestion(): Unit = js.native
  
  var isComponentMounted: Boolean = js.native
  
  /* protected */ def onChange(item: T): Unit = js.native
  
  /* protected */ def onKeyDown(ev: MouseEvent): Unit = js.native
  
  /* protected */ def onSelectionChange(): Unit = js.native
  
  /* protected */ def onSuggestionClick(ev: SyntheticMouseEvent[HTMLElement], item: T, index: Double): Unit = js.native
  
  /* protected */ def onSuggestionRemove(ev: SyntheticMouseEvent[HTMLElement], item: T, index: Double): Unit = js.native
  
  /* protected */ def renderSuggestions(): ReactElement | Null = js.native
  
  var root: ReactRef[HTMLDivElement] = js.native
  
  var selection: Selection = js.native
  
  var suggestionStore: SuggestionsStore[T] = js.native
  
  var suggestionsControl: ReactRef[SuggestionsControl[T]] = js.native
  
  /* protected */ def updateSuggestionWithZeroState(): Unit = js.native
  
  def updateSuggestions(suggestions: js.Array[T]): Unit = js.native
  def updateSuggestions(suggestions: js.Array[T], forceUpdate: Boolean): Unit = js.native
  
  /* protected */ def updateSuggestionsList(suggestions: js.Array[T]): Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Thenable[js.Array[T]]): Unit = js.native
  
  /* protected */ def updateValue(updatedValue: String): Unit = js.native
}
