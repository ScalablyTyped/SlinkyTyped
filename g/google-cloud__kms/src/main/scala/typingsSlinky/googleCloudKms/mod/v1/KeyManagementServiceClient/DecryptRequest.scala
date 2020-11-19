package typingsSlinky.googleCloudKms.mod.v1.KeyManagementServiceClient

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecryptRequest extends js.Object {
  
  var additionalAuthenticatedData: js.UndefOr[String] = js.native
  
  var ciphertext: Buffer = js.native
  
  var name: String = js.native
}
object DecryptRequest {
  
  @scala.inline
  def apply(ciphertext: Buffer, name: String): DecryptRequest = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptRequest]
  }
  
  @scala.inline
  implicit class DecryptRequestOps[Self <: DecryptRequest] (val x: Self) extends AnyVal {
    
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
    def setCiphertext(value: Buffer): Self = this.set("ciphertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalAuthenticatedData(value: String): Self = this.set("additionalAuthenticatedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalAuthenticatedData: Self = this.set("additionalAuthenticatedData", js.undefined)
  }
}
