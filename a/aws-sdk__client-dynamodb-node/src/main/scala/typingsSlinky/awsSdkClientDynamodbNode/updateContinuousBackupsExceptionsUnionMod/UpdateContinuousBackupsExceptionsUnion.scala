package typingsSlinky.awsSdkClientDynamodbNode.updateContinuousBackupsExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException
import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
*/
trait UpdateContinuousBackupsExceptionsUnion extends js.Object

object UpdateContinuousBackupsExceptionsUnion {
  @scala.inline
  implicit def apply(value: ContinuousBackupsUnavailableException): UpdateContinuousBackupsExceptionsUnion = value.asInstanceOf[UpdateContinuousBackupsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): UpdateContinuousBackupsExceptionsUnion = value.asInstanceOf[UpdateContinuousBackupsExceptionsUnion]
  @scala.inline
  implicit def apply(value: TableNotFoundException): UpdateContinuousBackupsExceptionsUnion = value.asInstanceOf[UpdateContinuousBackupsExceptionsUnion]
}

