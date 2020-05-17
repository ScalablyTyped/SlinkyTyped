package typingsSlinky.awsSdkClientDynamodbBrowser.updateGlobalTableExceptionsUnionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
import typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaAlreadyExistsExceptionMod.ReplicaAlreadyExistsException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaAlreadyExistsExceptionMod.ReplicaAlreadyExistsException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException
  - typingsSlinky.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
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

