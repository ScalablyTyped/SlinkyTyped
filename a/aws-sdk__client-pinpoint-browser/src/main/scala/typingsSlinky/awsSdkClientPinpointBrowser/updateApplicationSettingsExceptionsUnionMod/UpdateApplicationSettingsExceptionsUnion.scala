package typingsSlinky.awsSdkClientPinpointBrowser.updateApplicationSettingsExceptionsUnionMod

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
trait UpdateApplicationSettingsExceptionsUnion extends js.Object

object UpdateApplicationSettingsExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): UpdateApplicationSettingsExceptionsUnion = value.asInstanceOf[UpdateApplicationSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): UpdateApplicationSettingsExceptionsUnion = value.asInstanceOf[UpdateApplicationSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): UpdateApplicationSettingsExceptionsUnion = value.asInstanceOf[UpdateApplicationSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): UpdateApplicationSettingsExceptionsUnion = value.asInstanceOf[UpdateApplicationSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): UpdateApplicationSettingsExceptionsUnion = value.asInstanceOf[UpdateApplicationSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): UpdateApplicationSettingsExceptionsUnion = value.asInstanceOf[UpdateApplicationSettingsExceptionsUnion]
}

