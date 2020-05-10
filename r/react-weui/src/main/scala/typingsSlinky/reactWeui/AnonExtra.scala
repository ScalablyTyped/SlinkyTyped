package typingsSlinky.reactWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtra extends js.Object {
  var extra: Boolean = js.native
}

object AnonExtra {
  @scala.inline
  def apply(extra: Boolean): AnonExtra = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtra]
  }
  @scala.inline
  implicit class AnonExtraOps[Self <: AnonExtra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtra(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

