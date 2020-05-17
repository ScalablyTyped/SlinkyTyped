package typingsSlinky.awsSdkClientPinpointBrowser.putEventsExceptionsUnionMod

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
trait PutEventsExceptionsUnion extends js.Object

object PutEventsExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): PutEventsExceptionsUnion = value.asInstanceOf[PutEventsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): PutEventsExceptionsUnion = value.asInstanceOf[PutEventsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): PutEventsExceptionsUnion = value.asInstanceOf[PutEventsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): PutEventsExceptionsUnion = value.asInstanceOf[PutEventsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): PutEventsExceptionsUnion = value.asInstanceOf[PutEventsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): PutEventsExceptionsUnion = value.asInstanceOf[PutEventsExceptionsUnion]
}

