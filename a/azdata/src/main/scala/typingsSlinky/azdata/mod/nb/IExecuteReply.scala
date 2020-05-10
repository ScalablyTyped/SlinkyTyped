package typingsSlinky.azdata.mod.nb

import typingsSlinky.azdata.azdataStrings.abort
import typingsSlinky.azdata.azdataStrings.error
import typingsSlinky.azdata.azdataStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExecuteReply extends js.Object {
  var execution_count: Double | Null = js.native
  var status: ok | error | abort = js.native
}

object IExecuteReply {
  @scala.inline
  def apply(status: ok | error | abort): IExecuteReply = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteReply]
  }
  @scala.inline
  implicit class IExecuteReplyOps[Self <: IExecuteReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: ok | error | abort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecution_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecution_countNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_count")(null)
        ret
    }
  }
  
}

