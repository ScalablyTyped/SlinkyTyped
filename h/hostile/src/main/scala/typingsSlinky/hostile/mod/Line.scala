package typingsSlinky.hostile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Tuple2[java.lang.String, java.lang.String]
*/
trait Line extends js.Object

object Line {
  @scala.inline
  implicit def apply(value: String): Line = value.asInstanceOf[Line]
  @scala.inline
  implicit def apply(value: js.Tuple2[String, String]): Line = value.asInstanceOf[Line]
}

