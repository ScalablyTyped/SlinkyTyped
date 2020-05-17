package typingsSlinky.materialList.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.Array[scala.Double]
*/
trait Index extends js.Object

object Index {
  @scala.inline
  implicit def apply(value: js.Array[Double]): Index = value.asInstanceOf[Index]
  @scala.inline
  implicit def apply(value: Double): Index = value.asInstanceOf[Index]
}

