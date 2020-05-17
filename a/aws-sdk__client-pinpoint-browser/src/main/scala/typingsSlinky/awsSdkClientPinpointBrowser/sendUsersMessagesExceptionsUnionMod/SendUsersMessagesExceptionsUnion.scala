package typingsSlinky.awsSdkClientPinpointBrowser.sendUsersMessagesExceptionsUnionMod

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
trait SendUsersMessagesExceptionsUnion extends js.Object

object SendUsersMessagesExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): SendUsersMessagesExceptionsUnion = value.asInstanceOf[SendUsersMessagesExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): SendUsersMessagesExceptionsUnion = value.asInstanceOf[SendUsersMessagesExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): SendUsersMessagesExceptionsUnion = value.asInstanceOf[SendUsersMessagesExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): SendUsersMessagesExceptionsUnion = value.asInstanceOf[SendUsersMessagesExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): SendUsersMessagesExceptionsUnion = value.asInstanceOf[SendUsersMessagesExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): SendUsersMessagesExceptionsUnion = value.asInstanceOf[SendUsersMessagesExceptionsUnion]
}

