package typingsSlinky.objection.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.knex.mod.AliasDict
import typingsSlinky.knex.mod.TableDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryContext
  extends /* key */ StringDictionary[js.Any] {
  @JSName("transaction")
  var transaction_Original: Transaction_ = js.native
  def transaction[TRecord2, TResult2](): typingsSlinky.knex.mod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: AliasDict): typingsSlinky.knex.mod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: TableDescriptor): typingsSlinky.knex.mod.QueryBuilder[TRecord2, TResult2] = js.native
}

