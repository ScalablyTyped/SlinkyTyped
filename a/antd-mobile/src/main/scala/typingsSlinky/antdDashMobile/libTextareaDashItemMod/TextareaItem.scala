package typingsSlinky.antdDashMobile.libTextareaDashItemMod

import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextareaItem
  extends Component[TextareaItemProps, TextareaItemState, js.Any] {
  var debounceTimeout: js.Any = js.native
  var textareaRef: js.Any = js.native
  def clearInput(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTextareaItem(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTextareaItem(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTextareaItem(nextProps: TextareaItemProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTextareaItem(): Unit = js.native
  def focus(): Unit = js.native
  def onBlur(e: SyntheticFocusEvent[HTMLTextAreaElement]): Unit = js.native
  def onChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  def onErrorClick(): Unit = js.native
  def onFocus(e: SyntheticFocusEvent[HTMLTextAreaElement]): Unit = js.native
  def reAlignHeight(): Unit = js.native
}

