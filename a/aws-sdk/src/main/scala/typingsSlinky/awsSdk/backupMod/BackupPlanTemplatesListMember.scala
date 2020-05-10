package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupPlanTemplatesListMember extends js.Object {
  /**
    * Uniquely identifies a stored backup plan template.
    */
  var BackupPlanTemplateId: js.UndefOr[String] = js.native
  /**
    * The optional display name of a backup plan template.
    */
  var BackupPlanTemplateName: js.UndefOr[String] = js.native
}

object BackupPlanTemplatesListMember {
  @scala.inline
  def apply(): BackupPlanTemplatesListMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupPlanTemplatesListMember]
  }
  @scala.inline
  implicit class BackupPlanTemplatesListMemberOps[Self <: BackupPlanTemplatesListMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupPlanTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupPlanTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupPlanTemplateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupPlanTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanTemplateName")(js.undefined)
        ret
    }
  }
  
}

