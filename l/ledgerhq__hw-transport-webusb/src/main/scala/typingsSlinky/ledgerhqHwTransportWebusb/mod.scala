package typingsSlinky.ledgerhqHwTransportWebusb

import typingsSlinky.ledgerhqHwTransport.mod.DescriptorEvent
import typingsSlinky.ledgerhqHwTransport.mod.Observer
import typingsSlinky.ledgerhqHwTransport.mod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ledgerhq/hw-transport-webusb", JSImport.Default)
  @js.native
  class default protected ()
    extends typingsSlinky.ledgerhqHwTransport.mod.default[String] {
    def this(device: String) = this()
  }
  object default {
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport-webusb", "default.listen")
    @js.native
    def listen(observer: Observer[DescriptorEvent[String]]): Subscription = js.native
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport-webusb", "default.open")
    @js.native
    def open(device: String): js.Promise[TransportWebUSB] = js.native
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport-webusb", "default.openConnection")
    @js.native
    def openConnection(): js.Promise[TransportWebUSB] = js.native
    
    /* static member */
    @JSImport("@ledgerhq/hw-transport-webusb", "default.request")
    @js.native
    def request(): js.Promise[TransportWebUSB] = js.native
  }
  
  type TransportWebUSB = typingsSlinky.ledgerhqHwTransport.mod.default[String]
}
