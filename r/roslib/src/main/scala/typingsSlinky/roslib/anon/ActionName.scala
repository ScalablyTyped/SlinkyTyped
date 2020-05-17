package typingsSlinky.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionName extends js.Object {
  var actionName: String = js.native
  var ros: typingsSlinky.roslib.mod.Ros = js.native
  var serverName: String = js.native
  var timeout: Double = js.native
}

object ActionName {
  @scala.inline
  def apply(actionName: String, ros: typingsSlinky.roslib.mod.Ros, serverName: String, timeout: Double): ActionName = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionName]
  }
  @scala.inline
  implicit class ActionNameOps[Self <: ActionName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRos(value: typingsSlinky.roslib.mod.Ros): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

