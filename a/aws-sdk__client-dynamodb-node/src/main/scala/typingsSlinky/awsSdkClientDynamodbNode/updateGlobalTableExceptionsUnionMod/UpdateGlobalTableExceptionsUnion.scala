package typingsSlinky.awsSdkClientDynamodbNode.updateGlobalTableExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
import typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbNode.typesReplicaAlreadyExistsExceptionMod.ReplicaAlreadyExistsException
import typingsSlinky.awsSdkClientDynamodbNode.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException
import typingsSlinky.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
  - typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesReplicaAlreadyExistsExceptionMod.ReplicaAlreadyExistsException
  - typingsSlinky.awsSdkClientDynamodbNode.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException
  - typingsSlinky.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
*/
trait UpdateGlobalTableExceptionsUnion extends js.Object

object UpdateGlobalTableExceptionsUnion {
  @scala.inline
  implicit def apply(value: GlobalTableNotFoundException): UpdateGlobalTableExceptionsUnion = value.asInstanceOf[UpdateGlobalTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: InternalServerError): UpdateGlobalTableExceptionsUnion = value.asInstanceOf[UpdateGlobalTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: ReplicaAlreadyExistsException): UpdateGlobalTableExceptionsUnion = value.asInstanceOf[UpdateGlobalTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: ReplicaNotFoundException): UpdateGlobalTableExceptionsUnion = value.asInstanceOf[UpdateGlobalTableExceptionsUnion]
  @scala.inline
  implicit def apply(value: TableNotFoundException): UpdateGlobalTableExceptionsUnion = value.asInstanceOf[UpdateGlobalTableExceptionsUnion]
}

