package typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod

import typingsSlinky.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.createTableExceptionsUnionMod.CreateTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.deleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.deleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LimitExceededException
  extends ServiceException[LimitExceededExceptionDetails]
     with CreateBackupExceptionsUnion
     with CreateGlobalTableExceptionsUnion
     with CreateTableExceptionsUnion
     with DeleteBackupExceptionsUnion
     with DeleteTableExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion
     with RestoreTableToPointInTimeExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion
     with UpdateGlobalTableSettingsExceptionsUnion
     with UpdateTableExceptionsUnion
     with UpdateTimeToLiveExceptionsUnion {
  
  @JSName("name")
  var name_LimitExceededException: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.LimitExceededException = js.native
}
object LimitExceededException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: LimitExceededExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.LimitExceededException
  ): LimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitExceededException]
  }
  
  @scala.inline
  implicit class LimitExceededExceptionOps[Self <: LimitExceededException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.LimitExceededException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
