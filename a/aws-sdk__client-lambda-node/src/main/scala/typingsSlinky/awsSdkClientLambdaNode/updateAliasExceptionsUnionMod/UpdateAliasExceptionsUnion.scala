package typingsSlinky.awsSdkClientLambdaNode.updateAliasExceptionsUnionMod

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
trait UpdateAliasExceptionsUnion extends js.Object

object UpdateAliasExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): UpdateAliasExceptionsUnion = value.asInstanceOf[UpdateAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: PreconditionFailedException): UpdateAliasExceptionsUnion = value.asInstanceOf[UpdateAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): UpdateAliasExceptionsUnion = value.asInstanceOf[UpdateAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): UpdateAliasExceptionsUnion = value.asInstanceOf[UpdateAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): UpdateAliasExceptionsUnion = value.asInstanceOf[UpdateAliasExceptionsUnion]
}

