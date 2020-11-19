package typingsSlinky.cassandraDriver.mod.types

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "types.LocalTime")
@js.native
class LocalTime protected ()
  extends typingsSlinky.cassandraDriver.typesMod.types.LocalTime {
  def this(totalNanoseconds: typingsSlinky.cassandraDriver.typesMod.types.Long) = this()
}
/* static members */
@JSImport("cassandra-driver", "types.LocalTime")
@js.native
object LocalTime extends js.Object {
  
  def fromBuffer(value: Buffer): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
  
  def fromDate(date: js.Date, nanoseconds: Double): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
  
  def fromMilliseconds(milliseconds: Double): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
  def fromMilliseconds(milliseconds: Double, nanoseconds: Double): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
  
  def fromString(value: String): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
  
  def now(): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
  def now(nanoseconds: Double): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
}
