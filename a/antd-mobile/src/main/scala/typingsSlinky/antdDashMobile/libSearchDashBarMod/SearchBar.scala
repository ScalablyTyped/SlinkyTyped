package typingsSlinky.antdDashMobile.libSearchDashBarMod

import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.antdDashMobile.libSearchDashBarPropsTypeMod.SearchBarState
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBar
  extends Component[SearchBarProps, SearchBarState, js.Any] {
  var blurFromOnClear: Boolean = js.native
  var firstFocus: Boolean = js.native
  var inputContainerRef: js.Any = js.native
  var inputRef: HTMLInputElement | Null = js.native
  var onBlurTimeout: Double | Null = js.native
  var rightBtnInitMarginleft: String | Null = js.native
  var rightBtnRef: js.Any = js.native
  var syntheticPhContainerRef: js.Any = js.native
  var syntheticPhRef: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSearchBar(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSearchBar(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSearchBar(nextProps: SearchBarProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSearchBar(): Unit = js.native
  def doClear(): Unit = js.native
  def doClear(blurFromOnClear: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def onBlur(): Unit = js.native
  def onCancel(): Unit = js.native
  def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def onClear(): Unit = js.native
  def onFocus(): Unit = js.native
  def onSubmit(e: FormEvent[HTMLFormElement]): Unit = js.native
}

