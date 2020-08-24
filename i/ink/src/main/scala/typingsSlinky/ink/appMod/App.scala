package typingsSlinky.ink.appMod

import typingsSlinky.ink.anon.ActiveFocusId
import typingsSlinky.ink.anon.AutoFocus
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App
  extends Component[Props, State, js.Any] {
  var rawModeEnabledCount: Double = js.native
  @JSName("state")
  var state_App: ActiveFocusId = js.native
  def activateFocusable(id: String): Unit = js.native
  def addFocusable(id: String, hasAutoFocus: AutoFocus): Unit = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MApp(error: js.Error): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MApp(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MApp(): Unit = js.native
  def deactivateFocusable(id: String): Unit = js.native
  def disableFocus(): Unit = js.native
  def enableFocus(): Unit = js.native
  def findNextFocusable(state: State): js.UndefOr[String] = js.native
  def findPreviousFocusable(state: State): js.UndefOr[String] = js.native
  def focusNext(): Unit = js.native
  def focusPrevious(): Unit = js.native
  def handleExit(): Unit = js.native
  def handleExit(error: js.Error): Unit = js.native
  def handleInput(input: String): Unit = js.native
  def handleSetRawMode(isEnabled: Boolean): Unit = js.native
  def isRawModeSupported(): Boolean = js.native
  def removeFocusable(id: String): Unit = js.native
}

