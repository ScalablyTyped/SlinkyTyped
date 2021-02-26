package typingsSlinky.aframe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentName extends StObject {
  
  var componentName: String = js.native
}
object ComponentName {
  
  @scala.inline
  def apply(componentName: String): ComponentName = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentName]
  }
  
  @scala.inline
  implicit class ComponentNameMutableBuilder[Self <: ComponentName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
  }
}
