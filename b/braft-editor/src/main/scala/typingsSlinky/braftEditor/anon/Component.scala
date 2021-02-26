package typingsSlinky.braftEditor.anon

import slinky.core.facade.ReactElement
import typingsSlinky.braftEditor.braftEditorStrings.component
import typingsSlinky.braftEditor.mod.ExtendControlType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component extends ExtendControlType {
  
  var component: ReactElement = js.native
  
  var key: String = js.native
  
  var `type`: component = js.native
}
object Component {
  
  @scala.inline
  def apply(key: String, `type`: component): Component = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: component): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
