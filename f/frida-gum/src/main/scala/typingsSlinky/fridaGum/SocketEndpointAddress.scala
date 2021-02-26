package typingsSlinky.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.TcpEndpointAddress
  - typingsSlinky.fridaGum.UnixEndpointAddress
*/
trait SocketEndpointAddress extends StObject
object SocketEndpointAddress {
  
  @scala.inline
  def TcpEndpointAddress(ip: String, port: Double): typingsSlinky.fridaGum.TcpEndpointAddress = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.TcpEndpointAddress]
  }
  
  @scala.inline
  def UnixEndpointAddress(path: String): typingsSlinky.fridaGum.UnixEndpointAddress = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.UnixEndpointAddress]
  }
}
