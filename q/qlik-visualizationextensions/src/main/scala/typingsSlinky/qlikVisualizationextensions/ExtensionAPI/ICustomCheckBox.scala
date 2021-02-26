package typingsSlinky.qlikVisualizationextensions.ExtensionAPI

import typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.checkbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomCheckBox extends ICustomControl {
  
  var component: checkbox = js.native
  
  var defaultValue: Boolean = js.native
}
object ICustomCheckBox {
  
  @scala.inline
  def apply(component: checkbox, defaultValue: Boolean, label: String, ref: String, `type`: String): ICustomCheckBox = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomCheckBox]
  }
  
  @scala.inline
  implicit class ICustomCheckBoxMutableBuilder[Self <: ICustomCheckBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: checkbox): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}
