package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAction extends js.Object {
  var action: String = js.native
  var visibilityToggle: Boolean = js.native
}

object AnonAction {
  @scala.inline
  def apply(action: String, visibilityToggle: Boolean): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], visibilityToggle = visibilityToggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAction]
  }
  @scala.inline
  implicit class AnonActionOps[Self <: AnonAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibilityToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityToggle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

