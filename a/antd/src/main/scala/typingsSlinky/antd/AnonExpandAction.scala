package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExpandAction extends js.Object {
  var expandAction: String = js.native
  var showIcon: Boolean = js.native
}

object AnonExpandAction {
  @scala.inline
  def apply(expandAction: String, showIcon: Boolean): AnonExpandAction = {
    val __obj = js.Dynamic.literal(expandAction = expandAction.asInstanceOf[js.Any], showIcon = showIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpandAction]
  }
  @scala.inline
  implicit class AnonExpandActionOps[Self <: AnonExpandAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

