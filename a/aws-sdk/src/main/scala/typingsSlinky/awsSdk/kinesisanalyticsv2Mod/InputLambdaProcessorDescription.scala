package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputLambdaProcessorDescription extends StObject {
  
  /**
    * The ARN of the AWS Lambda function that is used to preprocess the records in the stream.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARN: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ResourceARN = js.native
  
  /**
    * The ARN of the IAM role that is used to access the AWS Lambda function.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RoleARN] = js.native
}
object InputLambdaProcessorDescription {
  
  @scala.inline
  def apply(ResourceARN: ResourceARN): InputLambdaProcessorDescription = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLambdaProcessorDescription]
  }
  
  @scala.inline
  implicit class InputLambdaProcessorDescriptionMutableBuilder[Self <: InputLambdaProcessorDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
