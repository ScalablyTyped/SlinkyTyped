package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePhoneNumberResponse extends js.Object {
  
  /**
    * The updated phone number details.
    */
  var PhoneNumber: js.UndefOr[typingsSlinky.awsSdk.chimeMod.PhoneNumber] = js.native
}
object UpdatePhoneNumberResponse {
  
  @scala.inline
  def apply(): UpdatePhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePhoneNumberResponse]
  }
  
  @scala.inline
  implicit class UpdatePhoneNumberResponseOps[Self <: UpdatePhoneNumberResponse] (val x: Self) extends AnyVal {
    
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
    def setPhoneNumber(value: PhoneNumber): Self = this.set("PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("PhoneNumber", js.undefined)
  }
}
