package typingsSlinky.jqueryGridster.anon

import typingsSlinky.jqueryGridster.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Helper extends js.Object {
  var helper: JQuery = js.native
}

object Helper {
  @scala.inline
  def apply(helper: JQuery): Helper = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Helper]
  }
  @scala.inline
  implicit class HelperOps[Self <: Helper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHelper(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

