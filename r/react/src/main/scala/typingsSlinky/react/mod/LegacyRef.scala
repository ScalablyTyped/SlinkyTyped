package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.react.mod.Ref[T]
*/
trait LegacyRef[T] extends js.Object

object LegacyRef {
  @scala.inline
  implicit def apply[T](value: Ref[T]): LegacyRef[T] = value.asInstanceOf[LegacyRef[T]]
  @scala.inline
  implicit def apply[T](value: String): LegacyRef[T] = value.asInstanceOf[LegacyRef[T]]
}

