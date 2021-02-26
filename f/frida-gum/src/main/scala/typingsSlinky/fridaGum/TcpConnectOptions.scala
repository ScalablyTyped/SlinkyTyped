package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.fridaGumStrings.ipv4
import typingsSlinky.fridaGum.fridaGumStrings.ipv6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TcpConnectOptions extends SocketConnectOptions {
  
  /**
    * Address family. Omit to determine based on the host specified.
    */
  var family: js.UndefOr[ipv4 | ipv6] = js.native
  
  /**
    * Host or IP address to connect to. Defaults to `localhost`.
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * IP port to connect to.
    */
  var port: Double = js.native
  
  /**
    * Whether to create a TLS connection. Defaults to `false`.
    */
  var tls: js.UndefOr[Boolean] = js.native
}
object TcpConnectOptions {
  
  @scala.inline
  def apply(port: Double): TcpConnectOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpConnectOptions]
  }
  
  @scala.inline
  implicit class TcpConnectOptionsMutableBuilder[Self <: TcpConnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: ipv4 | ipv6): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
