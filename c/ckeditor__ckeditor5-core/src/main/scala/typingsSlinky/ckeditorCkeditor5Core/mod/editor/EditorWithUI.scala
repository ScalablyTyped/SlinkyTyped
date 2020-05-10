package typingsSlinky.ckeditorCkeditor5Core.mod.editor

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// core/editor/editorwithui
@js.native
trait EditorWithUI extends js.Object {
  val element: HTMLElement | Null = js.native
  val ui: EditorUI = js.native
}

object EditorWithUI {
  @scala.inline
  def apply(ui: EditorUI): EditorWithUI = {
    val __obj = js.Dynamic.literal(ui = ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorWithUI]
  }
  @scala.inline
  implicit class EditorWithUIOps[Self <: EditorWithUI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUi(value: EditorUI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(null)
        ret
    }
  }
  
}

