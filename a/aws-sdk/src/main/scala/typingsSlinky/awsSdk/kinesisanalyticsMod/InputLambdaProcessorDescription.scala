package typingsSlinky.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputLambdaProcessorDescription extends StObject {
  
  /**
    * The ARN of the AWS Lambda function that is used to preprocess the records in the stream.
    */
  var ResourceARN: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.ResourceARN] = js.native
  
  /**
    * The ARN of the IAM role that is used to access the AWS Lambda function.
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.RoleARN] = js.native
}
object InputLambdaProcessorDescription {
  
  @scala.inline
  def apply(): InputLambdaProcessorDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLambdaProcessorDescription]
  }
  
  @scala.inline
  implicit class InputLambdaProcessorDescriptionMutableBuilder[Self <: InputLambdaProcessorDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
