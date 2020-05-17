package typingsSlinky.awsSdkClientPinpointBrowser.getApnsChannelExceptionsUnionMod

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
trait GetApnsChannelExceptionsUnion extends js.Object

object GetApnsChannelExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetApnsChannelExceptionsUnion = value.asInstanceOf[GetApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetApnsChannelExceptionsUnion = value.asInstanceOf[GetApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetApnsChannelExceptionsUnion = value.asInstanceOf[GetApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetApnsChannelExceptionsUnion = value.asInstanceOf[GetApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetApnsChannelExceptionsUnion = value.asInstanceOf[GetApnsChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetApnsChannelExceptionsUnion = value.asInstanceOf[GetApnsChannelExceptionsUnion]
}

