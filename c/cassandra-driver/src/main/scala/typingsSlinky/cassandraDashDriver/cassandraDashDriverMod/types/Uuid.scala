package typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.types

import typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.ValueCallback
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Uuid")
@js.native
class Uuid protected ()
  extends typingsSlinky.cassandraDashDriver.libTypesMod.types.Uuid {
  def this(buffer: Buffer) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.Uuid")
@js.native
object Uuid extends js.Object {
  def fromString(value: String): typingsSlinky.cassandraDashDriver.libTypesMod.types.Uuid = js.native
  def random(): typingsSlinky.cassandraDashDriver.libTypesMod.types.Uuid = js.native
  def random(callback: ValueCallback[typingsSlinky.cassandraDashDriver.libTypesMod.types.Uuid]): Unit = js.native
}

