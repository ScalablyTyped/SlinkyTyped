package typingsSlinky.awsSdkClientPinpointBrowser.phoneNumberValidateExceptionsUnionMod

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
trait PhoneNumberValidateExceptionsUnion extends js.Object

object PhoneNumberValidateExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): PhoneNumberValidateExceptionsUnion = value.asInstanceOf[PhoneNumberValidateExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): PhoneNumberValidateExceptionsUnion = value.asInstanceOf[PhoneNumberValidateExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): PhoneNumberValidateExceptionsUnion = value.asInstanceOf[PhoneNumberValidateExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): PhoneNumberValidateExceptionsUnion = value.asInstanceOf[PhoneNumberValidateExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): PhoneNumberValidateExceptionsUnion = value.asInstanceOf[PhoneNumberValidateExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): PhoneNumberValidateExceptionsUnion = value.asInstanceOf[PhoneNumberValidateExceptionsUnion]
}

