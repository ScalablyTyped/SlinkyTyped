package typingsSlinky.chrome

import typingsSlinky.chrome.chrome.omnibox.OmniboxInputCancelledEvent
import typingsSlinky.chrome.chrome.omnibox.OmniboxInputChangedEvent
import typingsSlinky.chrome.chrome.omnibox.OmniboxInputEnteredEvent
import typingsSlinky.chrome.chrome.omnibox.OmniboxInputStartedEvent
import typingsSlinky.chrome.chrome.omnibox.OmniboxSuggestionDeletedEvent
import typingsSlinky.chrome.chrome.omnibox.Suggestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofomnibox extends js.Object {
  var onDeleteSuggestion: OmniboxSuggestionDeletedEvent = js.native
  var onInputCancelled: OmniboxInputCancelledEvent = js.native
  var onInputChanged: OmniboxInputChangedEvent = js.native
  var onInputEntered: OmniboxInputEnteredEvent = js.native
  var onInputStarted: OmniboxInputStartedEvent = js.native
  def setDefaultSuggestion(suggestion: Suggestion): Unit = js.native
}

object Typeofomnibox {
  @scala.inline
  def apply(
    onDeleteSuggestion: OmniboxSuggestionDeletedEvent,
    onInputCancelled: OmniboxInputCancelledEvent,
    onInputChanged: OmniboxInputChangedEvent,
    onInputEntered: OmniboxInputEnteredEvent,
    onInputStarted: OmniboxInputStartedEvent,
    setDefaultSuggestion: Suggestion => Unit
  ): Typeofomnibox = {
    val __obj = js.Dynamic.literal(onDeleteSuggestion = onDeleteSuggestion.asInstanceOf[js.Any], onInputCancelled = onInputCancelled.asInstanceOf[js.Any], onInputChanged = onInputChanged.asInstanceOf[js.Any], onInputEntered = onInputEntered.asInstanceOf[js.Any], onInputStarted = onInputStarted.asInstanceOf[js.Any], setDefaultSuggestion = js.Any.fromFunction1(setDefaultSuggestion))
    __obj.asInstanceOf[Typeofomnibox]
  }
  @scala.inline
  implicit class TypeofomniboxOps[Self <: Typeofomnibox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDeleteSuggestion(value: OmniboxSuggestionDeletedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeleteSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnInputCancelled(value: OmniboxInputCancelledEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputCancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnInputChanged(value: OmniboxInputChangedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnInputEntered(value: OmniboxInputEnteredEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputEntered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnInputStarted(value: OmniboxInputStartedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDefaultSuggestion(value: Suggestion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultSuggestion")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

