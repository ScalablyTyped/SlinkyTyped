package typingsSlinky.samchonDashFramework.samchonDashFrameworkMod.protocol

import typingsSlinky.samchon.protocolServerIServerMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "protocol.WebServerBase")
@js.native
class WebServerBase protected ()
  extends typingsSlinky.samchon.samchonMod.protocol.WebServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: IServer) = this()
}

