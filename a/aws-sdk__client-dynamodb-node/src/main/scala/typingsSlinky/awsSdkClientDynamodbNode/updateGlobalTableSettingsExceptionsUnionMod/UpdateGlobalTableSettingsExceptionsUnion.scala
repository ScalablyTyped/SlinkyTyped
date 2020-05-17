package typingsSlinky.awsSdkClientDynamodbNode.updateGlobalTableSettingsExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
import typingsSlinky.awsSdkClientDynamodbNode.typesIndexNotFoundExceptionMod.IndexNotFoundException
import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientDynamodbNode.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException
import typingsSlinky.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesIndexNotFoundExceptionMod.IndexNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
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

