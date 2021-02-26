package typingsSlinky.guacamoleClient

import typingsSlinky.guacamoleClient.clientMod.Client
import typingsSlinky.guacamoleClient.statusMod.Status.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputStreamMod {
  
  @JSImport("guacamole-client/lib/InputStream", "InputStream")
  @js.native
  class InputStream protected () extends StObject {
    /**
      * @param client The client owning this stream.
      * @param index The index of this stream.
      */
    def this(client: Client, index: Double) = this()
    
    /**
      * The index of this stream.
      */
    val index: Double = js.native
    
    /**
      * Called when a blob of data is received.
      * @event
      * @param data The received base64 data.
      */
    var onblob: Null | (js.Function1[/* data64 */ String, Unit]) = js.native
    
    /**
      * Called when this stream is closed.
      * @event
      */
    var onend: Null | js.Function0[Unit] = js.native
    
    /**
      * Acknowledges the receipt of a blob.
      * @param message A human-readable message describing the error or status.
      * @param code The error code, if any, or 0 for success.
      */
    def sendAck(message: String, code: Code): Unit = js.native
  }
}
