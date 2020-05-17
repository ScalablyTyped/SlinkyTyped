package typingsSlinky.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - scala.Boolean
  - java.lang.String
  - scala.Double
*/
trait NoLiteralType[T] extends js.Object

object NoLiteralType {
  @scala.inline
  implicit def apply[T](value: Boolean): NoLiteralType[T] = value.asInstanceOf[NoLiteralType[T]]
  @scala.inline
  implicit def apply[T](value: Double): NoLiteralType[T] = value.asInstanceOf[NoLiteralType[T]]
  @scala.inline
  implicit def apply[T](value: String): NoLiteralType[T] = value.asInstanceOf[NoLiteralType[T]]
  @scala.inline
  implicit def apply[T](value: T): NoLiteralType[T] = value.asInstanceOf[NoLiteralType[T]]
}

