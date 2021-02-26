package typingsSlinky.ckeditor.global.CKEDITOR

import typingsSlinky.ckeditor.CKEDITOR.style.customHandler
import typingsSlinky.ckeditor.CKEDITOR.style.definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.style")
@js.native
class style protected ()
  extends typingsSlinky.ckeditor.CKEDITOR.style {
  def this(styleDefinition: definition, variableValues: js.Any) = this()
}
object style {
  
  @JSGlobal("CKEDITOR.style.addCustomHandler")
  @js.native
  def addCustomHandler(defintion: customHandler): typingsSlinky.ckeditor.CKEDITOR.style = js.native
  
  object customHandlers {
    
    @JSGlobal("CKEDITOR.style.customHandlers.widget")
    @js.native
    class widget ()
      extends typingsSlinky.ckeditor.CKEDITOR.style.customHandlers.widget
  }
  
  @JSGlobal("CKEDITOR.style.getStyleText")
  @js.native
  def getStyleText(style: definition): String = js.native
}
