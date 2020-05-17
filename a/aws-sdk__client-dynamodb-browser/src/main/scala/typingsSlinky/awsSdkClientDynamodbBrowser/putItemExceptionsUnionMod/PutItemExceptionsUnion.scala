package typingsSlinky.awsSdkClientDynamodbBrowser.putItemExceptionsUnionMod

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

