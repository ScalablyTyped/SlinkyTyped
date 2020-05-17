package typingsSlinky.awsSdkClientPinpointBrowser.getAppsExceptionsUnionMod

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
trait GetAppsExceptionsUnion extends js.Object

object GetAppsExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetAppsExceptionsUnion = value.asInstanceOf[GetAppsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetAppsExceptionsUnion = value.asInstanceOf[GetAppsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetAppsExceptionsUnion = value.asInstanceOf[GetAppsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetAppsExceptionsUnion = value.asInstanceOf[GetAppsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetAppsExceptionsUnion = value.asInstanceOf[GetAppsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetAppsExceptionsUnion = value.asInstanceOf[GetAppsExceptionsUnion]
}

