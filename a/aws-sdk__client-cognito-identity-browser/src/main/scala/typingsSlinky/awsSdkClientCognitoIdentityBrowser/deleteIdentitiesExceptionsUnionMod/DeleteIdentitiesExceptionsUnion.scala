package typingsSlinky.awsSdkClientCognitoIdentityBrowser.deleteIdentitiesExceptionsUnionMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException
*/
trait DeleteIdentitiesExceptionsUnion extends js.Object

object DeleteIdentitiesExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalErrorException): DeleteIdentitiesExceptionsUnion = value.asInstanceOf[DeleteIdentitiesExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterException): DeleteIdentitiesExceptionsUnion = value.asInstanceOf[DeleteIdentitiesExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteIdentitiesExceptionsUnion = value.asInstanceOf[DeleteIdentitiesExceptionsUnion]
}

