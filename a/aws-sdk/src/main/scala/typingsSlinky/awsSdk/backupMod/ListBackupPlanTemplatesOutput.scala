package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackupPlanTemplatesOutput extends js.Object {
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
  implicit class ListBackupPlanTemplatesOutputOps[Self <: ListBackupPlanTemplatesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupPlanTemplatesList(value: BackupPlanTemplatesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanTemplatesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupPlanTemplatesList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanTemplatesList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

