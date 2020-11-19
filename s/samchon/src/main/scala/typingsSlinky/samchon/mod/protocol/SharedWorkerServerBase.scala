package typingsSlinky.samchon.mod.protocol

import typingsSlinky.samchon.iserverMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon", "protocol.SharedWorkerServerBase")
@js.native
class SharedWorkerServerBase protected ()
  extends typingsSlinky.samchon.protocolMod.SharedWorkerServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: IServer) = this()
}
