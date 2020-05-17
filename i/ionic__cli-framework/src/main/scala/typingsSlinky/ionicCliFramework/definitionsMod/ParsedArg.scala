package typingsSlinky.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Boolean
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - js.Array[java.lang.String]
*/
trait ParsedArg extends js.Object

object ParsedArg {
  @scala.inline
  implicit def apply(value: js.Array[String]): ParsedArg = value.asInstanceOf[ParsedArg]
  @scala.inline
  implicit def apply(value: Boolean): ParsedArg = value.asInstanceOf[ParsedArg]
  @scala.inline
  implicit def apply(value: Null): ParsedArg = value.asInstanceOf[ParsedArg]
  @scala.inline
  implicit def apply(value: String): ParsedArg = value.asInstanceOf[ParsedArg]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ParsedArg): ParsedArg = value.asInstanceOf[ParsedArg]
}

