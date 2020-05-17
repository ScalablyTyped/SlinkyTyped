package typingsSlinky.awsSdkClientDynamodbNode.queryExceptionsUnionMod

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
trait QueryExceptionsUnion extends js.Object

object QueryExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): QueryExceptionsUnion = value.asInstanceOf[QueryExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): QueryExceptionsUnion = value.asInstanceOf[QueryExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): QueryExceptionsUnion = value.asInstanceOf[QueryExceptionsUnion]
}

