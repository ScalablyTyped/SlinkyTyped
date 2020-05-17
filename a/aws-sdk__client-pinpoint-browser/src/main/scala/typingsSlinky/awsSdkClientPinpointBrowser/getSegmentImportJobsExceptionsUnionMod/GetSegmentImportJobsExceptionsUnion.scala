package typingsSlinky.awsSdkClientPinpointBrowser.getSegmentImportJobsExceptionsUnionMod

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
trait GetSegmentImportJobsExceptionsUnion extends js.Object

object GetSegmentImportJobsExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetSegmentImportJobsExceptionsUnion = value.asInstanceOf[GetSegmentImportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetSegmentImportJobsExceptionsUnion = value.asInstanceOf[GetSegmentImportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetSegmentImportJobsExceptionsUnion = value.asInstanceOf[GetSegmentImportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetSegmentImportJobsExceptionsUnion = value.asInstanceOf[GetSegmentImportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetSegmentImportJobsExceptionsUnion = value.asInstanceOf[GetSegmentImportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetSegmentImportJobsExceptionsUnion = value.asInstanceOf[GetSegmentImportJobsExceptionsUnion]
}

