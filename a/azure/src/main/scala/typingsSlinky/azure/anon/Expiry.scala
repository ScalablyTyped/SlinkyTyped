package typingsSlinky.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expiry extends js.Object {
  
  var Expiry: js.Date = js.native
  
  var Permission: js.UndefOr[String] = js.native
  
  var Start: js.UndefOr[js.Date] = js.native
}
object Expiry {
  
  @scala.inline
  def apply(Expiry: js.Date): Expiry = {
    val __obj = js.Dynamic.literal(Expiry = Expiry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expiry]
  }
  
  @scala.inline
  implicit class ExpiryOps[Self <: Expiry] (val x: Self) extends AnyVal {
    
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
    def setExpiry(value: js.Date): Self = this.set("Expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission(value: String): Self = this.set("Permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission: Self = this.set("Permission", js.undefined)
    
    @scala.inline
    def setStart(value: js.Date): Self = this.set("Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("Start", js.undefined)
  }
}
