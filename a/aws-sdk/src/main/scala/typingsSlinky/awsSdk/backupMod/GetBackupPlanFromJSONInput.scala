package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupPlanFromJSONInput extends js.Object {
  /**
    * A customer-supplied backup plan document in JSON format.
    */
  var BackupPlanTemplateJson: String = js.native
}

object GetBackupPlanFromJSONInput {
  @scala.inline
  def apply(BackupPlanTemplateJson: String): GetBackupPlanFromJSONInput = {
    val __obj = js.Dynamic.literal(BackupPlanTemplateJson = BackupPlanTemplateJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackupPlanFromJSONInput]
  }
  @scala.inline
  implicit class GetBackupPlanFromJSONInputOps[Self <: GetBackupPlanFromJSONInput] (val x: Self) extends AnyVal {
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
  }
  
}

