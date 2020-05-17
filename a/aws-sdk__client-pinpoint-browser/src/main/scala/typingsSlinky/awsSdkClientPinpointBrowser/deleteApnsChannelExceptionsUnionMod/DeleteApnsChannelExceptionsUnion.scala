package typingsSlinky.awsSdkClientPinpointBrowser.deleteApnsChannelExceptionsUnionMod

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
trait DeleteApnsChannelExceptionsUnion extends js.Object

object DeleteApnsChannelExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): DeleteApnsChannelExceptionsUnion = value.asInstanceOf[DeleteApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): DeleteApnsChannelExceptionsUnion = value.asInstanceOf[DeleteApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): DeleteApnsChannelExceptionsUnion = value.asInstanceOf[DeleteApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): DeleteApnsChannelExceptionsUnion = value.asInstanceOf[DeleteApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DeleteApnsChannelExceptionsUnion = value.asInstanceOf[DeleteApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteApnsChannelExceptionsUnion = value.asInstanceOf[DeleteApnsChannelExceptionsUnion]
}

