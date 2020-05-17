package typingsSlinky.awsSdkClientPinpointBrowser.getExportJobsExceptionsUnionMod

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
trait GetExportJobsExceptionsUnion extends js.Object

object GetExportJobsExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetExportJobsExceptionsUnion = value.asInstanceOf[GetExportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetExportJobsExceptionsUnion = value.asInstanceOf[GetExportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetExportJobsExceptionsUnion = value.asInstanceOf[GetExportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetExportJobsExceptionsUnion = value.asInstanceOf[GetExportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetExportJobsExceptionsUnion = value.asInstanceOf[GetExportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetExportJobsExceptionsUnion = value.asInstanceOf[GetExportJobsExceptionsUnion]
}

