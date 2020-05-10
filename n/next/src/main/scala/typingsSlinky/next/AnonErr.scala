package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErr extends js.Object {
  var err: js.Any = js.native
}

object AnonErr {
  @scala.inline
  def apply(err: js.Any): AnonErr = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErr]
  }
  @scala.inline
  implicit class AnonErrOps[Self <: AnonErr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErr(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

