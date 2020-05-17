package typingsSlinky.awsSdkClientDynamodbNode.scanExceptionsUnionMod

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
trait ScanExceptionsUnion extends js.Object

object ScanExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): ScanExceptionsUnion = value.asInstanceOf[ScanExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): ScanExceptionsUnion = value.asInstanceOf[ScanExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ScanExceptionsUnion = value.asInstanceOf[ScanExceptionsUnion]
}

