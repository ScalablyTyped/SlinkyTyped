package typingsSlinky.awsSdkClientPinpointBrowser.deleteBaiduChannelExceptionsUnionMod

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
trait DeleteBaiduChannelExceptionsUnion extends js.Object

object DeleteBaiduChannelExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): DeleteBaiduChannelExceptionsUnion = value.asInstanceOf[DeleteBaiduChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): DeleteBaiduChannelExceptionsUnion = value.asInstanceOf[DeleteBaiduChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): DeleteBaiduChannelExceptionsUnion = value.asInstanceOf[DeleteBaiduChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): DeleteBaiduChannelExceptionsUnion = value.asInstanceOf[DeleteBaiduChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DeleteBaiduChannelExceptionsUnion = value.asInstanceOf[DeleteBaiduChannelExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): DeleteBaiduChannelExceptionsUnion = value.asInstanceOf[DeleteBaiduChannelExceptionsUnion]
}

