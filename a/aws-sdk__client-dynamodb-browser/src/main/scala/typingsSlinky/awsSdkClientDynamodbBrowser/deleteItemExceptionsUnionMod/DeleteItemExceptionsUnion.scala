package typingsSlinky.awsSdkClientDynamodbBrowser.deleteItemExceptionsUnionMod

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
trait DeleteItemExceptionsUnion extends js.Object

object DeleteItemExceptionsUnion {
  @scala.inline
  implicit def apply(value: ConditionalCheckFailedException): DeleteItemExceptionsUnion = value.asInstanceOf[DeleteItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): DeleteItemExceptionsUnion = value.asInstanceOf[DeleteItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ItemCollectionSizeLimitExceededException): DeleteItemExceptionsUnion = value.asInstanceOf[DeleteItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): DeleteItemExceptionsUnion = value.asInstanceOf[DeleteItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DeleteItemExceptionsUnion = value.asInstanceOf[DeleteItemExceptionsUnion]
}

