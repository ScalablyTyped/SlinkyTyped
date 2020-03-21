package typingsSlinky.anydbSql.mod

import typingsSlinky.anydbSql.AnonRowCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConnection extends js.Object {
  def queryAsync[T](query: String, params: js.Any*): typingsSlinky.bluebird.mod.^[AnonRowCount[T]] = js.native
  def queryAsync[T](query: QueryLike): typingsSlinky.bluebird.mod.^[AnonRowCount[T]] = js.native
}

