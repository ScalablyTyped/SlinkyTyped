package typingsSlinky.atLedgerhqHwDashTransportDashU2f

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ledgerhq/hw-transport-u2f", JSImport.Namespace)
@js.native
object atLedgerhqHwDashTransportDashU2fMod extends js.Object {
  @js.native
  class default ()
    extends typingsSlinky.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.default[String]
  
  /* static members */
  @js.native
  object default extends js.Object {
    def open(_underscore: js.Any): js.Promise[TransportU2F] = js.native
    def open(_underscore: js.Any, _openTimeout: Double): js.Promise[TransportU2F] = js.native
  }
  
  type TransportU2F = typingsSlinky.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod.default[String]
}

