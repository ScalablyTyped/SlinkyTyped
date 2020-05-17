package typingsSlinky.awsSdkClientPinpointBrowser.deleteEventStreamExceptionsUnionMod

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
trait DeleteEventStreamExceptionsUnion extends js.Object

object DeleteEventStreamExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): DeleteEventStreamExceptionsUnion = value.asInstanceOf[DeleteEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): DeleteEventStreamExceptionsUnion = value.asInstanceOf[DeleteEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): DeleteEventStreamExceptionsUnion = value.asInstanceOf[DeleteEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): DeleteEventStreamExceptionsUnion = value.asInstanceOf[DeleteEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DeleteEventStreamExceptionsUnion = value.asInstanceOf[DeleteEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteEventStreamExceptionsUnion = value.asInstanceOf[DeleteEventStreamExceptionsUnion]
}

