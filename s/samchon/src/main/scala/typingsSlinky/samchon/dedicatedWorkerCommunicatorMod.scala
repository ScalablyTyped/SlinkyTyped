package typingsSlinky.samchon

import org.scalajs.dom.raw.MessageEvent
import typingsSlinky.samchon.communicatorBaseMod.CommunicatorBase
import typingsSlinky.samchon.iprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dedicatedWorkerCommunicatorMod {
  
  @JSImport("samchon/protocol/communicator/communicator/DedicatedWorkerCommunicator", "DedicatedWorkerCommunicator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DedicatedWorkerCommunicator () extends CommunicatorBase {
    /**
      * Construct from *listener*.
      *
      * @param listener An {@link IProtocol} object to listen {@link Invoke} messages.
      */
    def this(listener: IProtocol) = this()
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_message(event: MessageEvent): Unit = js.native
  }
}
