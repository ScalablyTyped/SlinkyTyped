package typingsSlinky.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertBoolean extends js.Object {
  var assert: Boolean = js.native
}

object AssertBoolean {
  @scala.inline
  def apply(assert: Boolean): AssertBoolean = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertBoolean]
  }
  @scala.inline
  implicit class AssertBooleanOps[Self <: AssertBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

