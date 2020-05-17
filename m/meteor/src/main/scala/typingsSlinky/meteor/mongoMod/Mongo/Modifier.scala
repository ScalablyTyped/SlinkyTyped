package typingsSlinky.meteor.mongoMod.Mongo

import typingsSlinky.meteor.anon.AddToSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.meteor.anon.AddToSet[T]
*/
trait Modifier[T] extends js.Object

object Modifier {
  @scala.inline
  implicit def apply[T](value: AddToSet[T]): Modifier[T] = value.asInstanceOf[Modifier[T]]
  @scala.inline
  implicit def apply[T](value: T): Modifier[T] = value.asInstanceOf[Modifier[T]]
}

