package typingsSlinky.awsSdkClientDynamodbBrowser.describeContinuousBackupsExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
*/
trait DescribeContinuousBackupsExceptionsUnion extends js.Object

object DescribeContinuousBackupsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): DescribeContinuousBackupsExceptionsUnion = value.asInstanceOf[DescribeContinuousBackupsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TableNotFoundException): DescribeContinuousBackupsExceptionsUnion = value.asInstanceOf[DescribeContinuousBackupsExceptionsUnion]
}

