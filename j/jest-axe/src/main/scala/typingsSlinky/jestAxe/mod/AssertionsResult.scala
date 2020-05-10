package typingsSlinky.jestAxe.mod

import typingsSlinky.axeCore.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertionsResult extends js.Object {
  /**
    * Actual checked aXe verification results.
    */
  var actual: js.Array[Result] = js.native
  /**
    * Whether the assertion passed.
    */
  var pass: Boolean = js.native
  /**
    * @returns Message from the Jest assertion.
    */
  def message(): String = js.native
}

object AssertionsResult {
  @scala.inline
  def apply(actual: js.Array[Result], message: () => String, pass: Boolean): AssertionsResult = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionsResult]
  }
  @scala.inline
  implicit class AssertionsResultOps[Self <: AssertionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActual(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

