package typingsSlinky.awsSdkClientLambdaNode.listFunctionsExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
import typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
*/
trait ListFunctionsExceptionsUnion extends js.Object

object ListFunctionsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): ListFunctionsExceptionsUnion = value.asInstanceOf[ListFunctionsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): ListFunctionsExceptionsUnion = value.asInstanceOf[ListFunctionsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): ListFunctionsExceptionsUnion = value.asInstanceOf[ListFunctionsExceptionsUnion]
}

