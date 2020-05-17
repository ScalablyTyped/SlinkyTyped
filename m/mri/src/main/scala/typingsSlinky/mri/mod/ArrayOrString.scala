package typingsSlinky.mri.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A string or array of strings */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait ArrayOrString extends js.Object

object ArrayOrString {
  @scala.inline
  implicit def apply(value: js.Array[String]): ArrayOrString = value.asInstanceOf[ArrayOrString]
  @scala.inline
  implicit def apply(value: String): ArrayOrString = value.asInstanceOf[ArrayOrString]
}

