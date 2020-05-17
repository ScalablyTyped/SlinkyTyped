package typingsSlinky.awsSdkClientPinpointBrowser.getCampaignVersionExceptionsUnionMod

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
trait GetCampaignVersionExceptionsUnion extends js.Object

object GetCampaignVersionExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetCampaignVersionExceptionsUnion = value.asInstanceOf[GetCampaignVersionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetCampaignVersionExceptionsUnion = value.asInstanceOf[GetCampaignVersionExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetCampaignVersionExceptionsUnion = value.asInstanceOf[GetCampaignVersionExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetCampaignVersionExceptionsUnion = value.asInstanceOf[GetCampaignVersionExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetCampaignVersionExceptionsUnion = value.asInstanceOf[GetCampaignVersionExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetCampaignVersionExceptionsUnion = value.asInstanceOf[GetCampaignVersionExceptionsUnion]
}

