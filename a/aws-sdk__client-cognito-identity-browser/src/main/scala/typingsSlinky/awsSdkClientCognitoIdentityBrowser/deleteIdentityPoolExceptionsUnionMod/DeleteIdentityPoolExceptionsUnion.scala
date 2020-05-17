package typingsSlinky.awsSdkClientCognitoIdentityBrowser.deleteIdentityPoolExceptionsUnionMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesNotAuthorizedExceptionMod.NotAuthorizedException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesNotAuthorizedExceptionMod.NotAuthorizedException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException
*/
trait DeleteIdentityPoolExceptionsUnion extends js.Object

object DeleteIdentityPoolExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalErrorException): DeleteIdentityPoolExceptionsUnion = value.asInstanceOf[DeleteIdentityPoolExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterException): DeleteIdentityPoolExceptionsUnion = value.asInstanceOf[DeleteIdentityPoolExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotAuthorizedException): DeleteIdentityPoolExceptionsUnion = value.asInstanceOf[DeleteIdentityPoolExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DeleteIdentityPoolExceptionsUnion = value.asInstanceOf[DeleteIdentityPoolExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteIdentityPoolExceptionsUnion = value.asInstanceOf[DeleteIdentityPoolExceptionsUnion]
}

