package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.knex.mod.Raw[js.Any]
  - typingsSlinky.knex.mod.QueryBuilder[js.Any, js.Array[typingsSlinky.knex.mod.SafePartial[js.Any]]]
*/
trait TableDescriptor extends js.Object

object TableDescriptor {
  @scala.inline
  implicit def apply(value: QueryBuilder[js.Any, js.Array[SafePartial[js.Any]]]): TableDescriptor = value.asInstanceOf[TableDescriptor]
  @scala.inline
  implicit def apply(value: Raw[js.Any]): TableDescriptor = value.asInstanceOf[TableDescriptor]
  @scala.inline
  implicit def apply(value: String): TableDescriptor = value.asInstanceOf[TableDescriptor]
}

