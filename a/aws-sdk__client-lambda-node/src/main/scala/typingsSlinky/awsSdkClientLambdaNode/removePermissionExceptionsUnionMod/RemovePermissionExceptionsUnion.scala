package typingsSlinky.awsSdkClientLambdaNode.removePermissionExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException
import typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
import typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException
*/
trait RemovePermissionExceptionsUnion extends js.Object

object RemovePermissionExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): RemovePermissionExceptionsUnion = value.asInstanceOf[RemovePermissionExceptionsUnion]
  @scala.inline
  implicit def apply(value: PreconditionFailedException): RemovePermissionExceptionsUnion = value.asInstanceOf[RemovePermissionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): RemovePermissionExceptionsUnion = value.asInstanceOf[RemovePermissionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): RemovePermissionExceptionsUnion = value.asInstanceOf[RemovePermissionExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): RemovePermissionExceptionsUnion = value.asInstanceOf[RemovePermissionExceptionsUnion]
}

