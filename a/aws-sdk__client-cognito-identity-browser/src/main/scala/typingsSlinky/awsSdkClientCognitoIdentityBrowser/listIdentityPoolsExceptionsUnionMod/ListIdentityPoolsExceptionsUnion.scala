package typingsSlinky.awsSdkClientCognitoIdentityBrowser.listIdentityPoolsExceptionsUnionMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesNotAuthorizedExceptionMod.NotAuthorizedException
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod.InvalidParameterException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesNotAuthorizedExceptionMod.NotAuthorizedException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod.InternalErrorException
*/
trait ListIdentityPoolsExceptionsUnion extends js.Object

object ListIdentityPoolsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalErrorException): ListIdentityPoolsExceptionsUnion = value.asInstanceOf[ListIdentityPoolsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterException): ListIdentityPoolsExceptionsUnion = value.asInstanceOf[ListIdentityPoolsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotAuthorizedException): ListIdentityPoolsExceptionsUnion = value.asInstanceOf[ListIdentityPoolsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): ListIdentityPoolsExceptionsUnion = value.asInstanceOf[ListIdentityPoolsExceptionsUnion]
}

