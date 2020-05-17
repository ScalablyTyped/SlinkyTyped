package typingsSlinky.awsSdkClientLambdaNode.getAccountSettingsExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
import typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
*/
trait GetAccountSettingsExceptionsUnion extends js.Object

object GetAccountSettingsExceptionsUnion {
  @scala.inline
  implicit def apply(value: ServiceException): GetAccountSettingsExceptionsUnion = value.asInstanceOf[GetAccountSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetAccountSettingsExceptionsUnion = value.asInstanceOf[GetAccountSettingsExceptionsUnion]
}

