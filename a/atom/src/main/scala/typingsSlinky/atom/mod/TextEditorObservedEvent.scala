package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditorObservedEvent extends js.Object {
  var index: Double = js.native
  var pane: Pane = js.native
  var textEditor: TextEditor = js.native
}

object TextEditorObservedEvent {
  @scala.inline
  def apply(index: Double, pane: Pane, textEditor: TextEditor): TextEditorObservedEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], textEditor = textEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorObservedEvent]
  }
  @scala.inline
  implicit class TextEditorObservedEventOps[Self <: TextEditorObservedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPane(value: Pane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextEditor(value: TextEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEditor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

