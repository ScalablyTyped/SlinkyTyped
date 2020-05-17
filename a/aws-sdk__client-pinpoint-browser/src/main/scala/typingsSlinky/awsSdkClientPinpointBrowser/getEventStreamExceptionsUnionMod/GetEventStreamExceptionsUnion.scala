package typingsSlinky.awsSdkClientPinpointBrowser.getEventStreamExceptionsUnionMod

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
trait GetEventStreamExceptionsUnion extends js.Object

object GetEventStreamExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetEventStreamExceptionsUnion = value.asInstanceOf[GetEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetEventStreamExceptionsUnion = value.asInstanceOf[GetEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetEventStreamExceptionsUnion = value.asInstanceOf[GetEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetEventStreamExceptionsUnion = value.asInstanceOf[GetEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetEventStreamExceptionsUnion = value.asInstanceOf[GetEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetEventStreamExceptionsUnion = value.asInstanceOf[GetEventStreamExceptionsUnion]
}

