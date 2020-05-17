package typingsSlinky.meteor.Mongo

import typingsSlinky.meteor.anon.CurrentDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.meteor.anon.CurrentDate[T]
*/
trait Modifier[T] extends js.Object

object Modifier {
  @scala.inline
  implicit def apply[T](value: CurrentDate[T]): Modifier[T] = value.asInstanceOf[Modifier[T]]
  @scala.inline
  implicit def apply[T](value: T): Modifier[T] = value.asInstanceOf[Modifier[T]]
}

