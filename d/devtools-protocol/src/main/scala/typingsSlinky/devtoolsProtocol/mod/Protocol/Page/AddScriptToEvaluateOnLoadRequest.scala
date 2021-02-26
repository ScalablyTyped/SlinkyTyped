package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddScriptToEvaluateOnLoadRequest extends StObject {
  
  var scriptSource: String = js.native
}
object AddScriptToEvaluateOnLoadRequest {
  
  @scala.inline
  def apply(scriptSource: String): AddScriptToEvaluateOnLoadRequest = {
    val __obj = js.Dynamic.literal(scriptSource = scriptSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScriptToEvaluateOnLoadRequest]
  }
  
  @scala.inline
  implicit class AddScriptToEvaluateOnLoadRequestMutableBuilder[Self <: AddScriptToEvaluateOnLoadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScriptSource(value: String): Self = StObject.set(x, "scriptSource", value.asInstanceOf[js.Any])
  }
}
