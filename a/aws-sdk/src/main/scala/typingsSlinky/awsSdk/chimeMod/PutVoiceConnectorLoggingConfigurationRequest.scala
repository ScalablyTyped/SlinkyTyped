package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorLoggingConfigurationRequest extends js.Object {
  /**
    * The logging configuration details to add.
    */
  var LoggingConfiguration: typingsSlinky.awsSdk.chimeMod.LoggingConfiguration = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object PutVoiceConnectorLoggingConfigurationRequest {
  @scala.inline
  def apply(LoggingConfiguration: LoggingConfiguration, VoiceConnectorId: NonEmptyString): PutVoiceConnectorLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(LoggingConfiguration = LoggingConfiguration.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorLoggingConfigurationRequest]
  }
  @scala.inline
  implicit class PutVoiceConnectorLoggingConfigurationRequestOps[Self <: PutVoiceConnectorLoggingConfigurationRequest] (val x: Self) extends AnyVal {
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
    def withVoiceConnectorId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnectorId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

