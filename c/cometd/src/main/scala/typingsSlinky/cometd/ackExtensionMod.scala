package typingsSlinky.cometd

import typingsSlinky.cometd.mod.CometD
import typingsSlinky.cometd.mod.Extension
import typingsSlinky.cometd.mod.Listener
import typingsSlinky.cometd.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ackExtensionMod {
  
  @JSImport("cometd/AckExtension", JSImport.Default)
  @js.native
  class default () extends AckExtension
  
  @js.native
  trait AckExtension extends Extension {
    
    @JSName("incoming")
    def incoming_MAckExtension(message: Message): Unit = js.native
    @JSName("incoming")
    var incoming_Original: Listener = js.native
    
    @JSName("outgoing")
    def outgoing_MAckExtension(message: Message): Unit = js.native
    @JSName("outgoing")
    var outgoing_Original: Listener = js.native
    
    @JSName("registered")
    def registered_MAckExtension(name: String, cometd: CometD): Unit = js.native
    
    @JSName("unregistered")
    def unregistered_MAckExtension(): Unit = js.native
  }
}
