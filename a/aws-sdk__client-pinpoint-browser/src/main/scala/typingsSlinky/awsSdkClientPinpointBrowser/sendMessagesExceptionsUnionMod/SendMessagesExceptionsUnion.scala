package typingsSlinky.awsSdkClientPinpointBrowser.sendMessagesExceptionsUnionMod

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
trait SendMessagesExceptionsUnion extends js.Object

object SendMessagesExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): SendMessagesExceptionsUnion = value.asInstanceOf[SendMessagesExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): SendMessagesExceptionsUnion = value.asInstanceOf[SendMessagesExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): SendMessagesExceptionsUnion = value.asInstanceOf[SendMessagesExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): SendMessagesExceptionsUnion = value.asInstanceOf[SendMessagesExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): SendMessagesExceptionsUnion = value.asInstanceOf[SendMessagesExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): SendMessagesExceptionsUnion = value.asInstanceOf[SendMessagesExceptionsUnion]
}

