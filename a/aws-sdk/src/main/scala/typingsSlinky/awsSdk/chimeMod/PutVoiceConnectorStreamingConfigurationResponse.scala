package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorStreamingConfigurationResponse extends js.Object {
  /**
    * The updated streaming configuration details.
    */
  var StreamingConfiguration: js.UndefOr[typingsSlinky.awsSdk.chimeMod.StreamingConfiguration] = js.native
}

object PutVoiceConnectorStreamingConfigurationResponse {
  @scala.inline
  def apply(): PutVoiceConnectorStreamingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorStreamingConfigurationResponse]
  }
  @scala.inline
  implicit class PutVoiceConnectorStreamingConfigurationResponseOps[Self <: PutVoiceConnectorStreamingConfigurationResponse] (val x: Self) extends AnyVal {
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
    def withoutStreamingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamingConfiguration")(js.undefined)
        ret
    }
  }
  
}

