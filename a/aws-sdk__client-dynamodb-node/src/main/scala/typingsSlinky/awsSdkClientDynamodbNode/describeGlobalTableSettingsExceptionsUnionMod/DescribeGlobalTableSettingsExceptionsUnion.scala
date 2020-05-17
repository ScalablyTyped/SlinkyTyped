package typingsSlinky.awsSdkClientDynamodbNode.describeGlobalTableSettingsExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
*/
trait DescribeGlobalTableSettingsExceptionsUnion extends js.Object

object DescribeGlobalTableSettingsExceptionsUnion {
  @scala.inline
  implicit def apply(value: GlobalTableNotFoundException): DescribeGlobalTableSettingsExceptionsUnion = value.asInstanceOf[DescribeGlobalTableSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): DescribeGlobalTableSettingsExceptionsUnion = value.asInstanceOf[DescribeGlobalTableSettingsExceptionsUnion]
}

