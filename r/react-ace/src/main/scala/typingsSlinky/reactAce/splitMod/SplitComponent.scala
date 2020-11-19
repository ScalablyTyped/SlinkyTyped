package typingsSlinky.reactAce.splitMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactAce.typesMod.IMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitComponent
  extends Component[ISplitEditorProps, js.UndefOr[scala.Nothing], js.Any]
     with /* index */ StringDictionary[js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MSplitComponent(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSplitComponent(prevProps: ISplitEditorProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSplitComponent(): Unit = js.native
  
  def debounce(fn: js.Any, delay: Double): js.Function1[/* args */ js.Any, Unit] = js.native
  
  var editor: IAceEditorClass = js.native
  
  def handleMarkers(markers: js.Array[IMarker], editor: IAceEditorClass): Unit = js.native
  
  def handleOptions(props: ISplitEditorProps, editor: IAceEditorClass): Unit = js.native
  
  def isInShadow(node: HTMLElement): Boolean = js.native
  
  def onBlur(event: js.Any): Unit = js.native
  
  def onChange(event: js.Any): Unit = js.native
  
  def onCopy(text: String): Unit = js.native
  
  def onCursorChange(event: js.Any): Unit = js.native
  
  def onFocus(event: js.Any): Unit = js.native
  
  def onInput(event: js.Any): Unit = js.native
  
  def onPaste(text: String): Unit = js.native
  
  def onScroll(): Unit = js.native
  
  def onSelectionChange(event: js.Any): Unit = js.native
  
  var refEditor: HTMLElement = js.native
  
  var silent: Boolean = js.native
  
  var split: IAceEditorClass = js.native
  
  var splitEditor: IAceEditorClass = js.native
  
  def updateRef(item: HTMLElement): Unit = js.native
}
