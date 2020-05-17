package typingsSlinky.proxyVerifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.proxyVerifier.mod.WorkingResult
  - typingsSlinky.proxyVerifier.mod.NotWorkingResult
*/
trait Result extends js.Object

object Result {
  @scala.inline
  implicit def apply(value: NotWorkingResult): Result = value.asInstanceOf[Result]
  @scala.inline
  implicit def apply(value: WorkingResult): Result = value.asInstanceOf[Result]
}

