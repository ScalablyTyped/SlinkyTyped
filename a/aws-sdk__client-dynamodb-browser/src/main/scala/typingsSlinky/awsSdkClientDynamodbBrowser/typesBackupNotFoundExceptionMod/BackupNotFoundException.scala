package typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.deleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.describeBackupExceptionsUnionMod.DescribeBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupNotFoundException
  extends ServiceException[BackupNotFoundExceptionDetails]
     with DeleteBackupExceptionsUnion
     with DescribeBackupExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion {
  
  @JSName("name")
  var name_BackupNotFoundException: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.BackupNotFoundException = js.native
}
object BackupNotFoundException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BackupNotFoundExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.BackupNotFoundException
  ): BackupNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupNotFoundException]
  }
  
  @scala.inline
  implicit class BackupNotFoundExceptionOps[Self <: BackupNotFoundException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.BackupNotFoundException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
