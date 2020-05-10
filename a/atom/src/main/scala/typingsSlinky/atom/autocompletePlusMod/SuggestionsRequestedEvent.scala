package typingsSlinky.atom.autocompletePlusMod

import typingsSlinky.atom.mod.Point
import typingsSlinky.atom.mod.ScopeDescriptor
import typingsSlinky.atom.mod.TextEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionsRequestedEvent extends js.Object {
  /** Whether the autocomplete request was initiated by the user. */
  var activatedManually: Boolean = js.native
  /** The position of the cursor. */
  var bufferPosition: Point = js.native
  /** The current TextEditor. */
  var editor: TextEditor = js.native
  /** The prefix for the word immediately preceding the current cursor position. */
  var prefix: String = js.native
  /** The scope descriptor for the current cursor position. */
  var scopeDescriptor: ScopeDescriptor = js.native
}

object SuggestionsRequestedEvent {
  @scala.inline
  def apply(
    activatedManually: Boolean,
    bufferPosition: Point,
    editor: TextEditor,
    prefix: String,
    scopeDescriptor: ScopeDescriptor
  ): SuggestionsRequestedEvent = {
    val __obj = js.Dynamic.literal(activatedManually = activatedManually.asInstanceOf[js.Any], bufferPosition = bufferPosition.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionsRequestedEvent]
  }
  @scala.inline
  implicit class SuggestionsRequestedEventOps[Self <: SuggestionsRequestedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivatedManually(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activatedManually")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: TextEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDescriptor(value: ScopeDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

