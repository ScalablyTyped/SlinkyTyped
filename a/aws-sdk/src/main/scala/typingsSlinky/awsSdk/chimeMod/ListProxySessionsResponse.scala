package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProxySessionsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.native
  
  /**
    * The proxy session details.
    */
  var ProxySessions: js.UndefOr[typingsSlinky.awsSdk.chimeMod.ProxySessions] = js.native
}
object ListProxySessionsResponse {
  
  @scala.inline
  def apply(): ListProxySessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProxySessionsResponse]
  }
  
  @scala.inline
  implicit class ListProxySessionsResponseMutableBuilder[Self <: ListProxySessionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProxySessions(value: ProxySessions): Self = StObject.set(x, "ProxySessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxySessionsUndefined: Self = StObject.set(x, "ProxySessions", js.undefined)
    
    @scala.inline
    def setProxySessionsVarargs(value: ProxySession*): Self = StObject.set(x, "ProxySessions", js.Array(value :_*))
  }
}
