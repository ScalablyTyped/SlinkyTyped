package typingsSlinky.awsSdkClientDynamodbNode.describeGlobalTableExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
  - typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
*/
trait DescribeGlobalTableExceptionsUnion extends js.Object

object DescribeGlobalTableExceptionsUnion {
  @scala.inline
  implicit def apply(value: GlobalTableNotFoundException): DescribeGlobalTableExceptionsUnion = value.asInstanceOf[DescribeGlobalTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): DescribeGlobalTableExceptionsUnion = value.asInstanceOf[DescribeGlobalTableExceptionsUnion]
}

