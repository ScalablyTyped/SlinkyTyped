package typingsSlinky.awsSdkClientDynamodbNode.batchGetItemExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
*/
trait BatchGetItemExceptionsUnion extends js.Object

object BatchGetItemExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): BatchGetItemExceptionsUnion = value.asInstanceOf[BatchGetItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): BatchGetItemExceptionsUnion = value.asInstanceOf[BatchGetItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): BatchGetItemExceptionsUnion = value.asInstanceOf[BatchGetItemExceptionsUnion]
}

