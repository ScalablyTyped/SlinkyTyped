package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor extends js.Object {
  
  /**
    * Array of processor parameters. More details are given below
    */
  var parameters: js.UndefOr[
    Input[
      js.Array[
        Input[
          FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter
        ]
      ]
    ]
  ] = js.native
  
  /**
    * The type of processor. Valid Values: `Lambda`
    */
  var `type`: Input[String] = js.native
}
object FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor {
  
  @scala.inline
  def apply(`type`: Input[String]): FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorOps[Self <: FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor] (val x: Self) extends AnyVal {
    
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(
      value: (Input[
          FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter
        ])*
    ): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(
      value: Input[
          js.Array[
            Input[
              FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter
            ]
          ]
        ]
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
