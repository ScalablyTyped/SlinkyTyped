package typingsSlinky.samchonDashFramework.samchonDashFrameworkMod.protocol

import typingsSlinky.samchon.protocolInvokeIProtocolMod.IProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "protocol.WebServerConnector")
@js.native
class WebServerConnector protected ()
  extends typingsSlinky.samchon.samchonMod.protocol.WebServerConnector {
  /**
    * Construct from *listener*.
    *
    * @param listener A listener object to listen replied message from newly connected client in
    *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
    */
  def this(listener: IProtocol) = this()
}

