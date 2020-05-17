package typingsSlinky.awsSdkClientLambdaNode.getPolicyExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
import typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
*/
trait GetPolicyExceptionsUnion extends js.Object

object GetPolicyExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): GetPolicyExceptionsUnion = value.asInstanceOf[GetPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetPolicyExceptionsUnion = value.asInstanceOf[GetPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): GetPolicyExceptionsUnion = value.asInstanceOf[GetPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetPolicyExceptionsUnion = value.asInstanceOf[GetPolicyExceptionsUnion]
}

