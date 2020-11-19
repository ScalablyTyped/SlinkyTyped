package typingsSlinky.awsSdkClientDynamodbNode.typesTableAlreadyExistsExceptionMod

import typingsSlinky.awsSdkClientDynamodbNode.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableAlreadyExistsException
  extends ServiceException[TableAlreadyExistsExceptionDetails]
     with RestoreTableFromBackupExceptionsUnion
     with RestoreTableToPointInTimeExceptionsUnion {
  
  @JSName("name")
  var name_TableAlreadyExistsException: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableAlreadyExistsException = js.native
}
object TableAlreadyExistsException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TableAlreadyExistsExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableAlreadyExistsException
  ): TableAlreadyExistsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableAlreadyExistsException]
  }
  
  @scala.inline
  implicit class TableAlreadyExistsExceptionOps[Self <: TableAlreadyExistsException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableAlreadyExistsException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
