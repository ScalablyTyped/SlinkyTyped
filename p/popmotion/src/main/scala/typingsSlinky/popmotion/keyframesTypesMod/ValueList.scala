package typingsSlinky.popmotion.keyframesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[scala.Double]
*/
trait ValueList extends js.Object

object ValueList {
  @scala.inline
  implicit def apply(value: js.Array[Double]): ValueList = value.asInstanceOf[ValueList]
  @scala.inline
  implicit def apply(value: String): ValueList = value.asInstanceOf[ValueList]
}

