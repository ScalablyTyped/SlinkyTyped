package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditLogRoot extends Entity {
  // Read-only. Nullable.
  var directoryAudits: js.UndefOr[js.Array[DirectoryAudit]] = js.native
  var restrictedSignIns: js.UndefOr[js.Array[RestrictedSignIn]] = js.native
  // Read-only. Nullable.
  var signIns: js.UndefOr[js.Array[SignIn]] = js.native
}

object AuditLogRoot {
  @scala.inline
  def apply(): AuditLogRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditLogRoot]
  }
  @scala.inline
  implicit class AuditLogRootOps[Self <: AuditLogRoot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryAudits(value: js.Array[DirectoryAudit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryAudits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryAudits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryAudits")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictedSignIns(value: js.Array[RestrictedSignIn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedSignIns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictedSignIns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedSignIns")(js.undefined)
        ret
    }
    @scala.inline
    def withSignIns(value: js.Array[SignIn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signIns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignIns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signIns")(js.undefined)
        ret
    }
  }
  
}

