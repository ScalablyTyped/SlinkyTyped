package typingsSlinky.samchon.protocolMod

import typingsSlinky.samchon.iprotocolMod.IProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol", "SharedWorkerServerConnector")
@js.native
class SharedWorkerServerConnector protected ()
  extends typingsSlinky.samchon.sharedWorkerServerConnectorMod.SharedWorkerServerConnector {
  /**
    * Construct from *listener*.
    *
    * @param listener A listener object to listen replied message from newly connected client in
    *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
    */
  def this(listener: IProtocol) = this()
}
