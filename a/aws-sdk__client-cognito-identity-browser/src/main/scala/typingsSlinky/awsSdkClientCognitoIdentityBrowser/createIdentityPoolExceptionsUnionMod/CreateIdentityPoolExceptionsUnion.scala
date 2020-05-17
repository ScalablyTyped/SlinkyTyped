package typingsSlinky.awsSdkClientCognitoIdentityBrowser.createIdentityPoolExceptionsUnionMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesNotAuthorizedExceptionMod.NotAuthorizedException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesResourceConflictExceptionMod.ResourceConflictException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesNotAuthorizedExceptionMod.NotAuthorizedException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesResourceConflictExceptionMod.ResourceConflictException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLimitExceededExceptionMod.LimitExceededException
*/
trait CreateIdentityPoolExceptionsUnion extends js.Object

object CreateIdentityPoolExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalErrorException): CreateIdentityPoolExceptionsUnion = value.asInstanceOf[CreateIdentityPoolExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterException): CreateIdentityPoolExceptionsUnion = value.asInstanceOf[CreateIdentityPoolExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): CreateIdentityPoolExceptionsUnion = value.asInstanceOf[CreateIdentityPoolExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotAuthorizedException): CreateIdentityPoolExceptionsUnion = value.asInstanceOf[CreateIdentityPoolExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceConflictException): CreateIdentityPoolExceptionsUnion = value.asInstanceOf[CreateIdentityPoolExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): CreateIdentityPoolExceptionsUnion = value.asInstanceOf[CreateIdentityPoolExceptionsUnion]
}

