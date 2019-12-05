package typingsSlinky.samchonDashFramework.samchonDashFrameworkMod.protocol

import typingsSlinky.samchon.protocolServerIServerMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "protocol.ServerBase")
@js.native
class ServerBase protected ()
  extends typingsSlinky.samchon.samchonMod.protocol.ServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: IServer) = this()
}

