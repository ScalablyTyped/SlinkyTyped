package typingsSlinky.meteor.Mongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.meteor.Mongo.Query[T]
  - typingsSlinky.meteor.Mongo.QueryWithModifiers[T]
*/
trait Selector[T] extends js.Object

object Selector {
  @scala.inline
  implicit def apply[T](value: Query[T]): Selector[T] = value.asInstanceOf[Selector[T]]
  @scala.inline
  implicit def apply[T](value: QueryWithModifiers[T]): Selector[T] = value.asInstanceOf[Selector[T]]
}

