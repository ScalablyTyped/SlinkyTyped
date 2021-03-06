package typingsSlinky.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor extends StObject {
  
  /**
    * Array of processor parameters. More details are given below
    */
  var parameters: js.UndefOr[
    js.Array[
      FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter
    ]
  ] = js.native
  
  /**
    * The type of processor. Valid Values: `Lambda`
    */
  var `type`: String = js.native
}
object FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor {
  
  @scala.inline
  def apply(`type`: String): FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorMutableBuilder[Self <: FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: js.Array[
          FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
