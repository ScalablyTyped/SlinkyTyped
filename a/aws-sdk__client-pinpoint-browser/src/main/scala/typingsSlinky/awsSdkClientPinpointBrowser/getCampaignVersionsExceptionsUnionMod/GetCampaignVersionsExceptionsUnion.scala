package typingsSlinky.awsSdkClientPinpointBrowser.getCampaignVersionsExceptionsUnionMod

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
trait GetCampaignVersionsExceptionsUnion extends js.Object

object GetCampaignVersionsExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): GetCampaignVersionsExceptionsUnion = value.asInstanceOf[GetCampaignVersionsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): GetCampaignVersionsExceptionsUnion = value.asInstanceOf[GetCampaignVersionsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): GetCampaignVersionsExceptionsUnion = value.asInstanceOf[GetCampaignVersionsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): GetCampaignVersionsExceptionsUnion = value.asInstanceOf[GetCampaignVersionsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetCampaignVersionsExceptionsUnion = value.asInstanceOf[GetCampaignVersionsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): GetCampaignVersionsExceptionsUnion = value.asInstanceOf[GetCampaignVersionsExceptionsUnion]
}

