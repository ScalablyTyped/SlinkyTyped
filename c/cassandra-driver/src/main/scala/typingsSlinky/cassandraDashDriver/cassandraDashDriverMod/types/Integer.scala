package typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.types

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Integer")
@js.native
class Integer protected ()
  extends typingsSlinky.cassandraDashDriver.libTypesMod.types.Integer {
  def this(bits: js.Array[Double], sign: Double) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.Integer")
@js.native
object Integer extends js.Object {
  var ONE: typingsSlinky.cassandraDashDriver.libTypesMod.types.Integer = js.native
  var ZERO: typingsSlinky.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def fromBits(bits: js.Array[Double]): typingsSlinky.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def fromBuffer(bits: Buffer): typingsSlinky.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def fromInt(value: Double): typingsSlinky.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def fromNumber(value: Double): typingsSlinky.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def fromString(str: String): typingsSlinky.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def fromString(str: String, opt_radix: Double): typingsSlinky.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def toBuffer(value: typingsSlinky.cassandraDashDriver.libTypesMod.types.Integer): Buffer = js.native
}

