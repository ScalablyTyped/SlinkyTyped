package typingsSlinky.rangeParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rangeParser.mod.ResultUnsatisfiable
  - typingsSlinky.rangeParser.mod.ResultInvalid
*/
trait Result extends js.Object

object Result {
  @scala.inline
  implicit def apply(value: ResultInvalid): Result = value.asInstanceOf[Result]
  @scala.inline
  implicit def apply(value: ResultUnsatisfiable): Result = value.asInstanceOf[Result]
}

