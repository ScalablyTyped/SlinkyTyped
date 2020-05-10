package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingInfo extends js.Object {
  var BrokerLogs: typingsSlinky.awsSdk.kafkaMod.BrokerLogs = js.native
}

object LoggingInfo {
  @scala.inline
  def apply(BrokerLogs: BrokerLogs): LoggingInfo = {
    val __obj = js.Dynamic.literal(BrokerLogs = BrokerLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingInfo]
  }
  @scala.inline
  implicit class LoggingInfoOps[Self <: LoggingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokerLogs(value: BrokerLogs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerLogs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

