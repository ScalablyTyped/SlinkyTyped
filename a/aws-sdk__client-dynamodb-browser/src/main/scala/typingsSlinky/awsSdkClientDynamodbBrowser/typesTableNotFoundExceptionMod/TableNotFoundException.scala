package typingsSlinky.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.describeContinuousBackupsExceptionsUnionMod.DescribeContinuousBackupsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TableNotFoundExceptionDetails> * / any */ @js.native
trait TableNotFoundException
  extends CreateBackupExceptionsUnion
     with CreateGlobalTableExceptionsUnion
     with DescribeContinuousBackupsExceptionsUnion
     with RestoreTableToPointInTimeExceptionsUnion
     with UpdateContinuousBackupsExceptionsUnion
     with UpdateGlobalTableExceptionsUnion {
  
  var name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableNotFoundException = js.native
}
object TableNotFoundException {
  
  @scala.inline
  def apply(
    name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableNotFoundException
  ): TableNotFoundException = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableNotFoundException]
  }
  
  @scala.inline
  implicit class TableNotFoundExceptionOps[Self <: TableNotFoundException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableNotFoundException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
