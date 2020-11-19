package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Security related configuration, including encryption, Kerberos, etc.
  */
@js.native
trait SchemaSecurityConfig extends js.Object {
  
  /**
    * Kerberos related configuration.
    */
  var kerberosConfig: js.UndefOr[SchemaKerberosConfig] = js.native
}
object SchemaSecurityConfig {
  
  @scala.inline
  def apply(): SchemaSecurityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityConfig]
  }
  
  @scala.inline
  implicit class SchemaSecurityConfigOps[Self <: SchemaSecurityConfig] (val x: Self) extends AnyVal {
    
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
    def setKerberosConfig(value: SchemaKerberosConfig): Self = this.set("kerberosConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKerberosConfig: Self = this.set("kerberosConfig", js.undefined)
  }
}
