package typingsSlinky.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod

import typingsSlinky.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct
import typingsSlinky.awsSdkClientSqsNode.typesBatchRequestTooLongMod.BatchRequestTooLong
import typingsSlinky.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest
import typingsSlinky.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId
import typingsSlinky.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest
import typingsSlinky.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest
  - typingsSlinky.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest
  - typingsSlinky.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct
  - typingsSlinky.awsSdkClientSqsNode.typesBatchRequestTooLongMod.BatchRequestTooLong
  - typingsSlinky.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId
  - typingsSlinky.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation
*/
trait SendMessageBatchExceptionsUnion extends js.Object

object SendMessageBatchExceptionsUnion {
  @scala.inline
  implicit def apply(value: BatchEntryIdsNotDistinct): SendMessageBatchExceptionsUnion = value.asInstanceOf[SendMessageBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: BatchRequestTooLong): SendMessageBatchExceptionsUnion = value.asInstanceOf[SendMessageBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: EmptyBatchRequest): SendMessageBatchExceptionsUnion = value.asInstanceOf[SendMessageBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidBatchEntryId): SendMessageBatchExceptionsUnion = value.asInstanceOf[SendMessageBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyEntriesInBatchRequest): SendMessageBatchExceptionsUnion = value.asInstanceOf[SendMessageBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: UnsupportedOperation): SendMessageBatchExceptionsUnion = value.asInstanceOf[SendMessageBatchExceptionsUnion]
}

