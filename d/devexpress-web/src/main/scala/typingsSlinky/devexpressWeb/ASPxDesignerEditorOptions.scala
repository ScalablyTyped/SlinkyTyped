package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerEditorOptions extends js.Object {
  
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
  implicit class ASPxDesignerEditorOptionsOps[Self <: ASPxDesignerEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorType(value: js.Any): Self = this.set("editorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
  }
}
