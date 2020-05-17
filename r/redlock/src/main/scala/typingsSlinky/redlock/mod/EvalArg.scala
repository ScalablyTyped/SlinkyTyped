package typingsSlinky.redlock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait EvalArg extends js.Object

object EvalArg {
  @scala.inline
  implicit def apply(value: Double): EvalArg = value.asInstanceOf[EvalArg]
  @scala.inline
  implicit def apply(value: String): EvalArg = value.asInstanceOf[EvalArg]
}

