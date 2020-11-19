package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorImageBrowserSchemaModel extends js.Object {
  
  var fields: js.UndefOr[EditorImageBrowserSchemaModelFields] = js.native
  
  var id: js.UndefOr[String] = js.native
}
object EditorImageBrowserSchemaModel {
  
  @scala.inline
  def apply(): EditorImageBrowserSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImageBrowserSchemaModel]
  }
  
  @scala.inline
  implicit class EditorImageBrowserSchemaModelOps[Self <: EditorImageBrowserSchemaModel] (val x: Self) extends AnyVal {
    
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
    def setFields(value: EditorImageBrowserSchemaModelFields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
