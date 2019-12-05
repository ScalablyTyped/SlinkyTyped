package typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.types

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.LocalTime")
@js.native
class LocalTime protected ()
  extends typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalTime {
  def this(totalNanoseconds: typingsSlinky.cassandraDashDriver.libTypesMod.types.Long) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.LocalTime")
@js.native
object LocalTime extends js.Object {
  def fromBuffer(value: Buffer): typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
  def fromDate(date: js.Date, nanoseconds: Double): typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
  def fromMilliseconds(milliseconds: Double): typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
  def fromMilliseconds(milliseconds: Double, nanoseconds: Double): typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
  def fromString(value: String): typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
  def now(): typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
  def now(nanoseconds: Double): typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalTime = js.native
}

