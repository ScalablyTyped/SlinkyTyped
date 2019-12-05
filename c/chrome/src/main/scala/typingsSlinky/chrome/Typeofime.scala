package typingsSlinky.chrome

import typingsSlinky.chrome.chrome.input.ime.ActivateEvent
import typingsSlinky.chrome.chrome.input.ime.BlurEvent
import typingsSlinky.chrome.chrome.input.ime.CandidateClickedEvent
import typingsSlinky.chrome.chrome.input.ime.CandidateWindowParameter
import typingsSlinky.chrome.chrome.input.ime.CandidatesParameters
import typingsSlinky.chrome.chrome.input.ime.ClearCompositionParameters
import typingsSlinky.chrome.chrome.input.ime.CommitTextParameters
import typingsSlinky.chrome.chrome.input.ime.CompositionParameters
import typingsSlinky.chrome.chrome.input.ime.CursorPositionParameters
import typingsSlinky.chrome.chrome.input.ime.DeactivatedEvent
import typingsSlinky.chrome.chrome.input.ime.DeleteSurroundingTextParameters
import typingsSlinky.chrome.chrome.input.ime.FocusEvent
import typingsSlinky.chrome.chrome.input.ime.ImeParameters
import typingsSlinky.chrome.chrome.input.ime.InputContextUpdateEvent
import typingsSlinky.chrome.chrome.input.ime.InputResetEvent
import typingsSlinky.chrome.chrome.input.ime.KeyEventEvent
import typingsSlinky.chrome.chrome.input.ime.MenuItemActivatedEvent
import typingsSlinky.chrome.chrome.input.ime.MenuItemParameters
import typingsSlinky.chrome.chrome.input.ime.SendKeyEventParameters
import typingsSlinky.chrome.chrome.input.ime.SurroundingTextChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofime extends js.Object {
  var onActivate: ActivateEvent = js.native
  var onBlur: BlurEvent = js.native
  var onCandidateClicked: CandidateClickedEvent = js.native
  var onDeactivated: DeactivatedEvent = js.native
  var onFocus: FocusEvent = js.native
  var onInputContextUpdate: InputContextUpdateEvent = js.native
  var onKeyEvent: KeyEventEvent = js.native
  var onMenuItemActivated: MenuItemActivatedEvent = js.native
  var onReset: InputResetEvent = js.native
  var onSurroundingTextChanged: SurroundingTextChangedEvent = js.native
  def clearComposition(parameters: ClearCompositionParameters): Unit = js.native
  def clearComposition(parameters: ClearCompositionParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  def commitText(parameters: CommitTextParameters): Unit = js.native
  def commitText(parameters: CommitTextParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  def deleteSurroundingText(parameters: DeleteSurroundingTextParameters): Unit = js.native
  def deleteSurroundingText(parameters: DeleteSurroundingTextParameters, callback: js.Function0[Unit]): Unit = js.native
  def hideInputView(): Unit = js.native
  def keyEventHandled(requestId: String, response: Boolean): Unit = js.native
  def sendKeyEvents(parameters: SendKeyEventParameters): Unit = js.native
  def sendKeyEvents(parameters: SendKeyEventParameters, callback: js.Function0[Unit]): Unit = js.native
  def setCandidateWindowProperties(parameters: CandidateWindowParameter): Unit = js.native
  def setCandidateWindowProperties(parameters: CandidateWindowParameter, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  def setCandidates(parameters: CandidatesParameters): Unit = js.native
  def setCandidates(parameters: CandidatesParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  def setComposition(parameters: CompositionParameters): Unit = js.native
  def setComposition(parameters: CompositionParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  def setCursorPosition(parameters: CursorPositionParameters): Unit = js.native
  def setCursorPosition(parameters: CursorPositionParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  def setMenuItems(parameters: ImeParameters): Unit = js.native
  def setMenuItems(parameters: ImeParameters, callback: js.Function0[Unit]): Unit = js.native
  def updateMenuItems(parameters: MenuItemParameters): Unit = js.native
  def updateMenuItems(parameters: MenuItemParameters, callback: js.Function0[Unit]): Unit = js.native
}

