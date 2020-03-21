package typingsSlinky.samchon

import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.MessagePort
import typingsSlinky.samchon.communicatorBaseMod.CommunicatorBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/communicator/communicator/SharedWorkerCommunicator", JSImport.Namespace)
@js.native
object sharedWorkerCommunicatorMod extends js.Object {
  @js.native
  abstract class SharedWorkerCommunicator () extends CommunicatorBase {
    /**
      * @hidden
      */
    var port_ : MessagePort = js.native
    /**
      * @hidden
      */
    /* protected */ def _Handle_message(event: MessageEvent): Unit = js.native
  }
  
}

