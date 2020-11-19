package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectoryAuditsVarargs(value: DirectoryAudit*): Self = this.set("directoryAudits", js.Array(value :_*))
    
    @scala.inline
    def setDirectoryAudits(value: js.Array[DirectoryAudit]): Self = this.set("directoryAudits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryAudits: Self = this.set("directoryAudits", js.undefined)
    
    @scala.inline
    def setRestrictedSignInsVarargs(value: RestrictedSignIn*): Self = this.set("restrictedSignIns", js.Array(value :_*))
    
    @scala.inline
    def setRestrictedSignIns(value: js.Array[RestrictedSignIn]): Self = this.set("restrictedSignIns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictedSignIns: Self = this.set("restrictedSignIns", js.undefined)
    
    @scala.inline
    def setSignInsVarargs(value: SignIn*): Self = this.set("signIns", js.Array(value :_*))
    
    @scala.inline
    def setSignIns(value: js.Array[SignIn]): Self = this.set("signIns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignIns: Self = this.set("signIns", js.undefined)
  }
}
