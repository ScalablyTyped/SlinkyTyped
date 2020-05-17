package typingsSlinky.awsSdkClientPinpointBrowser.createCampaignExceptionsUnionMod

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
trait CreateCampaignExceptionsUnion extends js.Object

object CreateCampaignExceptionsUnion {
  @scala.inline
  implicit def apply(value: BadRequestException): CreateCampaignExceptionsUnion = value.asInstanceOf[CreateCampaignExceptionsUnion]
  @scala.inline
  implicit def apply(value: ForbiddenException): CreateCampaignExceptionsUnion = value.asInstanceOf[CreateCampaignExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerErrorException): CreateCampaignExceptionsUnion = value.asInstanceOf[CreateCampaignExceptionsUnion]
  @scala.inline
  implicit def apply(value: MethodNotAllowedException): CreateCampaignExceptionsUnion = value.asInstanceOf[CreateCampaignExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): CreateCampaignExceptionsUnion = value.asInstanceOf[CreateCampaignExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): CreateCampaignExceptionsUnion = value.asInstanceOf[CreateCampaignExceptionsUnion]
}

