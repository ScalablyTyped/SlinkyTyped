package typingsSlinky.awsSdkClientDynamodbBrowser.updateItemExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesConditionalCheckFailedExceptionMod.ConditionalCheckFailedException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesConditionalCheckFailedExceptionMod.ConditionalCheckFailedException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
*/
trait UpdateItemExceptionsUnion extends js.Object

object UpdateItemExceptionsUnion {
  @scala.inline
  implicit def apply(value: ConditionalCheckFailedException): UpdateItemExceptionsUnion = value.asInstanceOf[UpdateItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): UpdateItemExceptionsUnion = value.asInstanceOf[UpdateItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ItemCollectionSizeLimitExceededException): UpdateItemExceptionsUnion = value.asInstanceOf[UpdateItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): UpdateItemExceptionsUnion = value.asInstanceOf[UpdateItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): UpdateItemExceptionsUnion = value.asInstanceOf[UpdateItemExceptionsUnion]
}

