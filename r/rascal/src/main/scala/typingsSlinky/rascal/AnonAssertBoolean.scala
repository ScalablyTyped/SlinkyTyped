package typingsSlinky.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAssertBoolean extends js.Object {
  var assert: Boolean = js.native
}

object AnonAssertBoolean {
  @scala.inline
  def apply(assert: Boolean): AnonAssertBoolean = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssertBoolean]
  }
  @scala.inline
  implicit class AnonAssertBooleanOps[Self <: AnonAssertBoolean] (val x: Self) extends AnyVal {
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

