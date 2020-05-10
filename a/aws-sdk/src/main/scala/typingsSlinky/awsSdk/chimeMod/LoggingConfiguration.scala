package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfiguration extends js.Object {
  /**
    * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
    */
  var EnableSIPLogs: js.UndefOr[Boolean] = js.native
}

object LoggingConfiguration {
  @scala.inline
  def apply(): LoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfiguration]
  }
  @scala.inline
  implicit class LoggingConfigurationOps[Self <: LoggingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableSIPLogs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableSIPLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSIPLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableSIPLogs")(js.undefined)
        ret
    }
  }
  
}

