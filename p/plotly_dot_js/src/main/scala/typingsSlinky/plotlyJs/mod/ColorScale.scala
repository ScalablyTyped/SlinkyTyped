package typingsSlinky.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String | (js.Tuple2[scala.Double, java.lang.String])]
*/
trait ColorScale extends js.Object

object ColorScale {
  @scala.inline
  implicit def apply(value: js.Array[String | (js.Tuple2[Double, String])]): ColorScale = value.asInstanceOf[ColorScale]
  @scala.inline
  implicit def apply(value: String): ColorScale = value.asInstanceOf[ColorScale]
}

