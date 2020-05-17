package typingsSlinky.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenExceptionsUnionMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesExternalServiceExceptionMod.ExternalServiceException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesNotAuthorizedExceptionMod.NotAuthorizedException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesResourceConflictExceptionMod.ResourceConflictException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesNotAuthorizedExceptionMod.NotAuthorizedException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesResourceConflictExceptionMod.ResourceConflictException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesExternalServiceExceptionMod.ExternalServiceException
*/
trait GetOpenIdTokenExceptionsUnion extends js.Object

object GetOpenIdTokenExceptionsUnion {
  @scala.inline
  implicit def apply(value: ExternalServiceException): GetOpenIdTokenExceptionsUnion = value.asInstanceOf[GetOpenIdTokenExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalErrorException): GetOpenIdTokenExceptionsUnion = value.asInstanceOf[GetOpenIdTokenExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterException): GetOpenIdTokenExceptionsUnion = value.asInstanceOf[GetOpenIdTokenExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotAuthorizedException): GetOpenIdTokenExceptionsUnion = value.asInstanceOf[GetOpenIdTokenExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceConflictException): GetOpenIdTokenExceptionsUnion = value.asInstanceOf[GetOpenIdTokenExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetOpenIdTokenExceptionsUnion = value.asInstanceOf[GetOpenIdTokenExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetOpenIdTokenExceptionsUnion = value.asInstanceOf[GetOpenIdTokenExceptionsUnion]
}

