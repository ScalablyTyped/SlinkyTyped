package typingsSlinky.awsSdkClientPinpointBrowser.updateSmsChannelExceptionsUnionMod

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
trait UpdateSmsChannelExceptionsUnion extends js.Object

object UpdateSmsChannelExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): UpdateSmsChannelExceptionsUnion = value.asInstanceOf[UpdateSmsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): UpdateSmsChannelExceptionsUnion = value.asInstanceOf[UpdateSmsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): UpdateSmsChannelExceptionsUnion = value.asInstanceOf[UpdateSmsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): UpdateSmsChannelExceptionsUnion = value.asInstanceOf[UpdateSmsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): UpdateSmsChannelExceptionsUnion = value.asInstanceOf[UpdateSmsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): UpdateSmsChannelExceptionsUnion = value.asInstanceOf[UpdateSmsChannelExceptionsUnion]
}

