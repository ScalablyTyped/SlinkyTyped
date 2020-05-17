package typingsSlinky.awsSdkClientPinpointBrowser.getAppExceptionsUnionMod

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
trait GetAppExceptionsUnion extends js.Object

object GetAppExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetAppExceptionsUnion = value.asInstanceOf[GetAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetAppExceptionsUnion = value.asInstanceOf[GetAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetAppExceptionsUnion = value.asInstanceOf[GetAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetAppExceptionsUnion = value.asInstanceOf[GetAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetAppExceptionsUnion = value.asInstanceOf[GetAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetAppExceptionsUnion = value.asInstanceOf[GetAppExceptionsUnion]
}

