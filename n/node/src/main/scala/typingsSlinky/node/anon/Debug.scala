package typingsSlinky.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debug extends StObject {
  
  var debug: Boolean = js.native
  
  var inspector: Boolean = js.native
  
  var ipv6: Boolean = js.native
  
  var tls: Boolean = js.native
  
  var tls_alpn: Boolean = js.native
  
  var tls_ocsp: Boolean = js.native
  
  var tls_sni: Boolean = js.native
  
  var uv: Boolean = js.native
}
object Debug {
  
  @scala.inline
  def apply(
    debug: Boolean,
    inspector: Boolean,
    ipv6: Boolean,
    tls: Boolean,
    tls_alpn: Boolean,
    tls_ocsp: Boolean,
    tls_sni: Boolean,
    uv: Boolean
  ): Debug = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], inspector = inspector.asInstanceOf[js.Any], ipv6 = ipv6.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any], tls_alpn = tls_alpn.asInstanceOf[js.Any], tls_ocsp = tls_ocsp.asInstanceOf[js.Any], tls_sni = tls_sni.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspector(value: Boolean): Self = StObject.set(x, "inspector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6(value: Boolean): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTls_alpn(value: Boolean): Self = StObject.set(x, "tls_alpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTls_ocsp(value: Boolean): Self = StObject.set(x, "tls_ocsp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTls_sni(value: Boolean): Self = StObject.set(x, "tls_sni", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUv(value: Boolean): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
  }
}
