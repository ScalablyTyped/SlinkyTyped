package typingsSlinky.awsSdkClientPinpointBrowser.getUserEndpointsExceptionsUnionMod

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
trait GetUserEndpointsExceptionsUnion extends js.Object

object GetUserEndpointsExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetUserEndpointsExceptionsUnion = value.asInstanceOf[GetUserEndpointsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetUserEndpointsExceptionsUnion = value.asInstanceOf[GetUserEndpointsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetUserEndpointsExceptionsUnion = value.asInstanceOf[GetUserEndpointsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetUserEndpointsExceptionsUnion = value.asInstanceOf[GetUserEndpointsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetUserEndpointsExceptionsUnion = value.asInstanceOf[GetUserEndpointsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetUserEndpointsExceptionsUnion = value.asInstanceOf[GetUserEndpointsExceptionsUnion]
}

