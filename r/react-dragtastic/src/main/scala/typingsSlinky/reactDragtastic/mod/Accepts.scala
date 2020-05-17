package typingsSlinky.reactDragtastic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait Accepts extends js.Object

object Accepts {
  @scala.inline
  implicit def apply(value: js.Array[String]): Accepts = value.asInstanceOf[Accepts]
  @scala.inline
  implicit def apply(value: String): Accepts = value.asInstanceOf[Accepts]
}

