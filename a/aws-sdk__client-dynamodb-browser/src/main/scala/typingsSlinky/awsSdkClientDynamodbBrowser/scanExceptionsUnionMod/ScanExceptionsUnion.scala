package typingsSlinky.awsSdkClientDynamodbBrowser.scanExceptionsUnionMod

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
trait ScanExceptionsUnion extends js.Object

object ScanExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): ScanExceptionsUnion = value.asInstanceOf[ScanExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): ScanExceptionsUnion = value.asInstanceOf[ScanExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ScanExceptionsUnion = value.asInstanceOf[ScanExceptionsUnion]
}

