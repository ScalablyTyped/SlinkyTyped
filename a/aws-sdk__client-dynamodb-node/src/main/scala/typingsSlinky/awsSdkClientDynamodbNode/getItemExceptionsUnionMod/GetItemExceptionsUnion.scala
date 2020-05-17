package typingsSlinky.awsSdkClientDynamodbNode.getItemExceptionsUnionMod

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
trait GetItemExceptionsUnion extends js.Object

object GetItemExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): GetItemExceptionsUnion = value.asInstanceOf[GetItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): GetItemExceptionsUnion = value.asInstanceOf[GetItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetItemExceptionsUnion = value.asInstanceOf[GetItemExceptionsUnion]
}

