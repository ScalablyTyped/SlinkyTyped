package typingsSlinky.anydbSql.mod

import typingsSlinky.anydbSql.anon.RowCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConnection extends js.Object {
  def queryAsync[T](query: String, params: js.Any*): typingsSlinky.bluebird.mod.^[RowCount[T]] = js.native
  def queryAsync[T](query: QueryLike): typingsSlinky.bluebird.mod.^[RowCount[T]] = js.native
}

