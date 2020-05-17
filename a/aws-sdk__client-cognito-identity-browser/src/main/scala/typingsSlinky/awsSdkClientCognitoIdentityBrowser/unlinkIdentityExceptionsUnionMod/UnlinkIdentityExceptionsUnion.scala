package typingsSlinky.awsSdkClientCognitoIdentityBrowser.unlinkIdentityExceptionsUnionMod

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
trait UnlinkIdentityExceptionsUnion extends js.Object

object UnlinkIdentityExceptionsUnion {
  @scala.inline
  implicit def apply(value: ExternalServiceException): UnlinkIdentityExceptionsUnion = value.asInstanceOf[UnlinkIdentityExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalErrorException): UnlinkIdentityExceptionsUnion = value.asInstanceOf[UnlinkIdentityExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterException): UnlinkIdentityExceptionsUnion = value.asInstanceOf[UnlinkIdentityExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotAuthorizedException): UnlinkIdentityExceptionsUnion = value.asInstanceOf[UnlinkIdentityExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceConflictException): UnlinkIdentityExceptionsUnion = value.asInstanceOf[UnlinkIdentityExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): UnlinkIdentityExceptionsUnion = value.asInstanceOf[UnlinkIdentityExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): UnlinkIdentityExceptionsUnion = value.asInstanceOf[UnlinkIdentityExceptionsUnion]
}

