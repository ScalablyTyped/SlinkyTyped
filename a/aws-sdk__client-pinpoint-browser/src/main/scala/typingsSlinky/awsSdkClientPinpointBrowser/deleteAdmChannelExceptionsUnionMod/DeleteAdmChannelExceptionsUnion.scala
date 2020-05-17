package typingsSlinky.awsSdkClientPinpointBrowser.deleteAdmChannelExceptionsUnionMod

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
trait DeleteAdmChannelExceptionsUnion extends js.Object

object DeleteAdmChannelExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): DeleteAdmChannelExceptionsUnion = value.asInstanceOf[DeleteAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): DeleteAdmChannelExceptionsUnion = value.asInstanceOf[DeleteAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): DeleteAdmChannelExceptionsUnion = value.asInstanceOf[DeleteAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): DeleteAdmChannelExceptionsUnion = value.asInstanceOf[DeleteAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DeleteAdmChannelExceptionsUnion = value.asInstanceOf[DeleteAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteAdmChannelExceptionsUnion = value.asInstanceOf[DeleteAdmChannelExceptionsUnion]
}

