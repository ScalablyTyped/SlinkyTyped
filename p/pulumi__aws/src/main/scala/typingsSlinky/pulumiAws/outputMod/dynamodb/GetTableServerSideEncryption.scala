package typingsSlinky.pulumiAws.outputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTableServerSideEncryption extends js.Object {
  
  var enabled: Boolean = js.native
  
  var kmsKeyArn: String = js.native
}
object GetTableServerSideEncryption {
  
  @scala.inline
  def apply(enabled: Boolean, kmsKeyArn: String): GetTableServerSideEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableServerSideEncryption]
  }
  
  @scala.inline
  implicit class GetTableServerSideEncryptionOps[Self <: GetTableServerSideEncryption] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArn(value: String): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
  }
}
