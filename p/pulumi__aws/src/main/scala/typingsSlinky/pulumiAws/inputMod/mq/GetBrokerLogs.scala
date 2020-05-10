package typingsSlinky.pulumiAws.inputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBrokerLogs extends js.Object {
  var audit: js.UndefOr[Boolean] = js.native
  var general: js.UndefOr[Boolean] = js.native
}

object GetBrokerLogs {
  @scala.inline
  def apply(): GetBrokerLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBrokerLogs]
  }
  @scala.inline
  implicit class GetBrokerLogsOps[Self <: GetBrokerLogs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audit")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneral(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("general")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("general")(js.undefined)
        ret
    }
  }
  
}

