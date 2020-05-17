package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.highcharts.mod.PointOptionsObject
  - js.Array[scala.Double | java.lang.String]
  - scala.Null
*/
trait PointOptionsType extends js.Object

object PointOptionsType {
  @scala.inline
  implicit def apply(value: js.Array[Double | String]): PointOptionsType = value.asInstanceOf[PointOptionsType]
  @scala.inline
  implicit def apply(value: Double): PointOptionsType = value.asInstanceOf[PointOptionsType]
  @scala.inline
  implicit def apply(value: Null): PointOptionsType = value.asInstanceOf[PointOptionsType]
  @scala.inline
  implicit def apply(value: PointOptionsObject): PointOptionsType = value.asInstanceOf[PointOptionsType]
  @scala.inline
  implicit def apply(value: String): PointOptionsType = value.asInstanceOf[PointOptionsType]
}

