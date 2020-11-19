package typingsSlinky.paystack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Firstname extends js.Object {
  
  var email: String = js.native
  
  var first_name: String = js.native
  
  var last_name: String = js.native
  
  var phone: String = js.native
}
object Firstname {
  
  @scala.inline
  def apply(email: String, first_name: String, last_name: String, phone: String): Firstname = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstname]
  }
  
  @scala.inline
  implicit class FirstnameOps[Self <: Firstname] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
  }
}
