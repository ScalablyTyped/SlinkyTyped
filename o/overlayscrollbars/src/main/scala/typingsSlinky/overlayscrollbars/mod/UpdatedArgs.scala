package typingsSlinky.overlayscrollbars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatedArgs extends js.Object {
  var forced: Boolean = js.native
}

object UpdatedArgs {
  @scala.inline
  def apply(forced: Boolean): UpdatedArgs = {
    val __obj = js.Dynamic.literal(forced = forced.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedArgs]
  }
  @scala.inline
  implicit class UpdatedArgsOps[Self <: UpdatedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forced")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

