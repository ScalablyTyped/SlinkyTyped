package typingsSlinky.awsSdkClientDynamodbBrowser.updateTimeToLiveExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
*/
trait UpdateTimeToLiveExceptionsUnion extends js.Object

object UpdateTimeToLiveExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): UpdateTimeToLiveExceptionsUnion = value.asInstanceOf[UpdateTimeToLiveExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): UpdateTimeToLiveExceptionsUnion = value.asInstanceOf[UpdateTimeToLiveExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): UpdateTimeToLiveExceptionsUnion = value.asInstanceOf[UpdateTimeToLiveExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): UpdateTimeToLiveExceptionsUnion = value.asInstanceOf[UpdateTimeToLiveExceptionsUnion]
}

