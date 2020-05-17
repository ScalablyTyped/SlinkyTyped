package typingsSlinky.awsSdkClientPinpointBrowser.deleteSmsChannelExceptionsUnionMod

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
trait DeleteSmsChannelExceptionsUnion extends js.Object

object DeleteSmsChannelExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): DeleteSmsChannelExceptionsUnion = value.asInstanceOf[DeleteSmsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): DeleteSmsChannelExceptionsUnion = value.asInstanceOf[DeleteSmsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): DeleteSmsChannelExceptionsUnion = value.asInstanceOf[DeleteSmsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): DeleteSmsChannelExceptionsUnion = value.asInstanceOf[DeleteSmsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DeleteSmsChannelExceptionsUnion = value.asInstanceOf[DeleteSmsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteSmsChannelExceptionsUnion = value.asInstanceOf[DeleteSmsChannelExceptionsUnion]
}

