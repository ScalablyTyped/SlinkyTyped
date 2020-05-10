package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLoggingConfigurationRequest extends js.Object {
  /**
    * 
    */
  var LoggingConfiguration: typingsSlinky.awsSdk.wafv2Mod.LoggingConfiguration = js.native
}

object PutLoggingConfigurationRequest {
  @scala.inline
  def apply(LoggingConfiguration: LoggingConfiguration): PutLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(LoggingConfiguration = LoggingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLoggingConfigurationRequest]
  }
  @scala.inline
  implicit class PutLoggingConfigurationRequestOps[Self <: PutLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoggingConfiguration(value: LoggingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

