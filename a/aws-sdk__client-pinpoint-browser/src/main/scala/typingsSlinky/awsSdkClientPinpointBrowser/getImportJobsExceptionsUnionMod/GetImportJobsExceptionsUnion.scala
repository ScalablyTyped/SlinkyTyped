package typingsSlinky.awsSdkClientPinpointBrowser.getImportJobsExceptionsUnionMod

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
trait GetImportJobsExceptionsUnion extends js.Object

object GetImportJobsExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetImportJobsExceptionsUnion = value.asInstanceOf[GetImportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetImportJobsExceptionsUnion = value.asInstanceOf[GetImportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetImportJobsExceptionsUnion = value.asInstanceOf[GetImportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetImportJobsExceptionsUnion = value.asInstanceOf[GetImportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetImportJobsExceptionsUnion = value.asInstanceOf[GetImportJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetImportJobsExceptionsUnion = value.asInstanceOf[GetImportJobsExceptionsUnion]
}

