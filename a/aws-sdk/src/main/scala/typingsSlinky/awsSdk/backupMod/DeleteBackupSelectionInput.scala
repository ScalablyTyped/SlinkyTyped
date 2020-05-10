package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupSelectionInput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String = js.native
  /**
    * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
    */
  var SelectionId: String = js.native
}

object DeleteBackupSelectionInput {
  @scala.inline
  def apply(BackupPlanId: String, SelectionId: String): DeleteBackupSelectionInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId.asInstanceOf[js.Any], SelectionId = SelectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupSelectionInput]
  }
  @scala.inline
  implicit class DeleteBackupSelectionInputOps[Self <: DeleteBackupSelectionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

