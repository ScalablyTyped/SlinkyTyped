package typingsSlinky.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Listener created by `Socket.listen()`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.TcpListener
  - typingsSlinky.fridaGum.UnixListener
*/
trait SocketListener extends StObject
object SocketListener {
  
  @scala.inline
  def TcpListener(accept: () => js.Promise[SocketConnection], close: () => js.Promise[Unit], port: Double): typingsSlinky.fridaGum.TcpListener = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), close = js.Any.fromFunction0(close), port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.TcpListener]
  }
  
  @scala.inline
  def UnixListener(accept: () => js.Promise[SocketConnection], close: () => js.Promise[Unit], path: String): typingsSlinky.fridaGum.UnixListener = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), close = js.Any.fromFunction0(close), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.UnixListener]
  }
}
