package typingsSlinky.awsSdkClientPinpointBrowser.createAppExceptionsUnionMod

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
trait CreateAppExceptionsUnion extends js.Object

object CreateAppExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): CreateAppExceptionsUnion = value.asInstanceOf[CreateAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): CreateAppExceptionsUnion = value.asInstanceOf[CreateAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): CreateAppExceptionsUnion = value.asInstanceOf[CreateAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): CreateAppExceptionsUnion = value.asInstanceOf[CreateAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): CreateAppExceptionsUnion = value.asInstanceOf[CreateAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): CreateAppExceptionsUnion = value.asInstanceOf[CreateAppExceptionsUnion]
}

