package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorStreamingConfigurationRequest extends js.Object {
  /**
    * The streaming configuration details to add.
    */
  var StreamingConfiguration: typingsSlinky.awsSdk.chimeMod.StreamingConfiguration = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object PutVoiceConnectorStreamingConfigurationRequest {
  @scala.inline
  def apply(StreamingConfiguration: StreamingConfiguration, VoiceConnectorId: NonEmptyString): PutVoiceConnectorStreamingConfigurationRequest = {
    val __obj = js.Dynamic.literal(StreamingConfiguration = StreamingConfiguration.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorStreamingConfigurationRequest]
  }
  @scala.inline
  implicit class PutVoiceConnectorStreamingConfigurationRequestOps[Self <: PutVoiceConnectorStreamingConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamingConfiguration(value: StreamingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamingConfiguration")(value.asInstanceOf[js.Any])
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

