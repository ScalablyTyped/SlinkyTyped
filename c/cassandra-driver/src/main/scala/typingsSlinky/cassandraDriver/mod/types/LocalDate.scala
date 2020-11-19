package typingsSlinky.cassandraDriver.mod.types

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "types.LocalDate")
@js.native
class LocalDate protected ()
  extends typingsSlinky.cassandraDriver.typesMod.types.LocalDate {
  def this(year: Double, month: Double, day: Double) = this()
}
/* static members */
@JSImport("cassandra-driver", "types.LocalDate")
@js.native
object LocalDate extends js.Object {
  
  def fromBuffer(buffer: Buffer): typingsSlinky.cassandraDriver.typesMod.types.LocalDate = js.native
  
  def fromDate(date: js.Date): typingsSlinky.cassandraDriver.typesMod.types.LocalDate = js.native
  
  def fromString(value: String): typingsSlinky.cassandraDriver.typesMod.types.LocalDate = js.native
  
  def now(): typingsSlinky.cassandraDriver.typesMod.types.LocalDate = js.native
  
  def utcNow(): typingsSlinky.cassandraDriver.typesMod.types.LocalDate = js.native
}
