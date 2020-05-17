package typingsSlinky.orchestrator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait Strings extends js.Object

object Strings {
  @scala.inline
  implicit def apply(value: js.Array[String]): Strings = value.asInstanceOf[Strings]
  @scala.inline
  implicit def apply(value: String): Strings = value.asInstanceOf[Strings]
}

