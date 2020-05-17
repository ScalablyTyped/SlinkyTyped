package typingsSlinky.awsSdkClientPinpointBrowser.getGcmChannelExceptionsUnionMod

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
trait GetGcmChannelExceptionsUnion extends js.Object

object GetGcmChannelExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetGcmChannelExceptionsUnion = value.asInstanceOf[GetGcmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetGcmChannelExceptionsUnion = value.asInstanceOf[GetGcmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetGcmChannelExceptionsUnion = value.asInstanceOf[GetGcmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetGcmChannelExceptionsUnion = value.asInstanceOf[GetGcmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetGcmChannelExceptionsUnion = value.asInstanceOf[GetGcmChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetGcmChannelExceptionsUnion = value.asInstanceOf[GetGcmChannelExceptionsUnion]
}

