package typingsSlinky.awsSdkClientDynamodbNode.typesBackupInUseExceptionMod

import typingsSlinky.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.deleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupInUseException
  extends ServiceException[BackupInUseExceptionDetails]
     with CreateBackupExceptionsUnion
     with DeleteBackupExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion {
  
  @JSName("name")
  var name_BackupInUseException: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupInUseException = js.native
}
object BackupInUseException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BackupInUseExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupInUseException
  ): BackupInUseException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupInUseException]
  }
  
  @scala.inline
  implicit class BackupInUseExceptionOps[Self <: BackupInUseException] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupInUseException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
