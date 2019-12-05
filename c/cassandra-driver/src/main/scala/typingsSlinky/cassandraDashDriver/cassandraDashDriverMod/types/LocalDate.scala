package typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.types

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.LocalDate")
@js.native
class LocalDate protected ()
  extends typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalDate {
  def this(year: Double, month: Double, day: Double) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.LocalDate")
@js.native
object LocalDate extends js.Object {
  def fromBuffer(buffer: Buffer): typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalDate = js.native
  def fromDate(date: js.Date): typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalDate = js.native
  def fromString(value: String): typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalDate = js.native
  def now(): typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalDate = js.native
  def utcNow(): typingsSlinky.cassandraDashDriver.libTypesMod.types.LocalDate = js.native
}

