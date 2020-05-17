package typingsSlinky.awsSdkClientLambdaNode.getAliasExceptionsUnionMod

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
trait GetAliasExceptionsUnion extends js.Object

object GetAliasExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): GetAliasExceptionsUnion = value.asInstanceOf[GetAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetAliasExceptionsUnion = value.asInstanceOf[GetAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): GetAliasExceptionsUnion = value.asInstanceOf[GetAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetAliasExceptionsUnion = value.asInstanceOf[GetAliasExceptionsUnion]
}

