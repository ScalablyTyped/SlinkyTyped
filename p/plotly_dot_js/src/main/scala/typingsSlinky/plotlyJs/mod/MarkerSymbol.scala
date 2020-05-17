package typingsSlinky.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Array[java.lang.String | scala.Double]
*/
trait MarkerSymbol extends js.Object

object MarkerSymbol {
  @scala.inline
  implicit def apply(value: js.Array[String | Double]): MarkerSymbol = value.asInstanceOf[MarkerSymbol]
  @scala.inline
  implicit def apply(value: Double): MarkerSymbol = value.asInstanceOf[MarkerSymbol]
  @scala.inline
  implicit def apply(value: String): MarkerSymbol = value.asInstanceOf[MarkerSymbol]
}

