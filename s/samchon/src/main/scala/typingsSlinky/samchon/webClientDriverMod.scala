package typingsSlinky.samchon

import typingsSlinky.samchon.iprotocolMod.IProtocol
import typingsSlinky.samchon.webCommunicatorMod.WebCommunicator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webClientDriverMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.samchon.iprotocolMod.IProtocol because Already inherited
  - typingsSlinky.samchon.icommunicatorMod.ICommunicator because Already inherited
  - typingsSlinky.samchon.iclientdriverMod.IClientDriver because var conflicts: onClose. Inlined listen */ @JSImport("samchon/protocol/communicator/client_driver/WebClientDriver", "WebClientDriver")
  @js.native
  class WebClientDriver protected () extends WebCommunicator {
    /**
      * Initialization Constructor.
      *
      * @param connection Connection driver, a socket for web-socket.
      * @param path Requested path.
      * @param session_id Session ID, an identifier of the remote client.
      */
    def this(connection: js.Any, path: String, session_id: String) = this()
    
    /**
      * Get requested path.
      */
    def getPath(): String = js.native
    
    /**
      * Get session ID, an identifier of the remote client.
      */
    def getSessionID(): String = js.native
    
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
    
    /**
      * @hidden
      */
    var listening_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var path_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var session_id_ : js.Any = js.native
  }
}
