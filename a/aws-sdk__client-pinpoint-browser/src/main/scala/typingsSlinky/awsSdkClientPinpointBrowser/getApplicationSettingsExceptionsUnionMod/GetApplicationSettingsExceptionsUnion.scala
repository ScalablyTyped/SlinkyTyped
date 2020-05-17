package typingsSlinky.awsSdkClientPinpointBrowser.getApplicationSettingsExceptionsUnionMod

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
trait GetApplicationSettingsExceptionsUnion extends js.Object

object GetApplicationSettingsExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetApplicationSettingsExceptionsUnion = value.asInstanceOf[GetApplicationSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetApplicationSettingsExceptionsUnion = value.asInstanceOf[GetApplicationSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetApplicationSettingsExceptionsUnion = value.asInstanceOf[GetApplicationSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetApplicationSettingsExceptionsUnion = value.asInstanceOf[GetApplicationSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetApplicationSettingsExceptionsUnion = value.asInstanceOf[GetApplicationSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetApplicationSettingsExceptionsUnion = value.asInstanceOf[GetApplicationSettingsExceptionsUnion]
}

