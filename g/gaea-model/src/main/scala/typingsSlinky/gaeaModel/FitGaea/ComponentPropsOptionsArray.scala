package typingsSlinky.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentPropsOptionsArray extends ComponentPropsGaeaEdit {
  
  var key: String = js.native
}
object ComponentPropsOptionsArray {
  
  @scala.inline
  def apply(editable: Boolean, editor: String, field: String, hideTool: Boolean, key: String, label: String): ComponentPropsOptionsArray = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hideTool = hideTool.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropsOptionsArray]
  }
  
  @scala.inline
  implicit class ComponentPropsOptionsArrayMutableBuilder[Self <: ComponentPropsOptionsArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
