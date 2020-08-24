package typingsSlinky.reactAce.aceMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactAce.anon.Text
import typingsSlinky.reactAce.typesMod.IAceEditor
import typingsSlinky.reactAce.typesMod.IMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactAce
  extends Component[IAceEditorProps, js.Object, js.Any] {
  var editor: IAceEditor = js.native
  var refEditor: HTMLElement = js.native
  var silent: Boolean = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactAce(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactAce(prevProps: IAceEditorProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactAce(): Unit = js.native
  def debounce(fn: js.Any, delay: Double): js.Function1[/* args */ js.Any, Unit] = js.native
  def handleMarkers(markers: js.Array[IMarker]): Unit = js.native
  def handleOptions(props: IAceEditorProps): Unit = js.native
  def handleScrollMargins(): Unit = js.native
  def handleScrollMargins(margins: js.Array[Double]): Unit = js.native
  def isInShadow(node: HTMLElement): Boolean = js.native
  def onBlur(event: js.Any): Unit = js.native
  def onChange(event: js.Any): Unit = js.native
  def onCopy(hasText: Text): Unit = js.native
  def onCursorChange(event: js.Any): Unit = js.native
  def onFocus(event: js.Any): Unit = js.native
  def onInput(): Unit = js.native
  def onInput(event: js.Any): Unit = js.native
  def onPaste(hasText: Text): Unit = js.native
  def onScroll(): Unit = js.native
  def onSelectionChange(event: js.Any): Unit = js.native
  def updatePlaceholder(): Unit = js.native
  def updateRef(item: HTMLElement): Unit = js.native
}

