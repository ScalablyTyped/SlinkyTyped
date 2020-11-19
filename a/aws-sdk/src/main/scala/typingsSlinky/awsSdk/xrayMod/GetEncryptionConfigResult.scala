package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEncryptionConfigResult extends js.Object {
  
  /**
    * The encryption configuration document.
    */
  var EncryptionConfig: js.UndefOr[typingsSlinky.awsSdk.xrayMod.EncryptionConfig] = js.native
}
object GetEncryptionConfigResult {
  
  @scala.inline
  def apply(): GetEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEncryptionConfigResult]
  }
  
  @scala.inline
  implicit class GetEncryptionConfigResultOps[Self <: GetEncryptionConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfig): Self = this.set("EncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionConfig: Self = this.set("EncryptionConfig", js.undefined)
  }
}
