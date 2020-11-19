package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIPSetResponse extends js.Object {
  
  /**
    * The ChangeToken that you used to submit the CreateIPSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsSdk.wafMod.ChangeToken] = js.native
  
  /**
    * The IPSet returned in the CreateIPSet response.
    */
  var IPSet: js.UndefOr[typingsSlinky.awsSdk.wafMod.IPSet] = js.native
}
object CreateIPSetResponse {
  
  @scala.inline
  def apply(): CreateIPSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIPSetResponse]
  }
  
  @scala.inline
  implicit class CreateIPSetResponseOps[Self <: CreateIPSetResponse] (val x: Self) extends AnyVal {
    
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
    def setChangeToken(value: ChangeToken): Self = this.set("ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeToken: Self = this.set("ChangeToken", js.undefined)
    
    @scala.inline
    def setIPSet(value: IPSet): Self = this.set("IPSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPSet: Self = this.set("IPSet", js.undefined)
  }
}
