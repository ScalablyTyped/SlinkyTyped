package typingsSlinky.ckeditor.CKEDITOR.style

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.style.customHandlers")
@js.native
object customHandlers extends js.Object {
  
  @js.native
  trait widget
    extends typingsSlinky.ckeditor.CKEDITOR.style {
    
    def checkElement(element: element): Boolean = js.native
    
    def getClassesArray(): js.Array[String] = js.native
    
    var group: js.Array[_] = js.native
    
    def removeStylesFromSameGroup(editor: editor): Boolean = js.native
    
    var widget: String = js.native
  }
}
