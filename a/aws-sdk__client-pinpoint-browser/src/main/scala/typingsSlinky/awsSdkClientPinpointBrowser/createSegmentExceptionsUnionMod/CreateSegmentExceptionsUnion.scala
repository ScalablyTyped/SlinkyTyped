package typingsSlinky.awsSdkClientPinpointBrowser.createSegmentExceptionsUnionMod

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
trait CreateSegmentExceptionsUnion extends js.Object

object CreateSegmentExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): CreateSegmentExceptionsUnion = value.asInstanceOf[CreateSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): CreateSegmentExceptionsUnion = value.asInstanceOf[CreateSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): CreateSegmentExceptionsUnion = value.asInstanceOf[CreateSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): CreateSegmentExceptionsUnion = value.asInstanceOf[CreateSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): CreateSegmentExceptionsUnion = value.asInstanceOf[CreateSegmentExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): CreateSegmentExceptionsUnion = value.asInstanceOf[CreateSegmentExceptionsUnion]
}

