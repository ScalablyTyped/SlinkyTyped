package typingsSlinky.grommet.utilsMod

import typingsSlinky.grommet.anon.Light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.grommet.anon.Light
  - js.UndefOr[scala.Nothing]
*/
trait ColorType extends js.Object

object ColorType {
  @scala.inline
  implicit def apply(value: Light): ColorType = value.asInstanceOf[ColorType]
  @scala.inline
  implicit def apply(value: String): ColorType = value.asInstanceOf[ColorType]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ColorType): ColorType = value.asInstanceOf[ColorType]
}

