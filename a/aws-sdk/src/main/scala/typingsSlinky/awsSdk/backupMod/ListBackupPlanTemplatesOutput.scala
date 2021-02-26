package typingsSlinky.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackupPlanTemplatesOutput extends StObject {
  
  /**
    * An array of template list items containing metadata about your saved templates.
    */
  var BackupPlanTemplatesList: js.UndefOr[typingsSlinky.awsSdk.backupMod.BackupPlanTemplatesList] = js.native
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListBackupPlanTemplatesOutput {
  
  @scala.inline
  def apply(): ListBackupPlanTemplatesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupPlanTemplatesOutput]
  }
  
  @scala.inline
  implicit class ListBackupPlanTemplatesOutputMutableBuilder[Self <: ListBackupPlanTemplatesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlanTemplatesList(value: BackupPlanTemplatesList): Self = StObject.set(x, "BackupPlanTemplatesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanTemplatesListUndefined: Self = StObject.set(x, "BackupPlanTemplatesList", js.undefined)
    
    @scala.inline
    def setBackupPlanTemplatesListVarargs(value: BackupPlanTemplatesListMember*): Self = StObject.set(x, "BackupPlanTemplatesList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
