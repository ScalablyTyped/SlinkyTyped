package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetFpgaImageAttributeRequest extends js.Object {
  
  /**
    * The attribute.
    */
  var Attribute: js.UndefOr[ResetFpgaImageAttributeName] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: typingsSlinky.awsSdk.ec2Mod.FpgaImageId = js.native
}
object ResetFpgaImageAttributeRequest {
  
  @scala.inline
  def apply(FpgaImageId: FpgaImageId): ResetFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(FpgaImageId = FpgaImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetFpgaImageAttributeRequest]
  }
  
  @scala.inline
  implicit class ResetFpgaImageAttributeRequestOps[Self <: ResetFpgaImageAttributeRequest] (val x: Self) extends AnyVal {
    
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
    def setFpgaImageId(value: FpgaImageId): Self = this.set("FpgaImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribute(value: ResetFpgaImageAttributeName): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("Attribute", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
}
