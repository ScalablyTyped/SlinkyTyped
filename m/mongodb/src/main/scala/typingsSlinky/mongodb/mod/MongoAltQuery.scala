package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mod.RegExpForString[js.Any | T]
  - T
*/
trait MongoAltQuery[T] extends Condition[T]

object MongoAltQuery {
  @scala.inline
  implicit def apply[T](value: RegExpForString[js.Any | T]): MongoAltQuery[T] = value.asInstanceOf[MongoAltQuery[T]]
  @scala.inline
  implicit def apply[T](value: T): MongoAltQuery[T] = value.asInstanceOf[MongoAltQuery[T]]
}

