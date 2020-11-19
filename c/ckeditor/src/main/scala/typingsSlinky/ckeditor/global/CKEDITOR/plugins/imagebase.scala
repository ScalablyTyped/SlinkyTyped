package typingsSlinky.ckeditor.global.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.editor
import typingsSlinky.ckeditor.CKEDITOR.plugins.imagebase.imageWidgetDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.plugins.imagebase")
@js.native
object imagebase extends js.Object {
  
  def addFeature(editor: editor, name: String, definition: imageWidgetDefinition): imageWidgetDefinition = js.native
  
  def addImageWidget(editor: editor, name: String, definition: imageWidgetDefinition): Unit = js.native
  
  @js.native
  object featuresDefinitions extends /* key */ StringDictionary[String]
  
  @js.native
  class progressBar ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.imagebase.progressBar
  
  @js.native
  class progressReporter ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.imagebase.progressReporter {
    def this(wrapperHtml: String) = this()
  }
}
