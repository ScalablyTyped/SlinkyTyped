package typingsSlinky.knex.mod

import typingsSlinky.knex.AnonColumn
import typingsSlinky.knex.AnonOrder
import typingsSlinky.knex.knexStrings.asc
import typingsSlinky.knex.knexStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderBy[TRecord, TResult] extends js.Object {
  def apply(columnDefs: js.Array[AnonColumn[TRecord] | AnonOrder | (/* keyof TRecord */ String)]): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: /* keyof TRecord */ String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, order: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: /* keyof TRecord */ String, order: asc): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: /* keyof TRecord */ String, order: desc): QueryBuilder[TRecord, TResult] = js.native
}

