package typingsSlinky.awsSdkClientPinpointBrowser.getCampaignExceptionsUnionMod

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
trait GetCampaignExceptionsUnion extends js.Object

object GetCampaignExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetCampaignExceptionsUnion = value.asInstanceOf[GetCampaignExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetCampaignExceptionsUnion = value.asInstanceOf[GetCampaignExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetCampaignExceptionsUnion = value.asInstanceOf[GetCampaignExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetCampaignExceptionsUnion = value.asInstanceOf[GetCampaignExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetCampaignExceptionsUnion = value.asInstanceOf[GetCampaignExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetCampaignExceptionsUnion = value.asInstanceOf[GetCampaignExceptionsUnion]
}

