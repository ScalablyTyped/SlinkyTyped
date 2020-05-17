package typingsSlinky.awsSdkClientPinpointBrowser.getSegmentExportJobsExceptionsUnionMod

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
trait GetSegmentExportJobsExceptionsUnion extends js.Object

object GetSegmentExportJobsExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetSegmentExportJobsExceptionsUnion = value.asInstanceOf[GetSegmentExportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetSegmentExportJobsExceptionsUnion = value.asInstanceOf[GetSegmentExportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetSegmentExportJobsExceptionsUnion = value.asInstanceOf[GetSegmentExportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetSegmentExportJobsExceptionsUnion = value.asInstanceOf[GetSegmentExportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetSegmentExportJobsExceptionsUnion = value.asInstanceOf[GetSegmentExportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetSegmentExportJobsExceptionsUnion = value.asInstanceOf[GetSegmentExportJobsExceptionsUnion]
}

