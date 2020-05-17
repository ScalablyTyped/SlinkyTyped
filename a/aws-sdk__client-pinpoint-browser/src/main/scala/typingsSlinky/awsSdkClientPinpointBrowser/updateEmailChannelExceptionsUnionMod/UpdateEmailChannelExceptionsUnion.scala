package typingsSlinky.awsSdkClientPinpointBrowser.updateEmailChannelExceptionsUnionMod

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
trait UpdateEmailChannelExceptionsUnion extends js.Object

object UpdateEmailChannelExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): UpdateEmailChannelExceptionsUnion = value.asInstanceOf[UpdateEmailChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): UpdateEmailChannelExceptionsUnion = value.asInstanceOf[UpdateEmailChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): UpdateEmailChannelExceptionsUnion = value.asInstanceOf[UpdateEmailChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): UpdateEmailChannelExceptionsUnion = value.asInstanceOf[UpdateEmailChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): UpdateEmailChannelExceptionsUnion = value.asInstanceOf[UpdateEmailChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): UpdateEmailChannelExceptionsUnion = value.asInstanceOf[UpdateEmailChannelExceptionsUnion]
}

