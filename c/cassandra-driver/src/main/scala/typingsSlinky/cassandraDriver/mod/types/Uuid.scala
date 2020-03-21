package typingsSlinky.cassandraDriver.mod.types

import typingsSlinky.cassandraDriver.mod.ValueCallback
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Uuid")
@js.native
class Uuid protected ()
  extends typingsSlinky.cassandraDriver.typesMod.types.Uuid {
  def this(buffer: Buffer) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.Uuid")
@js.native
object Uuid extends js.Object {
  def fromString(value: String): typingsSlinky.cassandraDriver.typesMod.types.Uuid = js.native
  def random(): typingsSlinky.cassandraDriver.typesMod.types.Uuid = js.native
  def random(callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.Uuid]): Unit = js.native
}

