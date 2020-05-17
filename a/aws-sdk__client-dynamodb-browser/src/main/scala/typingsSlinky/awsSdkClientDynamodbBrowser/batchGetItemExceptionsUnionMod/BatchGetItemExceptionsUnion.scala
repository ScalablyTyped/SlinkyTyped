package typingsSlinky.awsSdkClientDynamodbBrowser.batchGetItemExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
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

