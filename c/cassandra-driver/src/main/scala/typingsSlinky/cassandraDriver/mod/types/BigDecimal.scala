package typingsSlinky.cassandraDriver.mod.types

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.BigDecimal")
@js.native
class BigDecimal protected ()
  extends typingsSlinky.cassandraDriver.typesMod.types.BigDecimal {
  def this(unscaledValue: Double, scale: Double) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.BigDecimal")
@js.native
object BigDecimal extends js.Object {
  def fromBuffer(buf: Buffer): typingsSlinky.cassandraDriver.typesMod.types.BigDecimal = js.native
  def fromNumber(value: Double): typingsSlinky.cassandraDriver.typesMod.types.BigDecimal = js.native
  def fromString(value: String): typingsSlinky.cassandraDriver.typesMod.types.BigDecimal = js.native
  def toBuffer(value: typingsSlinky.cassandraDriver.typesMod.types.BigDecimal): Buffer = js.native
}

