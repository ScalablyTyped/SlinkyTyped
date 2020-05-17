package typingsSlinky.jsonquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonquery.mod.OrQueryCondition[T]
  - typingsSlinky.jsonquery.mod.AndQueryCondition[T]
*/
trait BinaryQueryCondition[T] extends Query[T]

object BinaryQueryCondition {
  @scala.inline
  implicit def apply[T](value: AndQueryCondition[T]): BinaryQueryCondition[T] = value.asInstanceOf[BinaryQueryCondition[T]]
  @scala.inline
  implicit def apply[T](value: OrQueryCondition[T]): BinaryQueryCondition[T] = value.asInstanceOf[BinaryQueryCondition[T]]
}

