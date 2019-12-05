package typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.types

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Duration")
@js.native
class Duration protected ()
  extends typingsSlinky.cassandraDashDriver.libTypesMod.types.Duration {
  def this(month: Double, days: Double, nanoseconds: Double) = this()
  def this(month: Double, days: Double, nanoseconds: typingsSlinky.cassandraDashDriver.libTypesMod.types.Long) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.Duration")
@js.native
object Duration extends js.Object {
  def fromBuffer(buffer: Buffer): typingsSlinky.cassandraDashDriver.libTypesMod.types.Duration = js.native
  def fromString(input: String): typingsSlinky.cassandraDashDriver.libTypesMod.types.Duration = js.native
}

