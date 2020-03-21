package typingsSlinky.cassandraDriver.mod.types

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.InetAddress")
@js.native
class InetAddress protected ()
  extends typingsSlinky.cassandraDriver.typesMod.types.InetAddress {
  def this(buffer: Buffer) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.InetAddress")
@js.native
object InetAddress extends js.Object {
  def fromString(value: String): typingsSlinky.cassandraDriver.typesMod.types.InetAddress = js.native
}

