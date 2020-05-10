package typingsSlinky.jqueryGridster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHelper extends js.Object {
  var helper: JQuery = js.native
}

object AnonHelper {
  @scala.inline
  def apply(helper: JQuery): AnonHelper = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHelper]
  }
  @scala.inline
  implicit class AnonHelperOps[Self <: AnonHelper] (val x: Self) extends AnyVal {
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

