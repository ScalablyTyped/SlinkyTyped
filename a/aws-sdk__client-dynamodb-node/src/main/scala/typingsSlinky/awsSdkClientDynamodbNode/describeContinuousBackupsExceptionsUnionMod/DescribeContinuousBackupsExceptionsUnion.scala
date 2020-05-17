package typingsSlinky.awsSdkClientDynamodbNode.describeContinuousBackupsExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
*/
trait DescribeContinuousBackupsExceptionsUnion extends js.Object

object DescribeContinuousBackupsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InternalServerError): DescribeContinuousBackupsExceptionsUnion = value.asInstanceOf[DescribeContinuousBackupsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TableNotFoundException): DescribeContinuousBackupsExceptionsUnion = value.asInstanceOf[DescribeContinuousBackupsExceptionsUnion]
}

