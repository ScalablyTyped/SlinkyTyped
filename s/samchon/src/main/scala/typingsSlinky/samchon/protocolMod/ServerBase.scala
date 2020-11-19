package typingsSlinky.samchon.protocolMod

import typingsSlinky.samchon.iserverMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol", "ServerBase")
@js.native
class ServerBase protected ()
  extends typingsSlinky.samchon.serverBaseMod.ServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: IServer) = this()
}
