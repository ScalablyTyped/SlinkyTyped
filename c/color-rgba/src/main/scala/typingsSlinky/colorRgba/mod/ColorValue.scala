package typingsSlinky.colorRgba.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.colorRgba.mod.RGBTuple
  - typingsSlinky.colorRgba.mod.RGBColor
  - typingsSlinky.colorRgba.mod.RGBKeyedColor
  - typingsSlinky.colorRgba.mod.HSL
*/
trait ColorValue extends js.Object

object ColorValue {
  @scala.inline
  implicit def apply(value: HSL): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: RGBColor): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: RGBKeyedColor): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: RGBTuple): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: String): ColorValue = value.asInstanceOf[ColorValue]
}

