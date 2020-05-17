package typingsSlinky.awsSdkClientDynamodbBrowser.getItemExceptionsUnionMod

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
trait GetItemExceptionsUnion extends js.Object

object GetItemExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): GetItemExceptionsUnion = value.asInstanceOf[GetItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): GetItemExceptionsUnion = value.asInstanceOf[GetItemExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetItemExceptionsUnion = value.asInstanceOf[GetItemExceptionsUnion]
}

