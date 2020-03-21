package typingsSlinky.officeUiFabricReact.searchBoxBaseMod

import typingsSlinky.officeUiFabricReact.PickISearchBoxPropsdisabl
import typingsSlinky.officeUiFabricReact.searchBoxTypesMod.ISearchBoxProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SearchBox/SearchBox.base", "SearchBoxBase")
@js.native
class SearchBoxBase protected ()
  extends Component[ISearchBoxProps, ISearchBoxState, js.Any] {
  def this(props: ISearchBoxProps) = this()
  var _callOnChange: js.Any = js.native
  var _events: js.Any = js.native
  var _fallbackId: js.Any = js.native
  var _inputElement: js.Any = js.native
  var _latestValue: js.Any = js.native
  var _onBlur: js.Any = js.native
  var _onClear: js.Any = js.native
  var _onClearClick: js.Any = js.native
  var _onClickFocus: js.Any = js.native
  var _onFocusCapture: js.Any = js.native
  var _onInputChange: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _rootElement: js.Any = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MSearchBoxBase(newProps: ISearchBoxProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSearchBoxBase(): Unit = js.native
  /**
    * Sets focus to the search box input field
    */
  def focus(): Unit = js.native
  /**
    * Returns whether or not the SearchBox has focus
    */
  def hasFocus(): Boolean = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/SearchBox/SearchBox.base", "SearchBoxBase")
@js.native
object SearchBoxBase extends js.Object {
  var defaultProps: PickISearchBoxPropsdisabl = js.native
}

