package typingsSlinky.awsSdkClientDynamodbNode.batchWriteItemExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException
import typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
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

