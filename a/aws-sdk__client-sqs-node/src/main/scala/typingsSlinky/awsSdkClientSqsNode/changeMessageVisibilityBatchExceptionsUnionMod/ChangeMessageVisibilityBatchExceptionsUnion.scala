package typingsSlinky.awsSdkClientSqsNode.changeMessageVisibilityBatchExceptionsUnionMod

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
trait ChangeMessageVisibilityBatchExceptionsUnion extends js.Object

object ChangeMessageVisibilityBatchExceptionsUnion {
  @scala.inline
  implicit def apply(value: BatchEntryIdsNotDistinct): ChangeMessageVisibilityBatchExceptionsUnion = value.asInstanceOf[ChangeMessageVisibilityBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: EmptyBatchRequest): ChangeMessageVisibilityBatchExceptionsUnion = value.asInstanceOf[ChangeMessageVisibilityBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidBatchEntryId): ChangeMessageVisibilityBatchExceptionsUnion = value.asInstanceOf[ChangeMessageVisibilityBatchExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyEntriesInBatchRequest): ChangeMessageVisibilityBatchExceptionsUnion = value.asInstanceOf[ChangeMessageVisibilityBatchExceptionsUnion]
}

