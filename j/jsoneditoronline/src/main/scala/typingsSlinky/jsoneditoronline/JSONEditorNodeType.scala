package typingsSlinky.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEditorNodeType extends StObject {
  
  var className: String = js.native
  
  var title: String = js.native
  
  var value: String = js.native
}
object JSONEditorNodeType {
  
  @scala.inline
  def apply(className: String, title: String, value: String): JSONEditorNodeType = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorNodeType]
  }
  
  @scala.inline
  implicit class JSONEditorNodeTypeMutableBuilder[Self <: JSONEditorNodeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
