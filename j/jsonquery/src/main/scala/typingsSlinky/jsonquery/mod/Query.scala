package typingsSlinky.jsonquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonquery.mod.BinaryQueryCondition[T]
  - typingsSlinky.jsonquery.mod.QueryValue[T]
  - typingsSlinky.jsonquery.mod.PathQuery
*/
trait Query[T] extends js.Object

object Query {
  @scala.inline
  implicit def apply[T](value: BinaryQueryCondition[T]): Query[T] = value.asInstanceOf[Query[T]]
  @scala.inline
  implicit def apply[T](value: PathQuery): Query[T] = value.asInstanceOf[Query[T]]
  @scala.inline
  implicit def apply[T](value: QueryValue[T]): Query[T] = value.asInstanceOf[Query[T]]
}

