package typingsSlinky.awsSdkClientPinpointBrowser.getSegmentsExceptionsUnionMod

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
trait GetSegmentsExceptionsUnion extends js.Object

object GetSegmentsExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetSegmentsExceptionsUnion = value.asInstanceOf[GetSegmentsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetSegmentsExceptionsUnion = value.asInstanceOf[GetSegmentsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetSegmentsExceptionsUnion = value.asInstanceOf[GetSegmentsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetSegmentsExceptionsUnion = value.asInstanceOf[GetSegmentsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetSegmentsExceptionsUnion = value.asInstanceOf[GetSegmentsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetSegmentsExceptionsUnion = value.asInstanceOf[GetSegmentsExceptionsUnion]
}

