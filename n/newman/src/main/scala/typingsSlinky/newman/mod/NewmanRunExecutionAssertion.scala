package typingsSlinky.newman.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewmanRunExecutionAssertion extends js.Object {
  var assertion: String = js.native
  var error: NewmanRunExecutionAssertionError = js.native
}

object NewmanRunExecutionAssertion {
  @scala.inline
  def apply(assertion: String, error: NewmanRunExecutionAssertionError): NewmanRunExecutionAssertion = {
    val __obj = js.Dynamic.literal(assertion = assertion.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunExecutionAssertion]
  }
  @scala.inline
  implicit class NewmanRunExecutionAssertionOps[Self <: NewmanRunExecutionAssertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssertion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: NewmanRunExecutionAssertionError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

