package typingsSlinky.ol.helperMod

import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ol.helperMod.UniformLiteralValue
  - js.Function1[
/ * p0 * / typingsSlinky.ol.pluggableMapMod.FrameState, 
typingsSlinky.ol.helperMod.UniformLiteralValue]
*/
trait UniformValue extends js.Object

object UniformValue {
  @scala.inline
  implicit def apply(value: js.Function1[/* p0 */ FrameState, UniformLiteralValue]): UniformValue = value.asInstanceOf[UniformValue]
  @scala.inline
  implicit def apply(value: UniformLiteralValue): UniformValue = value.asInstanceOf[UniformValue]
}

