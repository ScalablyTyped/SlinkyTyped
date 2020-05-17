package typingsSlinky.proj4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Double]
  - typingsSlinky.proj4.mod.InterfaceCoordinates
*/
trait TemplateCoordinates extends js.Object

object TemplateCoordinates {
  @scala.inline
  implicit def apply(value: js.Array[Double]): TemplateCoordinates = value.asInstanceOf[TemplateCoordinates]
  @scala.inline
  implicit def apply(value: InterfaceCoordinates): TemplateCoordinates = value.asInstanceOf[TemplateCoordinates]
}

