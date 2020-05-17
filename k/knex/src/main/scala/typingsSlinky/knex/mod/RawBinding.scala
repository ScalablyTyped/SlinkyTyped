package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.knex.mod.Value
  - typingsSlinky.knex.mod.QueryBuilder[js.Any, js.Any]
*/
trait RawBinding extends js.Object

object RawBinding {
  @scala.inline
  implicit def apply(value: QueryBuilder[js.Any, js.Any]): RawBinding = value.asInstanceOf[RawBinding]
  @scala.inline
  implicit def apply(value: Value): RawBinding = value.asInstanceOf[RawBinding]
}

