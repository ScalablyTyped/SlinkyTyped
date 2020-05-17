package typingsSlinky.awsSdkClientDynamodbNode.deleteItemExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesConditionalCheckFailedExceptionMod.ConditionalCheckFailedException
import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException
import typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesConditionalCheckFailedExceptionMod.ConditionalCheckFailedException
  - typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
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

