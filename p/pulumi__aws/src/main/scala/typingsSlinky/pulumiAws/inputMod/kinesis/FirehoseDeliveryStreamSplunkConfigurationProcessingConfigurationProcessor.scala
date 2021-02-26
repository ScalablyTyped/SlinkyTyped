package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor extends StObject {
  
  /**
    * Array of processor parameters. More details are given below
    */
  var parameters: js.UndefOr[
    Input[
      js.Array[
        Input[
          FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter
        ]
      ]
    ]
  ] = js.native
  
  /**
    * The type of processor. Valid Values: `Lambda`
    */
  var `type`: Input[String] = js.native
}
object FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor {
  
  @scala.inline
  def apply(`type`: Input[String]): FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorMutableBuilder[Self <: FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: Input[
          js.Array[
            Input[
              FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter
            ]
          ]
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(
      value: (Input[
          FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter
        ])*
    ): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
