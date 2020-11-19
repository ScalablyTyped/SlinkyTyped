package typingsSlinky.ckeditor.global.CKEDITOR

import typingsSlinky.ckeditor.CKEDITOR.style.customHandler
import typingsSlinky.ckeditor.CKEDITOR.style.definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.style")
@js.native
class style protected ()
  extends typingsSlinky.ckeditor.CKEDITOR.style {
  def this(styleDefinition: definition, variableValues: js.Any) = this()
}
@JSGlobal("CKEDITOR.style")
@js.native
object style extends js.Object {
  
  def addCustomHandler(defintion: customHandler): typingsSlinky.ckeditor.CKEDITOR.style = js.native
  
  def getStyleText(style: definition): String = js.native
  
  @js.native
  object customHandlers extends js.Object {
    
    @js.native
    class widget ()
      extends typingsSlinky.ckeditor.CKEDITOR.style.customHandlers.widget
  }
}
