package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimEventSource extends js.Object {
  
  var contentOwnerId: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var userEmail: js.UndefOr[String] = js.native
}
object ClaimEventSource {
  
  @scala.inline
  def apply(): ClaimEventSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimEventSource]
  }
  
  @scala.inline
  implicit class ClaimEventSourceOps[Self <: ClaimEventSource] (val x: Self) extends AnyVal {
    
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
    def setContentOwnerId(value: String): Self = this.set("contentOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentOwnerId: Self = this.set("contentOwnerId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserEmail(value: String): Self = this.set("userEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEmail: Self = this.set("userEmail", js.undefined)
  }
}
