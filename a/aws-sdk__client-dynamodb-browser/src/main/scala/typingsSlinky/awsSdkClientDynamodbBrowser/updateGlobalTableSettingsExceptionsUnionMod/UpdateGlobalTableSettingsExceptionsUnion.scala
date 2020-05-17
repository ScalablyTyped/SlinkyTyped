package typingsSlinky.awsSdkClientDynamodbBrowser.updateGlobalTableSettingsExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesIndexNotFoundExceptionMod.IndexNotFoundException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesIndexNotFoundExceptionMod.IndexNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
*/
trait UpdateGlobalTableSettingsExceptionsUnion extends js.Object

object UpdateGlobalTableSettingsExceptionsUnion {
  @scala.inline
  implicit def apply(value: GlobalTableNotFoundException): UpdateGlobalTableSettingsExceptionsUnion = value.asInstanceOf[UpdateGlobalTableSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: IndexNotFoundException): UpdateGlobalTableSettingsExceptionsUnion = value.asInstanceOf[UpdateGlobalTableSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): UpdateGlobalTableSettingsExceptionsUnion = value.asInstanceOf[UpdateGlobalTableSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): UpdateGlobalTableSettingsExceptionsUnion = value.asInstanceOf[UpdateGlobalTableSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ReplicaNotFoundException): UpdateGlobalTableSettingsExceptionsUnion = value.asInstanceOf[UpdateGlobalTableSettingsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): UpdateGlobalTableSettingsExceptionsUnion = value.asInstanceOf[UpdateGlobalTableSettingsExceptionsUnion]
}

