package typingsSlinky.awsSdkClientPinpointBrowser.deleteAppExceptionsUnionMod

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
trait DeleteAppExceptionsUnion extends js.Object

object DeleteAppExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): DeleteAppExceptionsUnion = value.asInstanceOf[DeleteAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): DeleteAppExceptionsUnion = value.asInstanceOf[DeleteAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): DeleteAppExceptionsUnion = value.asInstanceOf[DeleteAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): DeleteAppExceptionsUnion = value.asInstanceOf[DeleteAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DeleteAppExceptionsUnion = value.asInstanceOf[DeleteAppExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteAppExceptionsUnion = value.asInstanceOf[DeleteAppExceptionsUnion]
}

