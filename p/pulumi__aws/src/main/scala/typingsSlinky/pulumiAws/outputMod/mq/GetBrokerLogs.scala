package typingsSlinky.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBrokerLogs extends js.Object {
  var audit: Boolean = js.native
  var general: Boolean = js.native
}

object GetBrokerLogs {
  @scala.inline
  def apply(audit: Boolean, general: Boolean): GetBrokerLogs = {
    val __obj = js.Dynamic.literal(audit = audit.asInstanceOf[js.Any], general = general.asInstanceOf[js.Any])
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
    def withGeneral(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("general")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

