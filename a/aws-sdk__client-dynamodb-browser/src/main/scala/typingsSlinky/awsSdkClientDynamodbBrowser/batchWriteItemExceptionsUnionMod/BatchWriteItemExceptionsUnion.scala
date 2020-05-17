package typingsSlinky.awsSdkClientDynamodbBrowser.batchWriteItemExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
*/
trait BatchWriteItemExceptionsUnion extends js.Object

object BatchWriteItemExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): BatchWriteItemExceptionsUnion = value.asInstanceOf[BatchWriteItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ItemCollectionSizeLimitExceededException): BatchWriteItemExceptionsUnion = value.asInstanceOf[BatchWriteItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): BatchWriteItemExceptionsUnion = value.asInstanceOf[BatchWriteItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): BatchWriteItemExceptionsUnion = value.asInstanceOf[BatchWriteItemExceptionsUnion]
}

