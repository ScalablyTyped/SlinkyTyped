package typingsSlinky.expo.creatorWebMod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.CanvasGradient
  - typingsSlinky.std.CanvasPattern
*/
trait FillStyle extends js.Object

object FillStyle {
  @scala.inline
  implicit def apply(value: CanvasGradient): FillStyle = value.asInstanceOf[FillStyle]
  @scala.inline
  implicit def apply(value: CanvasPattern): FillStyle = value.asInstanceOf[FillStyle]
  @scala.inline
  implicit def apply(value: String): FillStyle = value.asInstanceOf[FillStyle]
}

