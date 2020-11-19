package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStreamingConfiguration(value: StreamingConfiguration): Self = this.set("StreamingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamingConfiguration: Self = this.set("StreamingConfiguration", js.undefined)
  }
}
