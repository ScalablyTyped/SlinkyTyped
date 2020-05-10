package typingsSlinky.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertionError extends js.Object {
  var actual: js.Any = js.native
  var expected: js.Any = js.native
  var msg: String = js.native
  var operator: String = js.native
  var stackStartFunction: js.Any = js.native
}

object AssertionError {
  @scala.inline
  def apply(actual: js.Any, expected: js.Any, msg: String, operator: String, stackStartFunction: js.Any): AssertionError = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], stackStartFunction = stackStartFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionError]
  }
  @scala.inline
  implicit class AssertionErrorOps[Self <: AssertionError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActual(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpected(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackStartFunction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackStartFunction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

