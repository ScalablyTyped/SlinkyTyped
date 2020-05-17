package typingsSlinky.awsSdkClientPinpointBrowser.updateEndpointExceptionsUnionMod

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
trait UpdateEndpointExceptionsUnion extends js.Object

object UpdateEndpointExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): UpdateEndpointExceptionsUnion = value.asInstanceOf[UpdateEndpointExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): UpdateEndpointExceptionsUnion = value.asInstanceOf[UpdateEndpointExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): UpdateEndpointExceptionsUnion = value.asInstanceOf[UpdateEndpointExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): UpdateEndpointExceptionsUnion = value.asInstanceOf[UpdateEndpointExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): UpdateEndpointExceptionsUnion = value.asInstanceOf[UpdateEndpointExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): UpdateEndpointExceptionsUnion = value.asInstanceOf[UpdateEndpointExceptionsUnion]
}

