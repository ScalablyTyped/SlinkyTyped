package typingsSlinky.rsocketTcpServer.rsockettcpserverMod

import typingsSlinky.rsocketCore.rsocketserverMod.TransportServer
import typingsSlinky.rsocketFlowable.mod.Flowable
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RSocketTCPServer extends TransportServer
object RSocketTCPServer {
  
  @scala.inline
  def apply(start: () => Flowable[DuplexConnection], stop: () => Unit): RSocketTCPServer = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[RSocketTCPServer]
  }
}
