package typingsSlinky.samchon.protocolMod

import org.scalajs.dom.raw.MessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol", "SharedWorkerClientDriver")
@js.native
class SharedWorkerClientDriver protected ()
  extends typingsSlinky.samchon.sharedWorkerClientDriverMod.SharedWorkerClientDriver {
  /**
    * Construct from a MessagePort object.
    */
  def this(port: MessagePort) = this()
}
