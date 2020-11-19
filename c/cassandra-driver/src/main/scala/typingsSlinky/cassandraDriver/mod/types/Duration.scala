package typingsSlinky.cassandraDriver.mod.types

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "types.Duration")
@js.native
class Duration protected ()
  extends typingsSlinky.cassandraDriver.typesMod.types.Duration {
  def this(month: Double, days: Double, nanoseconds: Double) = this()
  def this(month: Double, days: Double, nanoseconds: typingsSlinky.cassandraDriver.typesMod.types.Long) = this()
}
/* static members */
@JSImport("cassandra-driver", "types.Duration")
@js.native
object Duration extends js.Object {
  
  def fromBuffer(buffer: Buffer): typingsSlinky.cassandraDriver.typesMod.types.Duration = js.native
  
  def fromString(input: String): typingsSlinky.cassandraDriver.typesMod.types.Duration = js.native
}
