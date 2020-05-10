package typingsSlinky.angularMocks.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILogCall extends js.Object {
  var logs: js.Array[String] = js.native
}

object ILogCall {
  @scala.inline
  def apply(logs: js.Array[String]): ILogCall = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogCall]
  }
  @scala.inline
  implicit class ILogCallOps[Self <: ILogCall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

