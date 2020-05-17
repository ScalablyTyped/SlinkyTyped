package typingsSlinky.proxyVerifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.proxyVerifier.mod.CustomTestWorkingResult
  - typingsSlinky.proxyVerifier.mod.CustomTestNotWorkingResult
*/
trait CustomTestResult extends js.Object

object CustomTestResult {
  @scala.inline
  implicit def apply(value: CustomTestNotWorkingResult): CustomTestResult = value.asInstanceOf[CustomTestResult]
  @scala.inline
  implicit def apply(value: CustomTestWorkingResult): CustomTestResult = value.asInstanceOf[CustomTestResult]
}

