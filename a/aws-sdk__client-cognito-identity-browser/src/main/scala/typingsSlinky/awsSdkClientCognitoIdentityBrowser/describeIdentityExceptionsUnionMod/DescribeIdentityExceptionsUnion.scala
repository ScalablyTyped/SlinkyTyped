package typingsSlinky.awsSdkClientCognitoIdentityBrowser.describeIdentityExceptionsUnionMod

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
trait DescribeIdentityExceptionsUnion extends js.Object

object DescribeIdentityExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalErrorException): DescribeIdentityExceptionsUnion = value.asInstanceOf[DescribeIdentityExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterException): DescribeIdentityExceptionsUnion = value.asInstanceOf[DescribeIdentityExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotAuthorizedException): DescribeIdentityExceptionsUnion = value.asInstanceOf[DescribeIdentityExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DescribeIdentityExceptionsUnion = value.asInstanceOf[DescribeIdentityExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DescribeIdentityExceptionsUnion = value.asInstanceOf[DescribeIdentityExceptionsUnion]
}

