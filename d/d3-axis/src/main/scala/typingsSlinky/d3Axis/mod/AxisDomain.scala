package typingsSlinky.d3Axis.mod

import typingsSlinky.d3Axis.anon.ValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.std.Date
  - typingsSlinky.d3Axis.anon.ValueOf
*/
trait AxisDomain extends js.Object

object AxisDomain {
  @scala.inline
  implicit def apply(value: js.Date): AxisDomain = value.asInstanceOf[AxisDomain]
  @scala.inline
  implicit def apply(value: Double): AxisDomain = value.asInstanceOf[AxisDomain]
  @scala.inline
  implicit def apply(value: String): AxisDomain = value.asInstanceOf[AxisDomain]
  @scala.inline
  implicit def apply(value: ValueOf): AxisDomain = value.asInstanceOf[AxisDomain]
}

