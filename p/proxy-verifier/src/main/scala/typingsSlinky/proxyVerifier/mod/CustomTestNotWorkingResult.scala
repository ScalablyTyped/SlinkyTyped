package typingsSlinky.proxyVerifier.mod

import typingsSlinky.proxyVerifier.AnonCode
import typingsSlinky.proxyVerifier.proxyVerifierBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTestNotWorkingResult
  extends CustomTestBaseResult
     with CustomTestResult {
  var error: AnonCode
  var ok: `false`
}

object CustomTestNotWorkingResult {
  @scala.inline
  def apply(data: String, error: AnonCode, headers: Headers, ok: `false`, status: Double): CustomTestNotWorkingResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomTestNotWorkingResult]
  }
}

