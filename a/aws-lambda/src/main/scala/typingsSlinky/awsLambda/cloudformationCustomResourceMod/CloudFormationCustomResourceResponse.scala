package typingsSlinky.awsLambda.cloudformationCustomResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceSuccessResponse
  - typingsSlinky.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceFailedResponse
*/
trait CloudFormationCustomResourceResponse extends js.Object

object CloudFormationCustomResourceResponse {
  @scala.inline
  implicit def apply(value: CloudFormationCustomResourceFailedResponse): CloudFormationCustomResourceResponse = value.asInstanceOf[CloudFormationCustomResourceResponse]
  @scala.inline
  implicit def apply(value: CloudFormationCustomResourceSuccessResponse): CloudFormationCustomResourceResponse = value.asInstanceOf[CloudFormationCustomResourceResponse]
}

