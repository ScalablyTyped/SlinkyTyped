package typingsSlinky.properUrlJoin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - scala.Double
*/
trait PathArg extends js.Object

object PathArg {
  @scala.inline
  implicit def apply(value: Double): PathArg = value.asInstanceOf[PathArg]
  @scala.inline
  implicit def apply(value: Null): PathArg = value.asInstanceOf[PathArg]
  @scala.inline
  implicit def apply(value: String): PathArg = value.asInstanceOf[PathArg]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => PathArg): PathArg = value.asInstanceOf[PathArg]
}

