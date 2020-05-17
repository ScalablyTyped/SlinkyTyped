package typingsSlinky.awsSdkClientPinpointBrowser.deleteGcmChannelExceptionsUnionMod

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
trait DeleteGcmChannelExceptionsUnion extends js.Object

object DeleteGcmChannelExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): DeleteGcmChannelExceptionsUnion = value.asInstanceOf[DeleteGcmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): DeleteGcmChannelExceptionsUnion = value.asInstanceOf[DeleteGcmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): DeleteGcmChannelExceptionsUnion = value.asInstanceOf[DeleteGcmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): DeleteGcmChannelExceptionsUnion = value.asInstanceOf[DeleteGcmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DeleteGcmChannelExceptionsUnion = value.asInstanceOf[DeleteGcmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteGcmChannelExceptionsUnion = value.asInstanceOf[DeleteGcmChannelExceptionsUnion]
}

