package typingsSlinky.antd.statisticUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
*/
trait valueType extends countdownValueType

object valueType {
  @scala.inline
  implicit def apply(value: Double): valueType = value.asInstanceOf[valueType]
  @scala.inline
  implicit def apply(value: String): valueType = value.asInstanceOf[valueType]
}

