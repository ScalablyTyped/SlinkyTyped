package typingsSlinky.awsSdkClientDynamodbBrowser.describeGlobalTableSettingsExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
*/
trait DescribeGlobalTableSettingsExceptionsUnion extends js.Object

object DescribeGlobalTableSettingsExceptionsUnion {
  @scala.inline
  implicit def apply(value: GlobalTableNotFoundException): DescribeGlobalTableSettingsExceptionsUnion = value.asInstanceOf[DescribeGlobalTableSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): DescribeGlobalTableSettingsExceptionsUnion = value.asInstanceOf[DescribeGlobalTableSettingsExceptionsUnion]
}

