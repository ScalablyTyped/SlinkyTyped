package typingsSlinky.awsSdkClientPinpointBrowser.updateApnsChannelExceptionsUnionMod

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
trait UpdateApnsChannelExceptionsUnion extends js.Object

object UpdateApnsChannelExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): UpdateApnsChannelExceptionsUnion = value.asInstanceOf[UpdateApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): UpdateApnsChannelExceptionsUnion = value.asInstanceOf[UpdateApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): UpdateApnsChannelExceptionsUnion = value.asInstanceOf[UpdateApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): UpdateApnsChannelExceptionsUnion = value.asInstanceOf[UpdateApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): UpdateApnsChannelExceptionsUnion = value.asInstanceOf[UpdateApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): UpdateApnsChannelExceptionsUnion = value.asInstanceOf[UpdateApnsChannelExceptionsUnion]
}

