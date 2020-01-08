package typingsSlinky.atLedgerhqHwDashTransportDashWebusb

import typingsSlinky.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.DescriptorEvent
import typingsSlinky.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.Observer
import typingsSlinky.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ledgerhq/hw-transport-webusb", JSImport.Namespace)
@js.native
object atLedgerhqHwDashTransportDashWebusbMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.default[String] {
    def this(device: String) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def listen(observer: Observer[DescriptorEvent[String]]): Subscription = js.native
    def open(device: String): js.Promise[TransportWebUSB] = js.native
    def openConnection(): js.Promise[TransportWebUSB] = js.native
    def request(): js.Promise[TransportWebUSB] = js.native
  }
  
  type TransportWebUSB = typingsSlinky.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.default[String]
}

