package typingsSlinky.awsSdkClientPinpointBrowser.deleteUserEndpointsExceptionsUnionMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesBadRequestExceptionMod.BadRequestException
import typingsSlinky.awsSdkClientPinpointBrowser.typesForbiddenExceptionMod.ForbiddenException
import typingsSlinky.awsSdkClientPinpointBrowser.typesInternalServerErrorExceptionMod.InternalServerErrorException
import typingsSlinky.awsSdkClientPinpointBrowser.typesMethodNotAllowedExceptionMod.MethodNotAllowedException
import typingsSlinky.awsSdkClientPinpointBrowser.typesNotFoundExceptionMod.NotFoundException
import typingsSlinky.awsSdkClientPinpointBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientPinpointBrowser.typesBadRequestExceptionMod.BadRequestException
  - typingsSlinky.awsSdkClientPinpointBrowser.typesInternalServerErrorExceptionMod.InternalServerErrorException
  - typingsSlinky.awsSdkClientPinpointBrowser.typesForbiddenExceptionMod.ForbiddenException
  - typingsSlinky.awsSdkClientPinpointBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientPinpointBrowser.typesMethodNotAllowedExceptionMod.MethodNotAllowedException
  - typingsSlinky.awsSdkClientPinpointBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
*/
trait DeleteUserEndpointsExceptionsUnion extends js.Object

object DeleteUserEndpointsExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): DeleteUserEndpointsExceptionsUnion = value.asInstanceOf[DeleteUserEndpointsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): DeleteUserEndpointsExceptionsUnion = value.asInstanceOf[DeleteUserEndpointsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): DeleteUserEndpointsExceptionsUnion = value.asInstanceOf[DeleteUserEndpointsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): DeleteUserEndpointsExceptionsUnion = value.asInstanceOf[DeleteUserEndpointsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DeleteUserEndpointsExceptionsUnion = value.asInstanceOf[DeleteUserEndpointsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteUserEndpointsExceptionsUnion = value.asInstanceOf[DeleteUserEndpointsExceptionsUnion]
}

