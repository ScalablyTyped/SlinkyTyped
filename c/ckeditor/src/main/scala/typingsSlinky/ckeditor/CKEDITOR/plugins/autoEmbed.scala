package typingsSlinky.ckeditor.CKEDITOR.plugins

import typingsSlinky.ckeditor.CKEDITOR.editor
import typingsSlinky.ckeditor.CKEDITOR.plugins.widget.definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait autoEmbed extends StObject {
  
  def getWidgetDefinition(editor: editor, url: String): definition = js.native
}
object autoEmbed {
  
  @scala.inline
  def apply(getWidgetDefinition: (editor, String) => definition): autoEmbed = {
    val __obj = js.Dynamic.literal(getWidgetDefinition = js.Any.fromFunction2(getWidgetDefinition))
    __obj.asInstanceOf[autoEmbed]
  }
  
  @scala.inline
  implicit class autoEmbedMutableBuilder[Self <: autoEmbed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetWidgetDefinition(value: (editor, String) => definition): Self = StObject.set(x, "getWidgetDefinition", js.Any.fromFunction2(value))
  }
}
