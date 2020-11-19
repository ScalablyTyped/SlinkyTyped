package typingsSlinky.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor extends js.Object {
  
  /**
    * Array of processor parameters. More details are given below
    */
  var parameters: js.UndefOr[
    js.Array[
      FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter
    ]
  ] = js.native
  
  /**
    * The type of processor. Valid Values: `Lambda`
    */
  var `type`: String = js.native
}
object FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor {
  
  @scala.inline
  def apply(`type`: String): FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorOps[Self <: FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(
      value: js.Array[
          FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter
        ]
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
