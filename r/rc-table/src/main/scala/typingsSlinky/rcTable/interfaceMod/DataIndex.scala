package typingsSlinky.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Array[java.lang.String | scala.Double]
*/
trait DataIndex extends js.Object

object DataIndex {
  @scala.inline
  implicit def apply(value: js.Array[String | Double]): DataIndex = value.asInstanceOf[DataIndex]
  @scala.inline
  implicit def apply(value: Double): DataIndex = value.asInstanceOf[DataIndex]
  @scala.inline
  implicit def apply(value: String): DataIndex = value.asInstanceOf[DataIndex]
}

