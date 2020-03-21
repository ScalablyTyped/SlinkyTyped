package typingsSlinky.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryUnavailableExceptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointInTimeRecoveryUnavailableException
  extends ServiceException[PointInTimeRecoveryUnavailableExceptionDetails]
     with RestoreTableToPointInTimeExceptionsUnion {
  @JSName("name")
  var name_PointInTimeRecoveryUnavailableException: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.PointInTimeRecoveryUnavailableException = js.native
}

