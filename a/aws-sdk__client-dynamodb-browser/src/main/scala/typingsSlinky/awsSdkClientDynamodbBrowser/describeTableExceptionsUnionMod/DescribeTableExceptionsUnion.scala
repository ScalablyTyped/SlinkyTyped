package typingsSlinky.awsSdkClientDynamodbBrowser.describeTableExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
*/
trait DescribeTableExceptionsUnion extends js.Object

object DescribeTableExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): DescribeTableExceptionsUnion = value.asInstanceOf[DescribeTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DescribeTableExceptionsUnion = value.asInstanceOf[DescribeTableExceptionsUnion]
}

