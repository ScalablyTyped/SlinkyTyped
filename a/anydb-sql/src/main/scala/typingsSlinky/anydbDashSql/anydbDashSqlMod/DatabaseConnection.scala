package typingsSlinky.anydbDashSql.anydbDashSqlMod

import typingsSlinky.anydbDashSql.Anon_RowCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConnection extends js.Object {
  def queryAsync[T](query: String, params: js.Any*): typingsSlinky.bluebird.bluebirdMod.^[Anon_RowCount[T]] = js.native
  def queryAsync[T](query: QueryLike): typingsSlinky.bluebird.bluebirdMod.^[Anon_RowCount[T]] = js.native
}

