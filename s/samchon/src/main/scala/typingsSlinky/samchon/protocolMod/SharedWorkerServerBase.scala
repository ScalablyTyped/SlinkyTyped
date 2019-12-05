package typingsSlinky.samchon.protocolMod

import typingsSlinky.samchon.protocolServerIServerMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "SharedWorkerServerBase")
@js.native
class SharedWorkerServerBase protected ()
  extends typingsSlinky.samchon.protocolServerBaseSharedWorkerServerBaseMod.SharedWorkerServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: IServer) = this()
}

