package typingsSlinky.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionTimetoken extends js.Object {
  var actionTimetoken: String | Double = js.native
  var uuid: String = js.native
}

object ActionTimetoken {
  @scala.inline
  def apply(actionTimetoken: String | Double, uuid: String): ActionTimetoken = {
    val __obj = js.Dynamic.literal(actionTimetoken = actionTimetoken.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTimetoken]
  }
  @scala.inline
  implicit class ActionTimetokenOps[Self <: ActionTimetoken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionTimetoken(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTimetoken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

