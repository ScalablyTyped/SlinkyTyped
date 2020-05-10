package typingsSlinky.protractor.pluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertionResult extends js.Object {
  var errorMsg: js.UndefOr[String] = js.native
  var passed: Boolean = js.native
  var stackTrace: js.UndefOr[String] = js.native
}

object AssertionResult {
  @scala.inline
  def apply(passed: Boolean): AssertionResult = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionResult]
  }
  @scala.inline
  implicit class AssertionResultOps[Self <: AssertionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withStackTrace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTrace")(js.undefined)
        ret
    }
  }
  
}

