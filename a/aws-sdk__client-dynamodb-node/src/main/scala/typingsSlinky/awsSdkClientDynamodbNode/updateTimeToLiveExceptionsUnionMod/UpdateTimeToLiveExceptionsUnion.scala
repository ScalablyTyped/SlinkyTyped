package typingsSlinky.awsSdkClientDynamodbNode.updateTimeToLiveExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
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

