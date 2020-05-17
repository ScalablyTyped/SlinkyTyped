package typingsSlinky.awsSdkClientPinpointBrowser.getAdmChannelExceptionsUnionMod

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
trait GetAdmChannelExceptionsUnion extends js.Object

object GetAdmChannelExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetAdmChannelExceptionsUnion = value.asInstanceOf[GetAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetAdmChannelExceptionsUnion = value.asInstanceOf[GetAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetAdmChannelExceptionsUnion = value.asInstanceOf[GetAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetAdmChannelExceptionsUnion = value.asInstanceOf[GetAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetAdmChannelExceptionsUnion = value.asInstanceOf[GetAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetAdmChannelExceptionsUnion = value.asInstanceOf[GetAdmChannelExceptionsUnion]
}

