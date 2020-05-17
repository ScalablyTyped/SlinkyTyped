package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandAction extends js.Object {
  var expandAction: String = js.native
  var showIcon: Boolean = js.native
}

object ExpandAction {
  @scala.inline
  def apply(expandAction: String, showIcon: Boolean): ExpandAction = {
    val __obj = js.Dynamic.literal(expandAction = expandAction.asInstanceOf[js.Any], showIcon = showIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandAction]
  }
  @scala.inline
  implicit class ExpandActionOps[Self <: ExpandAction] (val x: Self) extends AnyVal {
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

