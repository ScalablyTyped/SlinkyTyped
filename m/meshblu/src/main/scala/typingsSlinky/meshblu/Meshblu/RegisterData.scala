package typingsSlinky.meshblu.Meshblu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterData extends StObject {
  
  var `type`: String = js.native
}
object RegisterData {
  
  @scala.inline
  def apply(`type`: String): RegisterData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterData]
  }
  
  @scala.inline
  implicit class RegisterDataMutableBuilder[Self <: RegisterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
