package typingsSlinky.awsSdkClientCognitoIdentityBrowser.getIdExceptionsUnionMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesExternalServiceExceptionMod.ExternalServiceException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLimitExceededExceptionMod.LimitExceededException
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
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesExternalServiceExceptionMod.ExternalServiceException
*/
trait GetIdExceptionsUnion extends js.Object

object GetIdExceptionsUnion {
  @scala.inline
  implicit def apply(value: ExternalServiceException): GetIdExceptionsUnion = value.asInstanceOf[GetIdExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalErrorException): GetIdExceptionsUnion = value.asInstanceOf[GetIdExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterException): GetIdExceptionsUnion = value.asInstanceOf[GetIdExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): GetIdExceptionsUnion = value.asInstanceOf[GetIdExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotAuthorizedException): GetIdExceptionsUnion = value.asInstanceOf[GetIdExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceConflictException): GetIdExceptionsUnion = value.asInstanceOf[GetIdExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetIdExceptionsUnion = value.asInstanceOf[GetIdExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetIdExceptionsUnion = value.asInstanceOf[GetIdExceptionsUnion]
}

