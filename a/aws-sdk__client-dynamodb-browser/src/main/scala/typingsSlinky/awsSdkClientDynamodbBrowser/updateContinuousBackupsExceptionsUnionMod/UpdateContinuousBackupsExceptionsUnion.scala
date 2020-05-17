package typingsSlinky.awsSdkClientDynamodbBrowser.updateContinuousBackupsExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
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

