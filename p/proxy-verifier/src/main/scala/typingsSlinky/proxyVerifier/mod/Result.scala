package typingsSlinky.proxyVerifier.mod

import typingsSlinky.proxyVerifier.anon.Code
import typingsSlinky.proxyVerifier.proxyVerifierBooleans.`false`
import typingsSlinky.proxyVerifier.proxyVerifierBooleans.`true`
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
  def WorkingResult(ok: `true`): Result = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def NotWorkingResult(error: Code, ok: `false`): Result = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

