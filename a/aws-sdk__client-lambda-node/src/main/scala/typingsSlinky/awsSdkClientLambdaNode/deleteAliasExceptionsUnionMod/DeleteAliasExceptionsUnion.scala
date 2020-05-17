package typingsSlinky.awsSdkClientLambdaNode.deleteAliasExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
import typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
*/
trait DeleteAliasExceptionsUnion extends js.Object

object DeleteAliasExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): DeleteAliasExceptionsUnion = value.asInstanceOf[DeleteAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): DeleteAliasExceptionsUnion = value.asInstanceOf[DeleteAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteAliasExceptionsUnion = value.asInstanceOf[DeleteAliasExceptionsUnion]
}

