package typingsSlinky.awsSdkClientPinpointBrowser.getImportJobExceptionsUnionMod

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
trait GetImportJobExceptionsUnion extends js.Object

object GetImportJobExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetImportJobExceptionsUnion = value.asInstanceOf[GetImportJobExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetImportJobExceptionsUnion = value.asInstanceOf[GetImportJobExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetImportJobExceptionsUnion = value.asInstanceOf[GetImportJobExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetImportJobExceptionsUnion = value.asInstanceOf[GetImportJobExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetImportJobExceptionsUnion = value.asInstanceOf[GetImportJobExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetImportJobExceptionsUnion = value.asInstanceOf[GetImportJobExceptionsUnion]
}

