package typingsSlinky.awsSdkClientDynamodbBrowser.describeGlobalTableExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
*/
trait DescribeGlobalTableExceptionsUnion extends js.Object

object DescribeGlobalTableExceptionsUnion {
  @scala.inline
  implicit def apply(value: GlobalTableNotFoundException): DescribeGlobalTableExceptionsUnion = value.asInstanceOf[DescribeGlobalTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): DescribeGlobalTableExceptionsUnion = value.asInstanceOf[DescribeGlobalTableExceptionsUnion]
}

