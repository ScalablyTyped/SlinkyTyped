package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateXssMatchSetResponse extends js.Object {
  
  /**
    * The ChangeToken that you used to submit the CreateXssMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.ChangeToken] = js.native
  
  /**
    * An XssMatchSet.
    */
  var XssMatchSet: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.XssMatchSet] = js.native
}
object CreateXssMatchSetResponse {
  
  @scala.inline
  def apply(): CreateXssMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateXssMatchSetResponse]
  }
  
  @scala.inline
  implicit class CreateXssMatchSetResponseOps[Self <: CreateXssMatchSetResponse] (val x: Self) extends AnyVal {
    
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
    def setXssMatchSet(value: XssMatchSet): Self = this.set("XssMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXssMatchSet: Self = this.set("XssMatchSet", js.undefined)
  }
}
