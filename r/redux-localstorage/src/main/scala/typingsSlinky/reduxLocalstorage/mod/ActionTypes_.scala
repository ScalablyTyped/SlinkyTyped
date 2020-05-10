package typingsSlinky.reduxLocalstorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionTypes_ extends js.Object {
  var INIT: String = js.native
}

object ActionTypes_ {
  @scala.inline
  def apply(INIT: String): ActionTypes_ = {
    val __obj = js.Dynamic.literal(INIT = INIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTypes_]
  }
  @scala.inline
  implicit class ActionTypes_Ops[Self <: ActionTypes_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withINIT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INIT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

