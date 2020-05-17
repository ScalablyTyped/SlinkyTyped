package typingsSlinky.awsSdkClientLambdaNode.listAliasesExceptionsUnionMod

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
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
*/
trait ListAliasesExceptionsUnion extends js.Object

object ListAliasesExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): ListAliasesExceptionsUnion = value.asInstanceOf[ListAliasesExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListAliasesExceptionsUnion = value.asInstanceOf[ListAliasesExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): ListAliasesExceptionsUnion = value.asInstanceOf[ListAliasesExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): ListAliasesExceptionsUnion = value.asInstanceOf[ListAliasesExceptionsUnion]
}

