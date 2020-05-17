package typingsSlinky.awsSdkClientDynamodbBrowser.queryExceptionsUnionMod

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
trait QueryExceptionsUnion extends js.Object

object QueryExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): QueryExceptionsUnion = value.asInstanceOf[QueryExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): QueryExceptionsUnion = value.asInstanceOf[QueryExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): QueryExceptionsUnion = value.asInstanceOf[QueryExceptionsUnion]
}

