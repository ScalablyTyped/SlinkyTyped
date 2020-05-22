package typingsSlinky.ckeditor.CKEDITOR.plugins

import typingsSlinky.ckeditor.CKEDITOR.editor
import typingsSlinky.ckeditor.CKEDITOR.plugins.widget.definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait autoEmbed extends js.Object {
  def getWidgetDefinition(editor: editor, url: String): definition
}

object autoEmbed {
  @scala.inline
  def apply(getWidgetDefinition: (editor, String) => definition): autoEmbed = {
    val __obj = js.Dynamic.literal(getWidgetDefinition = js.Any.fromFunction2(getWidgetDefinition))
    __obj.asInstanceOf[autoEmbed]
  }
}

