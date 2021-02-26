package typingsSlinky.persona

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
  var id: typingsSlinky.persona.Persona.Persona = js.native
}
object Navigator {
  
  @scala.inline
  def apply(id: typingsSlinky.persona.Persona.Persona): Navigator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: typingsSlinky.persona.Persona.Persona): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
