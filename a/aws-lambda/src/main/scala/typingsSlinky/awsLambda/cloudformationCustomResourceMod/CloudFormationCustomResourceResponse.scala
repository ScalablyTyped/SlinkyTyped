package typingsSlinky.awsLambda.cloudformationCustomResourceMod

import typingsSlinky.awsLambda.awsLambdaStrings.FAILED
import typingsSlinky.awsLambda.awsLambdaStrings.SUCCESS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceSuccessResponse
  - typingsSlinky.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceFailedResponse
*/
trait CloudFormationCustomResourceResponse extends js.Object
object CloudFormationCustomResourceResponse {
  
  @scala.inline
  def CloudFormationCustomResourceSuccessResponse(
    LogicalResourceId: String,
    PhysicalResourceId: String,
    RequestId: String,
    StackId: String,
    Status: SUCCESS
  ): CloudFormationCustomResourceResponse = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationCustomResourceResponse]
  }
  
  @scala.inline
  def CloudFormationCustomResourceFailedResponse(
    LogicalResourceId: String,
    PhysicalResourceId: String,
    Reason: String,
    RequestId: String,
    StackId: String,
    Status: FAILED
  ): CloudFormationCustomResourceResponse = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationCustomResourceResponse]
  }
}
