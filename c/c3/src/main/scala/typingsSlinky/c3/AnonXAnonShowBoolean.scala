package typingsSlinky.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXAnonShowBoolean extends js.Object {
  var x: js.UndefOr[AnonShowBoolean] = js.native
}

object AnonXAnonShowBoolean {
  @scala.inline
  def apply(): AnonXAnonShowBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonXAnonShowBoolean]
  }
  @scala.inline
  implicit class AnonXAnonShowBooleanOps[Self <: AnonXAnonShowBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: AnonShowBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
  }
  
}

