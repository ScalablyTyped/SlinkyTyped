package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.fridaGumStrings.unix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.TcpConnectOptions
  - typingsSlinky.fridaGum.UnixConnectOptions
*/
trait SocketConnectOptions extends StObject
object SocketConnectOptions {
  
  @scala.inline
  def TcpConnectOptions(port: Double): typingsSlinky.fridaGum.TcpConnectOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.TcpConnectOptions]
  }
  
  @scala.inline
  def UnixConnectOptions(family: unix, path: String): typingsSlinky.fridaGum.UnixConnectOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.UnixConnectOptions]
  }
}
