package typingsSlinky.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cvv extends js.Object {
  
  var cvv: js.UndefOr[String] = js.native
  
  var expiry: js.UndefOr[String] = js.native
  
  var number: js.UndefOr[String] = js.native
}
object Cvv {
  
  @scala.inline
  def apply(): Cvv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cvv]
  }
  
  @scala.inline
  implicit class CvvOps[Self <: Cvv] (val x: Self) extends AnyVal {
    
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
    def setCvv(value: String): Self = this.set("cvv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCvv: Self = this.set("cvv", js.undefined)
    
    @scala.inline
    def setExpiry(value: String): Self = this.set("expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiry: Self = this.set("expiry", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
  }
}
