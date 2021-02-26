package typingsSlinky.samchon

import typingsSlinky.samchon.communicatorBaseMod.CommunicatorBase
import typingsSlinky.samchon.iprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webCommunicatorMod {
  
  @JSImport("samchon/protocol/communicator/communicator/WebCommunicator", "WebCommunicator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class WebCommunicator () extends CommunicatorBase {
    /**
      * Construct from *listener*.
      *
      * @param listener An {@link IProtocol} object to listen {@link Invoke} messages.
      */
    def this(listener: IProtocol) = this()
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_close(): Unit = js.native
    
    /**
      * @hidden
      */
    var _Handle_message: js.Any = js.native
    
    /**
      * @hidden
      */
    var connection_ : js.Any = js.native
  }
}
