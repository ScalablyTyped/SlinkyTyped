package typingsSlinky.rsocketDashTcpDashClient

import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.netMod.TcpSocketConnectOpts
import typingsSlinky.rsocketDashCore.rSocketEncodingMod.Encoders
import typingsSlinky.rsocketDashTcpDashClient.rSocketTcpClientMod.RSocketTcpClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-tcp-client", JSImport.Namespace)
@js.native
object rsocketDashTcpDashClientMod extends js.Object {
  @js.native
  class RSocketTcpConnection ()
    extends typingsSlinky.rsocketDashTcpDashClient.rSocketTcpClientMod.RSocketTcpConnection {
    def this(socket: Socket) = this()
    def this(socket: Socket, encoders: Encoders[_]) = this()
  }
  
  @js.native
  class default protected () extends RSocketTcpClient {
    def this(options: TcpSocketConnectOpts) = this()
    def this(options: TcpSocketConnectOpts, encoders: Encoders[_]) = this()
  }
  
}

