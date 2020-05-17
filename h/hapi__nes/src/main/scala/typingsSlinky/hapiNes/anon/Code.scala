package typingsSlinky.hapiNes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  var code: Double = js.native
  var explanation: String = js.native
  var reason: String = js.native
  var wasClean: Boolean = js.native
}

object Code {
  @scala.inline
  def apply(code: Double, explanation: String, reason: String, wasClean: Boolean): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExplanation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explanation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWasClean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasClean")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

