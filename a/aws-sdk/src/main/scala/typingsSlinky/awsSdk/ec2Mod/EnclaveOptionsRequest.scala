package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnclaveOptionsRequest extends js.Object {
  
  /**
    * To enable the instance for AWS Nitro Enclaves, set this parameter to true.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}
object EnclaveOptionsRequest {
  
  @scala.inline
  def apply(): EnclaveOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnclaveOptionsRequest]
  }
  
  @scala.inline
  implicit class EnclaveOptionsRequestOps[Self <: EnclaveOptionsRequest] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
}
