package typingsSlinky.proxyVerifier.mod

import typingsSlinky.proxyVerifier.anon.Code
import typingsSlinky.proxyVerifier.proxyVerifierBooleans.`false`
import typingsSlinky.proxyVerifier.proxyVerifierBooleans.`true`
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
  def CustomTestWorkingResult(data: String, headers: Headers, ok: `true`, status: Double): CustomTestResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTestResult]
  }
  @scala.inline
  def CustomTestNotWorkingResult(data: String, error: Code, headers: Headers, ok: `false`, status: Double): CustomTestResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTestResult]
  }
}

