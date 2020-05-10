package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeoutOptions extends js.Object {
  var cancel: Boolean = js.native
}

object TimeoutOptions {
  @scala.inline
  def apply(cancel: Boolean): TimeoutOptions = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutOptions]
  }
  @scala.inline
  implicit class TimeoutOptionsOps[Self <: TimeoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

