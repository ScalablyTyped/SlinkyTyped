package typingsSlinky.jsforce.mod

import typingsSlinky.jsforce.salesforceIdMod.SalesforceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce", "RecordReference")
@js.native
class RecordReference[T] protected ()
  extends typingsSlinky.jsforce.recordMod.RecordReference[T] {
  def this(conn: typingsSlinky.jsforce.connectionMod.Connection, `type`: String, id: SalesforceId) = this()
}

