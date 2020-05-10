package typingsSlinky.atom.autocompletePlusMod

import typingsSlinky.atom.mod.Point
import typingsSlinky.atom.mod.TextEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionInsertedEvent extends js.Object {
  var editor: TextEditor = js.native
  var suggestion: TextSuggestion | SnippetSuggestion = js.native
  var triggerPosition: Point = js.native
}

object SuggestionInsertedEvent {
  @scala.inline
  def apply(editor: TextEditor, suggestion: TextSuggestion | SnippetSuggestion, triggerPosition: Point): SuggestionInsertedEvent = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], triggerPosition = triggerPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionInsertedEvent]
  }
  @scala.inline
  implicit class SuggestionInsertedEventOps[Self <: SuggestionInsertedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditor(value: TextEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestion(value: TextSuggestion | SnippetSuggestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

