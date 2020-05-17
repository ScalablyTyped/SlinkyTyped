package typingsSlinky.ckeditor.CKEDITOR.plugins

import typingsSlinky.ckeditor.CKEDITOR.editor
import typingsSlinky.ckeditor.CKEDITOR.plugins.widget.definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait autoEmbed extends js.Object {
  def getWidgetDefinition(editor: editor, url: String): definition = js.native
}

object autoEmbed {
  @scala.inline
  def apply(getWidgetDefinition: (editor, String) => definition): autoEmbed = {
    val __obj = js.Dynamic.literal(getWidgetDefinition = js.Any.fromFunction2(getWidgetDefinition))
    __obj.asInstanceOf[autoEmbed]
  }
  @scala.inline
  implicit class autoEmbedOps[Self <: autoEmbed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetWidgetDefinition(value: (editor, String) => definition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidgetDefinition")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

