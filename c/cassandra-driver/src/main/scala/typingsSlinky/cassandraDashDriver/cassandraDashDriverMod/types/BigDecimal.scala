package typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.types

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.BigDecimal")
@js.native
class BigDecimal protected ()
  extends typingsSlinky.cassandraDashDriver.libTypesMod.types.BigDecimal {
  def this(unscaledValue: Double, scale: Double) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.BigDecimal")
@js.native
object BigDecimal extends js.Object {
  def fromBuffer(buf: Buffer): typingsSlinky.cassandraDashDriver.libTypesMod.types.BigDecimal = js.native
  def fromNumber(value: Double): typingsSlinky.cassandraDashDriver.libTypesMod.types.BigDecimal = js.native
  def fromString(value: String): typingsSlinky.cassandraDashDriver.libTypesMod.types.BigDecimal = js.native
  def toBuffer(value: typingsSlinky.cassandraDashDriver.libTypesMod.types.BigDecimal): Buffer = js.native
}

