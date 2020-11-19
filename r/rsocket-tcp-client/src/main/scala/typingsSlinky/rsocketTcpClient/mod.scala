package typingsSlinky.rsocketTcpClient

import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.netMod.TcpSocketConnectOpts
import typingsSlinky.rsocketCore.rsocketencodingMod.Encoders
import typingsSlinky.rsocketTcpClient.rsockettcpclientMod.RSocketTcpClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-tcp-client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class RSocketTcpConnection ()
    extends typingsSlinky.rsocketTcpClient.rsockettcpclientMod.RSocketTcpConnection {
    def this(socket: Socket) = this()
    def this(socket: js.UndefOr[scala.Nothing], encoders: Encoders[_]) = this()
    def this(socket: Socket, encoders: Encoders[_]) = this()
  }
  
  @js.native
  class default protected () extends RSocketTcpClient {
    def this(options: TcpSocketConnectOpts) = this()
    def this(options: TcpSocketConnectOpts, encoders: Encoders[_]) = this()
  }
}
