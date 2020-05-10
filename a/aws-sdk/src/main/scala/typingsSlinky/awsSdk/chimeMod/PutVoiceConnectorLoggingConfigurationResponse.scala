package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorLoggingConfigurationResponse extends js.Object {
  /**
    * The updated logging configuration details.
    */
  var LoggingConfiguration: js.UndefOr[typingsSlinky.awsSdk.chimeMod.LoggingConfiguration] = js.native
}

object PutVoiceConnectorLoggingConfigurationResponse {
  @scala.inline
  def apply(): PutVoiceConnectorLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorLoggingConfigurationResponse]
  }
  @scala.inline
  implicit class PutVoiceConnectorLoggingConfigurationResponseOps[Self <: PutVoiceConnectorLoggingConfigurationResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutLoggingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingConfiguration")(js.undefined)
        ret
    }
  }
  
}

