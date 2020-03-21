package typingsSlinky.awsSdkClientDynamodbNode.typesReplicaAlreadyExistsExceptionMod

import typingsSlinky.awsSdkClientDynamodbNode.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaAlreadyExistsException
  extends ServiceException[ReplicaAlreadyExistsExceptionDetails]
     with UpdateGlobalTableExceptionsUnion {
  @JSName("name")
  var name_ReplicaAlreadyExistsException: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ReplicaAlreadyExistsException = js.native
}

