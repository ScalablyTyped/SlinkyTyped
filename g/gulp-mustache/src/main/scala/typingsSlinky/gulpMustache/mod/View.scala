package typingsSlinky.gulpMustache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gulpMustache.mod.Hash
  - java.lang.String
  - js.UndefOr[scala.Nothing]
*/
trait View extends js.Object

object View {
  @scala.inline
  implicit def apply(value: Hash): View = value.asInstanceOf[View]
  @scala.inline
  implicit def apply(value: String): View = value.asInstanceOf[View]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => View): View = value.asInstanceOf[View]
}

