package typingsSlinky.rsocketCore.rsocketresumabletransportMod

import typingsSlinky.rsocketCore.rsocketencodingMod.Encoders
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketResumableTransport", JSImport.Default)
@js.native
class default protected () extends RSocketResumableTransport {
  def this(source: js.Function0[DuplexConnection], options: Options) = this()
  def this(source: js.Function0[DuplexConnection], options: Options, encoders: Encoders[_]) = this()
}

