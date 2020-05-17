package typingsSlinky.openlayers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.std.Uint8ClampedArray
*/
trait Color_ extends js.Object

object Color_ {
  @scala.inline
  implicit def apply(value: js.Tuple4[Double, Double, Double, Double]): Color_ = value.asInstanceOf[Color_]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Color_ = value.asInstanceOf[Color_]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8ClampedArray): Color_ = value.asInstanceOf[Color_]
}

