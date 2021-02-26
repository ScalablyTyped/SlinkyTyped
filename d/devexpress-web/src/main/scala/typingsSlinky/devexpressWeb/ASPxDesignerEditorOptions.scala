package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerEditorOptions extends StObject {
  
  var content: String = js.native
  
  var editorType: js.Any = js.native
  
  var header: String = js.native
}
object ASPxDesignerEditorOptions {
  
  @scala.inline
  def apply(content: String, editorType: js.Any, header: String): ASPxDesignerEditorOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], editorType = editorType.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerEditorOptions]
  }
  
  @scala.inline
  implicit class ASPxDesignerEditorOptionsMutableBuilder[Self <: ASPxDesignerEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorType(value: js.Any): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
