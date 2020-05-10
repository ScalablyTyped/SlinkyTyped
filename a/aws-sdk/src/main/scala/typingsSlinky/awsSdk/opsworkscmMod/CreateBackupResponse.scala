package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackupResponse extends js.Object {
  /**
    * Backup created by request.
    */
  var Backup: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.Backup] = js.native
}

object CreateBackupResponse {
  @scala.inline
  def apply(): CreateBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupResponse]
  }
  @scala.inline
  implicit class CreateBackupResponseOps[Self <: CreateBackupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackup(value: Backup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Backup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Backup")(js.undefined)
        ret
    }
  }
  
}

