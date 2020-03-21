package typingsSlinky.samchon

import typingsSlinky.samchon.dedicatedWorkerCommunicatorMod.DedicatedWorkerCommunicator
import typingsSlinky.samchon.iprotocolMod.IProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/communicator/client_driver/DedicatedWorkerClientDriver", JSImport.Namespace)
@js.native
object dedicatedWorkerClientDriverMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsSlinky.samchon.iprotocolMod.IProtocol because Already inherited
  - typingsSlinky.samchon.icommunicatorMod.ICommunicator because Already inherited
  - typingsSlinky.samchon.iclientdriverMod.IClientDriver because var conflicts: onClose. Inlined listen */ @js.native
  /**
    * Default Constructor.
    */
  class DedicatedWorkerClientDriver () extends DedicatedWorkerCommunicator {
    /**
      * @inheritdoc
      */
    /**
      * Listen message from the newly connected client.
      *
      * Starts listening message from the newly connected client. Replied message from the connected client will be
      * converted to {@link Invoke} classes and shifted to the *listener*'s {@link IProtocol.replyData replyData()}
      * method.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def listen(listener: IProtocol): Unit = js.native
  }
  
}

