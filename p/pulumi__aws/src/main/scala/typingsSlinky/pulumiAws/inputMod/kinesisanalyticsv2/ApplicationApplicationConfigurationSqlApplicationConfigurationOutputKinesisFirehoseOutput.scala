package typingsSlinky.pulumiAws.inputMod.kinesisanalyticsv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput extends StObject {
  
  /**
    * The ARN of the destination delivery stream to write to.
    */
  var resourceArn: Input[String] = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput {
  
  @scala.inline
  def apply(resourceArn: Input[String]): ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
