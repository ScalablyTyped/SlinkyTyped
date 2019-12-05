package typingsSlinky.objection.objectionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.knex.knexMod.AliasDict
import typingsSlinky.knex.knexMod.TableDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryContext
  extends /* key */ StringDictionary[js.Any] {
  @JSName("transaction")
  var transaction_Original: Transaction = js.native
  def transaction[TRecord2, TResult2](): typingsSlinky.knex.knexMod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: AliasDict): typingsSlinky.knex.knexMod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: TableDescriptor): typingsSlinky.knex.knexMod.QueryBuilder[TRecord2, TResult2] = js.native
}

