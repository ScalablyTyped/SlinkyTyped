package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.colorPickerBaseMod.ColorComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component extends StObject {
  
  /** Which color component is being edited */
  var component: ColorComponent = js.native
  
  /** Currently entered value, which is not valid */
  var value: String = js.native
}
object Component {
  
  @scala.inline
  def apply(component: ColorComponent, value: String): Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: ColorComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
