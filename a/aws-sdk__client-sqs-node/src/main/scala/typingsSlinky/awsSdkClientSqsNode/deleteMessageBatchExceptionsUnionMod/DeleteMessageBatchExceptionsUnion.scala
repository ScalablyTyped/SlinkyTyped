package typingsSlinky.awsSdkClientSqsNode.deleteMessageBatchExceptionsUnionMod

import typingsSlinky.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct
import typingsSlinky.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest
import typingsSlinky.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId
import typingsSlinky.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest
  - typingsSlinky.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest
  - typingsSlinky.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct
  - typingsSlinky.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId
*/
trait DeleteMessageBatchExceptionsUnion extends js.Object

object DeleteMessageBatchExceptionsUnion {
  @scala.inline
  implicit def apply(value: BatchEntryIdsNotDistinct): DeleteMessageBatchExceptionsUnion = value.asInstanceOf[DeleteMessageBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: EmptyBatchRequest): DeleteMessageBatchExceptionsUnion = value.asInstanceOf[DeleteMessageBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidBatchEntryId): DeleteMessageBatchExceptionsUnion = value.asInstanceOf[DeleteMessageBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyEntriesInBatchRequest): DeleteMessageBatchExceptionsUnion = value.asInstanceOf[DeleteMessageBatchExceptionsUnion]
}

