package typingsSlinky.awsSdkClientDynamodbNode.typesReplicaAlreadyExistsExceptionMod

import typingsSlinky.awsSdkClientDynamodbNode.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicaAlreadyExistsException
  extends ServiceException[ReplicaAlreadyExistsExceptionDetails]
     with UpdateGlobalTableExceptionsUnion {
  
  @JSName("name")
  var name_ReplicaAlreadyExistsException: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ReplicaAlreadyExistsException = js.native
}
object ReplicaAlreadyExistsException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ReplicaAlreadyExistsExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ReplicaAlreadyExistsException
  ): ReplicaAlreadyExistsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaAlreadyExistsException]
  }
  
  @scala.inline
  implicit class ReplicaAlreadyExistsExceptionOps[Self <: ReplicaAlreadyExistsException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(
      value: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ReplicaAlreadyExistsException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
