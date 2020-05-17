package typingsSlinky.awsSdkClientDynamodbNode.updateItemExceptionsUnionMod

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

