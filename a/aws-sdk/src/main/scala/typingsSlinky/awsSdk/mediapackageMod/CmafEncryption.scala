package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CmafEncryption extends js.Object {
  
  /**
    * Time (in seconds) between each encryption key rotation.
    */
  var KeyRotationIntervalSeconds: js.UndefOr[integer] = js.native
  
  var SpekeKeyProvider: typingsSlinky.awsSdk.mediapackageMod.SpekeKeyProvider = js.native
}
object CmafEncryption {
  
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider): CmafEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafEncryption]
  }
  
  @scala.inline
  implicit class CmafEncryptionOps[Self <: CmafEncryption] (val x: Self) extends AnyVal {
    
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
    def setSpekeKeyProvider(value: SpekeKeyProvider): Self = this.set("SpekeKeyProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyRotationIntervalSeconds(value: integer): Self = this.set("KeyRotationIntervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyRotationIntervalSeconds: Self = this.set("KeyRotationIntervalSeconds", js.undefined)
  }
}
