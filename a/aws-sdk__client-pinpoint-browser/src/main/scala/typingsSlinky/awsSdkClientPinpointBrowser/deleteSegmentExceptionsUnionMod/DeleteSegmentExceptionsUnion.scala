package typingsSlinky.awsSdkClientPinpointBrowser.deleteSegmentExceptionsUnionMod

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
trait DeleteSegmentExceptionsUnion extends js.Object

object DeleteSegmentExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): DeleteSegmentExceptionsUnion = value.asInstanceOf[DeleteSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): DeleteSegmentExceptionsUnion = value.asInstanceOf[DeleteSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): DeleteSegmentExceptionsUnion = value.asInstanceOf[DeleteSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): DeleteSegmentExceptionsUnion = value.asInstanceOf[DeleteSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DeleteSegmentExceptionsUnion = value.asInstanceOf[DeleteSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteSegmentExceptionsUnion = value.asInstanceOf[DeleteSegmentExceptionsUnion]
}

