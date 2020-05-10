package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportBackupPlanTemplateOutput extends js.Object {
  /**
    * The body of a backup plan template in JSON format.  This is a signed JSON document that cannot be modified before being passed to GetBackupPlanFromJSON.  
    */
  var BackupPlanTemplateJson: js.UndefOr[String] = js.native
}

object ExportBackupPlanTemplateOutput {
  @scala.inline
  def apply(): ExportBackupPlanTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportBackupPlanTemplateOutput]
  }
  @scala.inline
  implicit class ExportBackupPlanTemplateOutputOps[Self <: ExportBackupPlanTemplateOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupPlanTemplateJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanTemplateJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupPlanTemplateJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanTemplateJson")(js.undefined)
        ret
    }
  }
  
}

