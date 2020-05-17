package typingsSlinky.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Array[scala.Double | java.lang.String]
  - typingsSlinky.reactBootstrapTable.mod.DateFilterValue
  - typingsSlinky.reactBootstrapTable.mod.NumberFilterValue
*/
trait FilterValueData extends js.Object

object FilterValueData {
  @scala.inline
  implicit def apply(value: js.Array[Double | String]): FilterValueData = value.asInstanceOf[FilterValueData]
  @scala.inline
  implicit def apply(value: DateFilterValue): FilterValueData = value.asInstanceOf[FilterValueData]
  @scala.inline
  implicit def apply(value: Double): FilterValueData = value.asInstanceOf[FilterValueData]
  @scala.inline
  implicit def apply(value: NumberFilterValue): FilterValueData = value.asInstanceOf[FilterValueData]
  @scala.inline
  implicit def apply(value: String): FilterValueData = value.asInstanceOf[FilterValueData]
}

