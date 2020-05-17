package typingsSlinky.awsSdkClientDynamodbNode.describeTableExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
*/
trait DescribeTableExceptionsUnion extends js.Object

object DescribeTableExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): DescribeTableExceptionsUnion = value.asInstanceOf[DescribeTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DescribeTableExceptionsUnion = value.asInstanceOf[DescribeTableExceptionsUnion]
}

