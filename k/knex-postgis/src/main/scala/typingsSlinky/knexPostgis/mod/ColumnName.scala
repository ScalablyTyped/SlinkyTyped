package typingsSlinky.knexPostgis.mod

import typingsSlinky.knex.mod.QueryBuilder
import typingsSlinky.knex.mod.Raw
import typingsSlinky.knex.mod.SafePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Same as in Knex but not exported
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.knex.mod.Raw[js.Any]
  - typingsSlinky.knex.mod.QueryBuilder[js.Any, js.Array[typingsSlinky.knex.mod.SafePartial[js.Any]]]
*/
trait ColumnName extends js.Object

object ColumnName {
  @scala.inline
  implicit def apply(value: QueryBuilder[js.Any, js.Array[SafePartial[js.Any]]]): ColumnName = value.asInstanceOf[ColumnName]
  @scala.inline
  implicit def apply(value: Raw[js.Any]): ColumnName = value.asInstanceOf[ColumnName]
  @scala.inline
  implicit def apply(value: String): ColumnName = value.asInstanceOf[ColumnName]
}

