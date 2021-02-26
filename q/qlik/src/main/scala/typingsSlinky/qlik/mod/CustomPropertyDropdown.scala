package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.dropdown
import typingsSlinky.qlik.qlikStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyDropdown
  extends CustomPropertyCommon
     with CustomProperty {
  
  var component: dropdown = js.native
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[CustomPropertyOptions] = js.native
  
  @JSName("ref")
  var ref_CustomPropertyDropdown: String = js.native
  
  @JSName("type")
  var type_CustomPropertyDropdown: string = js.native
}
object CustomPropertyDropdown {
  
  @scala.inline
  def apply(component: dropdown, ref: String, `type`: string): CustomPropertyDropdown = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyDropdown]
  }
  
  @scala.inline
  implicit class CustomPropertyDropdownMutableBuilder[Self <: CustomPropertyDropdown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dropdown): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setOptions(value: CustomPropertyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsFunction0(value: () => js.Array[CustomPropertyOption]): Self = StObject.set(x, "options", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: CustomPropertyOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
