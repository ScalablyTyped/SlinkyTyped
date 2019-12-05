package typingsSlinky.rsocketDashTcpDashServer

import typingsSlinky.rsocketDashCore.rSocketEncodingMod.Encoders
import typingsSlinky.rsocketDashTcpDashServer.rSocketTCPServerMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-tcp-server", JSImport.Namespace)
@js.native
object rsocketDashTcpDashServerMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.rsocketDashTcpDashServer.rSocketTCPServerMod.default {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[_]) = this()
  }
  
}

