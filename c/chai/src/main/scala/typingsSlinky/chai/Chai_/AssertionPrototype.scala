package typingsSlinky.chai.Chai_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertionPrototype extends js.Object {
  var _obj: js.Any = js.native
  def assert(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AssertionArgs is not an array type */ args: AssertionArgs
  ): Unit = js.native
}

object AssertionPrototype {
  @scala.inline
  def apply(_obj: js.Any, assert: AssertionArgs => Unit): AssertionPrototype = {
    val __obj = js.Dynamic.literal(_obj = _obj.asInstanceOf[js.Any], assert = js.Any.fromFunction1(assert))
    __obj.asInstanceOf[AssertionPrototype]
  }
  @scala.inline
  implicit class AssertionPrototypeOps[Self <: AssertionPrototype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_obj(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_obj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssert(value: AssertionArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

