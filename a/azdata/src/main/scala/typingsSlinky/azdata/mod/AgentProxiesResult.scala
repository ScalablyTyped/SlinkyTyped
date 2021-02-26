package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentProxiesResult extends ResultStatus {
  
  var proxies: js.Array[AgentProxyInfo] = js.native
}
object AgentProxiesResult {
  
  @scala.inline
  def apply(errorMessage: String, proxies: js.Array[AgentProxyInfo], success: Boolean): AgentProxiesResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], proxies = proxies.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentProxiesResult]
  }
  
  @scala.inline
  implicit class AgentProxiesResultMutableBuilder[Self <: AgentProxiesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProxies(value: js.Array[AgentProxyInfo]): Self = StObject.set(x, "proxies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxiesVarargs(value: AgentProxyInfo*): Self = StObject.set(x, "proxies", js.Array(value :_*))
  }
}
