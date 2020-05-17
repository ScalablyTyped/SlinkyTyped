package typingsSlinky.awsSdkClientPinpointBrowser.getSegmentExceptionsUnionMod

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
trait GetSegmentExceptionsUnion extends js.Object

object GetSegmentExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetSegmentExceptionsUnion = value.asInstanceOf[GetSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetSegmentExceptionsUnion = value.asInstanceOf[GetSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetSegmentExceptionsUnion = value.asInstanceOf[GetSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetSegmentExceptionsUnion = value.asInstanceOf[GetSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetSegmentExceptionsUnion = value.asInstanceOf[GetSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetSegmentExceptionsUnion = value.asInstanceOf[GetSegmentExceptionsUnion]
}

