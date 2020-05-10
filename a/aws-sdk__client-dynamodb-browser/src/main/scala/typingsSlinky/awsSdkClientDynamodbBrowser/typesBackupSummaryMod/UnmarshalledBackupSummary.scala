package typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupSummaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledBackupSummary extends BackupSummary {
  /**
    * <p>Time at which the backup was created.</p>
    */
  @JSName("BackupCreationDateTime")
  var BackupCreationDateTime_UnmarshalledBackupSummary: js.UndefOr[js.Date] = js.native
  /**
    * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
    */
  @JSName("BackupExpiryDateTime")
  var BackupExpiryDateTime_UnmarshalledBackupSummary: js.UndefOr[js.Date] = js.native
}

object UnmarshalledBackupSummary {
  @scala.inline
  def apply(): UnmarshalledBackupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledBackupSummary]
  }
  @scala.inline
  implicit class UnmarshalledBackupSummaryOps[Self <: UnmarshalledBackupSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupCreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupCreationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupCreationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupExpiryDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupExpiryDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupExpiryDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupExpiryDateTime")(js.undefined)
        ret
    }
  }
  
}

