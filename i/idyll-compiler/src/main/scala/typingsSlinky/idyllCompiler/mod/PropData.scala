package typingsSlinky.idyllCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
*/
trait PropData extends js.Object

object PropData {
  @scala.inline
  implicit def apply(value: Boolean): PropData = value.asInstanceOf[PropData]
  @scala.inline
  implicit def apply(value: Double): PropData = value.asInstanceOf[PropData]
  @scala.inline
  implicit def apply(value: String): PropData = value.asInstanceOf[PropData]
}

