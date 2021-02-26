package typingsSlinky.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBrowserContextRequest extends StObject {
  
  /**
    * If specified, disposes this context when debugging session disconnects.
    */
  var disposeOnDetach: js.UndefOr[Boolean] = js.native
  
  /**
    * Proxy bypass list, similar to the one passed to --proxy-bypass-list
    */
  var proxyBypassList: js.UndefOr[String] = js.native
  
  /**
    * Proxy server, similar to the one passed to --proxy-server
    */
  var proxyServer: js.UndefOr[String] = js.native
}
object CreateBrowserContextRequest {
  
  @scala.inline
  def apply(): CreateBrowserContextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBrowserContextRequest]
  }
  
  @scala.inline
  implicit class CreateBrowserContextRequestMutableBuilder[Self <: CreateBrowserContextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisposeOnDetach(value: Boolean): Self = StObject.set(x, "disposeOnDetach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisposeOnDetachUndefined: Self = StObject.set(x, "disposeOnDetach", js.undefined)
    
    @scala.inline
    def setProxyBypassList(value: String): Self = StObject.set(x, "proxyBypassList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyBypassListUndefined: Self = StObject.set(x, "proxyBypassList", js.undefined)
    
    @scala.inline
    def setProxyServer(value: String): Self = StObject.set(x, "proxyServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyServerUndefined: Self = StObject.set(x, "proxyServer", js.undefined)
  }
}
