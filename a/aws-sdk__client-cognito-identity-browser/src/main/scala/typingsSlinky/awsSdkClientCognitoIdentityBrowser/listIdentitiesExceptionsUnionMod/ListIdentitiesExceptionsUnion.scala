package typingsSlinky.awsSdkClientCognitoIdentityBrowser.listIdentitiesExceptionsUnionMod

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
trait ListIdentitiesExceptionsUnion extends js.Object

object ListIdentitiesExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalErrorException): ListIdentitiesExceptionsUnion = value.asInstanceOf[ListIdentitiesExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterException): ListIdentitiesExceptionsUnion = value.asInstanceOf[ListIdentitiesExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotAuthorizedException): ListIdentitiesExceptionsUnion = value.asInstanceOf[ListIdentitiesExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListIdentitiesExceptionsUnion = value.asInstanceOf[ListIdentitiesExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): ListIdentitiesExceptionsUnion = value.asInstanceOf[ListIdentitiesExceptionsUnion]
}

