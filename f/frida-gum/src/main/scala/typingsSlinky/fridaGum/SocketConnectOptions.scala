package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.fridaGumStrings.unix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.TcpConnectOptions
  - typingsSlinky.fridaGum.UnixConnectOptions
*/
trait SocketConnectOptions extends js.Object
object SocketConnectOptions {
  
  @scala.inline
  def TcpConnectOptions(port: Double): SocketConnectOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOptions]
  }
  
  @scala.inline
  def UnixConnectOptions(family: unix, path: String): SocketConnectOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOptions]
  }
}
