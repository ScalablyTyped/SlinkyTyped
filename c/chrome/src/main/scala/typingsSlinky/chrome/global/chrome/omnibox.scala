package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.omnibox.OmniboxInputCancelledEvent
import typingsSlinky.chrome.chrome.omnibox.OmniboxInputChangedEvent
import typingsSlinky.chrome.chrome.omnibox.OmniboxInputEnteredEvent
import typingsSlinky.chrome.chrome.omnibox.OmniboxInputStartedEvent
import typingsSlinky.chrome.chrome.omnibox.OmniboxSuggestionDeletedEvent
import typingsSlinky.chrome.chrome.omnibox.Suggestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Omnibox
////////////////////
/**
  * The omnibox API allows you to register a keyword with Google Chrome's address bar, which is also known as the omnibox.
  * Manifest:  "omnibox": {...}
  * @since Chrome 9.
  */
@JSGlobal("chrome.omnibox")
@js.native
object omnibox extends js.Object {
  var onDeleteSuggestion: OmniboxSuggestionDeletedEvent = js.native
  var onInputCancelled: OmniboxInputCancelledEvent = js.native
  var onInputChanged: OmniboxInputChangedEvent = js.native
  var onInputEntered: OmniboxInputEnteredEvent = js.native
  var onInputStarted: OmniboxInputStartedEvent = js.native
  def setDefaultSuggestion(suggestion: Suggestion): Unit = js.native
}

