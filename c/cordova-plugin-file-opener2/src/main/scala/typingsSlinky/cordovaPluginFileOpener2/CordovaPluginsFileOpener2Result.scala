package typingsSlinky.cordovaPluginFileOpener2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPluginsFileOpener2Result extends StObject {
  
  var message: String = js.native
  
  var status: Double = js.native
}
object CordovaPluginsFileOpener2Result {
  
  @scala.inline
  def apply(message: String, status: Double): CordovaPluginsFileOpener2Result = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPluginsFileOpener2Result]
  }
  
  @scala.inline
  implicit class CordovaPluginsFileOpener2ResultMutableBuilder[Self <: CordovaPluginsFileOpener2Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
