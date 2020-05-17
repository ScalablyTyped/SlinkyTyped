package typingsSlinky.awsSdkClientPinpointBrowser.putEventStreamExceptionsUnionMod

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
trait PutEventStreamExceptionsUnion extends js.Object

object PutEventStreamExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): PutEventStreamExceptionsUnion = value.asInstanceOf[PutEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): PutEventStreamExceptionsUnion = value.asInstanceOf[PutEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): PutEventStreamExceptionsUnion = value.asInstanceOf[PutEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): PutEventStreamExceptionsUnion = value.asInstanceOf[PutEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): PutEventStreamExceptionsUnion = value.asInstanceOf[PutEventStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): PutEventStreamExceptionsUnion = value.asInstanceOf[PutEventStreamExceptionsUnion]
}

