package typingsSlinky.pulumiAws.inputMod.mq

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerLogs extends js.Object {
  /**
    * Enables audit logging. User management action made using JMX or the ActiveMQ Web Console is logged. Defaults to `false`.
    */
  var audit: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Enables general logging via CloudWatch. Defaults to `false`.
    */
  var general: js.UndefOr[Input[Boolean]] = js.native
}

object BrokerLogs {
  @scala.inline
  def apply(): BrokerLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerLogs]
  }
  @scala.inline
  implicit class BrokerLogsOps[Self <: BrokerLogs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudit(value: Input[Boolean]): Self = {
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
    def withGeneral(value: Input[Boolean]): Self = {
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

