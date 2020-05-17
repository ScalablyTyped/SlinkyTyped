package typingsSlinky.awsSdkClientLambdaNode.addPermissionExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientLambdaNode.typesPolicyLengthExceededExceptionMod.PolicyLengthExceededException
import typingsSlinky.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException
import typingsSlinky.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException
import typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
import typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientLambdaNode.typesPolicyLengthExceededExceptionMod.PolicyLengthExceededException
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException
*/
trait AddPermissionExceptionsUnion extends js.Object

object AddPermissionExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): AddPermissionExceptionsUnion = value.asInstanceOf[AddPermissionExceptionsUnion]
  @scala.inline
  implicit def apply(value: PolicyLengthExceededException): AddPermissionExceptionsUnion = value.asInstanceOf[AddPermissionExceptionsUnion]
  @scala.inline
  implicit def apply(value: PreconditionFailedException): AddPermissionExceptionsUnion = value.asInstanceOf[AddPermissionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceConflictException): AddPermissionExceptionsUnion = value.asInstanceOf[AddPermissionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): AddPermissionExceptionsUnion = value.asInstanceOf[AddPermissionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): AddPermissionExceptionsUnion = value.asInstanceOf[AddPermissionExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): AddPermissionExceptionsUnion = value.asInstanceOf[AddPermissionExceptionsUnion]
}

