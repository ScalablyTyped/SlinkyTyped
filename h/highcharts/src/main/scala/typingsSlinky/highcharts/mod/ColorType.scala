package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.highcharts.mod.ColorString
  - typingsSlinky.highcharts.mod.GradientColorObject
  - typingsSlinky.highcharts.mod.PatternObject
*/
trait ColorType extends js.Object

object ColorType {
  @scala.inline
  implicit def apply(value: ColorString): ColorType = value.asInstanceOf[ColorType]
  @scala.inline
  implicit def apply(value: GradientColorObject): ColorType = value.asInstanceOf[ColorType]
  @scala.inline
  implicit def apply(value: PatternObject): ColorType = value.asInstanceOf[ColorType]
}

