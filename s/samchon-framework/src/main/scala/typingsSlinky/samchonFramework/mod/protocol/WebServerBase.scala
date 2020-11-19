package typingsSlinky.samchonFramework.mod.protocol

import typingsSlinky.samchon.iserverMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon-framework", "protocol.WebServerBase")
@js.native
class WebServerBase protected ()
  extends typingsSlinky.samchon.mod.protocol.WebServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: IServer) = this()
}
