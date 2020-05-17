package typingsSlinky.awsSdkClientPinpointBrowser.getEndpointExceptionsUnionMod

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
trait GetEndpointExceptionsUnion extends js.Object

object GetEndpointExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetEndpointExceptionsUnion = value.asInstanceOf[GetEndpointExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetEndpointExceptionsUnion = value.asInstanceOf[GetEndpointExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetEndpointExceptionsUnion = value.asInstanceOf[GetEndpointExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetEndpointExceptionsUnion = value.asInstanceOf[GetEndpointExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetEndpointExceptionsUnion = value.asInstanceOf[GetEndpointExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetEndpointExceptionsUnion = value.asInstanceOf[GetEndpointExceptionsUnion]
}

