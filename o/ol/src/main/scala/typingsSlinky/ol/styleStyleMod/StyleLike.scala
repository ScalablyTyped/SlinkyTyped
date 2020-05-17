package typingsSlinky.ol.styleStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ol.styleStyleMod.Style
  - js.Array[typingsSlinky.ol.styleStyleMod.Style]
  - typingsSlinky.ol.styleStyleMod.StyleFunction
*/
trait StyleLike extends js.Object

object StyleLike {
  @scala.inline
  implicit def apply(value: js.Array[Style]): StyleLike = value.asInstanceOf[StyleLike]
  @scala.inline
  implicit def apply(value: Style): StyleLike = value.asInstanceOf[StyleLike]
  @scala.inline
  implicit def apply(value: StyleFunction): StyleLike = value.asInstanceOf[StyleLike]
}

