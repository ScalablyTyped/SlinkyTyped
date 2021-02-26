package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorImageBrowserSchemaModelFields extends StObject {
  
  var name: js.UndefOr[String | EditorImageBrowserSchemaModelFieldsName] = js.native
  
  var size: js.UndefOr[String | EditorImageBrowserSchemaModelFieldsSize] = js.native
  
  var `type`: js.UndefOr[String | EditorImageBrowserSchemaModelFieldsType] = js.native
}
object EditorImageBrowserSchemaModelFields {
  
  @scala.inline
  def apply(): EditorImageBrowserSchemaModelFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImageBrowserSchemaModelFields]
  }
  
  @scala.inline
  implicit class EditorImageBrowserSchemaModelFieldsMutableBuilder[Self <: EditorImageBrowserSchemaModelFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String | EditorImageBrowserSchemaModelFieldsName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: String | EditorImageBrowserSchemaModelFieldsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: String | EditorImageBrowserSchemaModelFieldsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
