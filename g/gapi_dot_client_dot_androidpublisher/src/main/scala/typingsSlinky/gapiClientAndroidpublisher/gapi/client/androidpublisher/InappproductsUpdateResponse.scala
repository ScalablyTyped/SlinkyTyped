package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InappproductsUpdateResponse extends js.Object {
  
  var inappproduct: js.UndefOr[InAppProduct] = js.native
}
object InappproductsUpdateResponse {
  
  @scala.inline
  def apply(): InappproductsUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsUpdateResponse]
  }
  
  @scala.inline
  implicit class InappproductsUpdateResponseOps[Self <: InappproductsUpdateResponse] (val x: Self) extends AnyVal {
    
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
    def setInappproduct(value: InAppProduct): Self = this.set("inappproduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInappproduct: Self = this.set("inappproduct", js.undefined)
  }
}
