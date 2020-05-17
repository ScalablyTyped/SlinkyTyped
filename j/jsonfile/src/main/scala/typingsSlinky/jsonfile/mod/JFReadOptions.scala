package typingsSlinky.jsonfile.mod

import typingsSlinky.jsonfile.anon.Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonfile.anon.Encoding
  - java.lang.String
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait JFReadOptions extends js.Object

object JFReadOptions {
  @scala.inline
  implicit def apply(value: Encoding): JFReadOptions = value.asInstanceOf[JFReadOptions]
  @scala.inline
  implicit def apply(value: Null): JFReadOptions = value.asInstanceOf[JFReadOptions]
  @scala.inline
  implicit def apply(value: String): JFReadOptions = value.asInstanceOf[JFReadOptions]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => JFReadOptions): JFReadOptions = value.asInstanceOf[JFReadOptions]
}

