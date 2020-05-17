package typingsSlinky.awsSdkClientPinpointBrowser.updateSegmentExceptionsUnionMod

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
trait UpdateSegmentExceptionsUnion extends js.Object

object UpdateSegmentExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): UpdateSegmentExceptionsUnion = value.asInstanceOf[UpdateSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): UpdateSegmentExceptionsUnion = value.asInstanceOf[UpdateSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): UpdateSegmentExceptionsUnion = value.asInstanceOf[UpdateSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): UpdateSegmentExceptionsUnion = value.asInstanceOf[UpdateSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): UpdateSegmentExceptionsUnion = value.asInstanceOf[UpdateSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): UpdateSegmentExceptionsUnion = value.asInstanceOf[UpdateSegmentExceptionsUnion]
}

