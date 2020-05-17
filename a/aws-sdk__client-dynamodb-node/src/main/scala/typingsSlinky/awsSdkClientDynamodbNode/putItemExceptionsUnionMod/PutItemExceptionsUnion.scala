package typingsSlinky.awsSdkClientDynamodbNode.putItemExceptionsUnionMod

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
trait PutItemExceptionsUnion extends js.Object

object PutItemExceptionsUnion {
  @scala.inline
  implicit def apply(value: ConditionalCheckFailedException): PutItemExceptionsUnion = value.asInstanceOf[PutItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): PutItemExceptionsUnion = value.asInstanceOf[PutItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ItemCollectionSizeLimitExceededException): PutItemExceptionsUnion = value.asInstanceOf[PutItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): PutItemExceptionsUnion = value.asInstanceOf[PutItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): PutItemExceptionsUnion = value.asInstanceOf[PutItemExceptionsUnion]
}

