package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorStreamingConfigurationResponse extends js.Object {
  /**
    * The streaming configuration details.
    */
  var StreamingConfiguration: js.UndefOr[typingsSlinky.awsSdk.chimeMod.StreamingConfiguration] = js.native
}

object GetVoiceConnectorStreamingConfigurationResponse {
  @scala.inline
  def apply(): GetVoiceConnectorStreamingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorStreamingConfigurationResponse]
  }
  @scala.inline
  implicit class GetVoiceConnectorStreamingConfigurationResponseOps[Self <: GetVoiceConnectorStreamingConfigurationResponse] (val x: Self) extends AnyVal {
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

