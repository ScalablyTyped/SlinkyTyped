package typingsSlinky.knex.knexMod

import typingsSlinky.knex.Anon_Asc
import typingsSlinky.knex.Anon_Column
import typingsSlinky.knex.knexStrings.asc
import typingsSlinky.knex.knexStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderBy[TRecord, TResult] extends js.Object {
  def apply(columnDefs: js.Array[Anon_Asc[TRecord] | Anon_Column | String]): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, order: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, order: asc): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, order: desc): QueryBuilder[TRecord, TResult] = js.native
}

