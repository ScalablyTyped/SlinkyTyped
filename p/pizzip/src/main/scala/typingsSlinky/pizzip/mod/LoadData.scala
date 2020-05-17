package typingsSlinky.pizzip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pizzip.mod.Data
  - js.Array[scala.Double]
*/
trait LoadData extends js.Object

object LoadData {
  @scala.inline
  implicit def apply(value: js.Array[Double]): LoadData = value.asInstanceOf[LoadData]
  @scala.inline
  implicit def apply(value: Data): LoadData = value.asInstanceOf[LoadData]
}

