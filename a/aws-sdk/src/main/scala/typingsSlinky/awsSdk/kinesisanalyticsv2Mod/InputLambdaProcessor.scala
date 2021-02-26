package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputLambdaProcessor extends StObject {
  
  /**
    * The ARN of the AWS Lambda function that operates on records in the stream.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARN: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ResourceARN = js.native
}
object InputLambdaProcessor {
  
  @scala.inline
  def apply(ResourceARN: ResourceARN): InputLambdaProcessor = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLambdaProcessor]
  }
  
  @scala.inline
  implicit class InputLambdaProcessorMutableBuilder[Self <: InputLambdaProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
