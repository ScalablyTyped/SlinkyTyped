package typingsSlinky.awsSdkClientPinpointBrowser.updateEndpointsBatchExceptionsUnionMod

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
trait UpdateEndpointsBatchExceptionsUnion extends js.Object

object UpdateEndpointsBatchExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): UpdateEndpointsBatchExceptionsUnion = value.asInstanceOf[UpdateEndpointsBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): UpdateEndpointsBatchExceptionsUnion = value.asInstanceOf[UpdateEndpointsBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): UpdateEndpointsBatchExceptionsUnion = value.asInstanceOf[UpdateEndpointsBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): UpdateEndpointsBatchExceptionsUnion = value.asInstanceOf[UpdateEndpointsBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): UpdateEndpointsBatchExceptionsUnion = value.asInstanceOf[UpdateEndpointsBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): UpdateEndpointsBatchExceptionsUnion = value.asInstanceOf[UpdateEndpointsBatchExceptionsUnion]
}

