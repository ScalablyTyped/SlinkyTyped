package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mod.MongoAltQuery[T]
  - typingsSlinky.mongodb.mod.QuerySelector[typingsSlinky.mongodb.mod.MongoAltQuery[T]]
*/
trait Condition[T] extends js.Object

object Condition {
  @scala.inline
  implicit def apply[T](value: MongoAltQuery[T]): Condition[T] = value.asInstanceOf[Condition[T]]
  @scala.inline
  implicit def apply[T](value: QuerySelector[MongoAltQuery[T]]): Condition[T] = value.asInstanceOf[Condition[T]]
}

