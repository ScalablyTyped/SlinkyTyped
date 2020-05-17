package typingsSlinky.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApi.AMap.LngLat
  - js.Tuple2[scala.Double, scala.Double]
*/
trait LocationValue extends js.Object

object LocationValue {
  @scala.inline
  implicit def apply(value: LngLat): LocationValue = value.asInstanceOf[LocationValue]
  @scala.inline
  implicit def apply(value: js.Tuple2[Double, Double]): LocationValue = value.asInstanceOf[LocationValue]
}

