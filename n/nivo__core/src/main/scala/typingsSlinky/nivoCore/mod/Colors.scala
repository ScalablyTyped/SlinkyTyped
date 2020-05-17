package typingsSlinky.nivoCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[java.lang.String]
  - java.lang.String
*/
trait Colors extends js.Object

object Colors {
  @scala.inline
  implicit def apply(value: js.Array[String]): Colors = value.asInstanceOf[Colors]
  @scala.inline
  implicit def apply(value: String): Colors = value.asInstanceOf[Colors]
}

