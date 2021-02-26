package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectAllRequestsTo extends StObject {
  
  /**
    * Name of the host where requests are redirected.
    */
  var HostName: typingsSlinky.awsSdk.s3Mod.HostName = js.native
  
  /**
    * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var Protocol: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Protocol] = js.native
}
object RedirectAllRequestsTo {
  
  @scala.inline
  def apply(HostName: HostName): RedirectAllRequestsTo = {
    val __obj = js.Dynamic.literal(HostName = HostName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectAllRequestsTo]
  }
  
  @scala.inline
  implicit class RedirectAllRequestsToMutableBuilder[Self <: RedirectAllRequestsTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostName(value: HostName): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
