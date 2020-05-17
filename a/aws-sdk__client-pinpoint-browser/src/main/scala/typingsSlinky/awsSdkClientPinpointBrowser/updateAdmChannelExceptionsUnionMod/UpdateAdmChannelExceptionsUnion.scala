package typingsSlinky.awsSdkClientPinpointBrowser.updateAdmChannelExceptionsUnionMod

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
trait UpdateAdmChannelExceptionsUnion extends js.Object

object UpdateAdmChannelExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): UpdateAdmChannelExceptionsUnion = value.asInstanceOf[UpdateAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): UpdateAdmChannelExceptionsUnion = value.asInstanceOf[UpdateAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): UpdateAdmChannelExceptionsUnion = value.asInstanceOf[UpdateAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): UpdateAdmChannelExceptionsUnion = value.asInstanceOf[UpdateAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): UpdateAdmChannelExceptionsUnion = value.asInstanceOf[UpdateAdmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): UpdateAdmChannelExceptionsUnion = value.asInstanceOf[UpdateAdmChannelExceptionsUnion]
}

