package typingsSlinky.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.recharts.mod.ContentRenderer[js.Any]
  - typingsSlinky.recharts.rechartsStrings.auto
  - typingsSlinky.recharts.rechartsStrings.dataMin
  - typingsSlinky.recharts.rechartsStrings.dataMax
*/
trait AxisDomain extends js.Object

object AxisDomain {
  @scala.inline
  def auto: typingsSlinky.recharts.rechartsStrings.auto = "auto".asInstanceOf[typingsSlinky.recharts.rechartsStrings.auto]
  @scala.inline
  def dataMin: typingsSlinky.recharts.rechartsStrings.dataMin = "dataMin".asInstanceOf[typingsSlinky.recharts.rechartsStrings.dataMin]
  @scala.inline
  def dataMax: typingsSlinky.recharts.rechartsStrings.dataMax = "dataMax".asInstanceOf[typingsSlinky.recharts.rechartsStrings.dataMax]
  @scala.inline
  implicit def apply(value: ContentRenderer[js.Any]): AxisDomain = value.asInstanceOf[AxisDomain]
  @scala.inline
  implicit def apply(value: Double): AxisDomain = value.asInstanceOf[AxisDomain]
  @scala.inline
  implicit def apply(value: String): AxisDomain = value.asInstanceOf[AxisDomain]
}

