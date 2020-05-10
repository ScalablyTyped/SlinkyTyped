package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyAction extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup. For example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var DestinationBackupVaultArn: ARN = js.native
  var Lifecycle: js.UndefOr[typingsSlinky.awsSdk.backupMod.Lifecycle] = js.native
}

object CopyAction {
  @scala.inline
  def apply(DestinationBackupVaultArn: ARN): CopyAction = {
    val __obj = js.Dynamic.literal(DestinationBackupVaultArn = DestinationBackupVaultArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyAction]
  }
  @scala.inline
  implicit class CopyActionOps[Self <: CopyAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationBackupVaultArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationBackupVaultArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifecycle(value: Lifecycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lifecycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lifecycle")(js.undefined)
        ret
    }
  }
  
}

