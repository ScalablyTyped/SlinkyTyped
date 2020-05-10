package typingsSlinky.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExpandAnonEnabled extends js.Object {
  var expand: AnonEnabled = js.native
}

object AnonExpandAnonEnabled {
  @scala.inline
  def apply(expand: AnonEnabled): AnonExpandAnonEnabled = {
    val __obj = js.Dynamic.literal(expand = expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpandAnonEnabled]
  }
  @scala.inline
  implicit class AnonExpandAnonEnabledOps[Self <: AnonExpandAnonEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpand(value: AnonEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

