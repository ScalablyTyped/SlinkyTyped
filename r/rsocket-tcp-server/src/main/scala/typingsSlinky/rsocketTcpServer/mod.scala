package typingsSlinky.rsocketTcpServer

import typingsSlinky.rsocketCore.rsocketencodingMod.Encoders
import typingsSlinky.rsocketTcpServer.rsockettcpserverMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-tcp-server", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default protected ()
    extends typingsSlinky.rsocketTcpServer.rsockettcpserverMod.default {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[_]) = this()
  }
}
