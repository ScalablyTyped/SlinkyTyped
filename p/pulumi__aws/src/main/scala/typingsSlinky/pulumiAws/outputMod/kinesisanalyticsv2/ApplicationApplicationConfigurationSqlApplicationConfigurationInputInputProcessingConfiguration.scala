package typingsSlinky.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration extends StObject {
  
  /**
    * Describes the [Lambda function](https://www.terraform.io/docs/providers/aws/r/lambda_function.html) that is used to preprocess the records in the stream before being processed by your application code.
    */
  var inputLambdaProcessor: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessor = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration {
  
  @scala.inline
  def apply(
    inputLambdaProcessor: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessor
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration = {
    val __obj = js.Dynamic.literal(inputLambdaProcessor = inputLambdaProcessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputLambdaProcessor(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessor
    ): Self = StObject.set(x, "inputLambdaProcessor", value.asInstanceOf[js.Any])
  }
}
