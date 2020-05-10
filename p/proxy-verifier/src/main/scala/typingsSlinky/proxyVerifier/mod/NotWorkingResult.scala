package typingsSlinky.proxyVerifier.mod

import typingsSlinky.proxyVerifier.AnonCode
import typingsSlinky.proxyVerifier.proxyVerifierBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotWorkingResult extends Result {
  var error: AnonCode = js.native
  var ok: `false` = js.native
}

object NotWorkingResult {
  @scala.inline
  def apply(error: AnonCode, ok: `false`): NotWorkingResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotWorkingResult]
  }
  @scala.inline
  implicit class NotWorkingResultOps[Self <: NotWorkingResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOk(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

