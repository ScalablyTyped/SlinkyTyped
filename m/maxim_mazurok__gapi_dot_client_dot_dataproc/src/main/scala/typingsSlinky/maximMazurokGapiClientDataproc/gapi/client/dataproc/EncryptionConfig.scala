package typingsSlinky.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionConfig extends js.Object {
  
  /** Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster. */
  var gcePdKmsKeyName: js.UndefOr[String] = js.native
}
object EncryptionConfig {
  
  @scala.inline
  def apply(): EncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfig]
  }
  
  @scala.inline
  implicit class EncryptionConfigOps[Self <: EncryptionConfig] (val x: Self) extends AnyVal {
    
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
    def setGcePdKmsKeyName(value: String): Self = this.set("gcePdKmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcePdKmsKeyName: Self = this.set("gcePdKmsKeyName", js.undefined)
  }
}
