package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseData extends js.Object {
  
  var user: InsightsServiceAccountResponseUser = js.native
}
object InsightsServiceAccountResponseData {
  
  @scala.inline
  def apply(user: InsightsServiceAccountResponseUser): InsightsServiceAccountResponseData = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseData]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseDataOps[Self <: InsightsServiceAccountResponseData] (val x: Self) extends AnyVal {
    
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
    def setUser(value: InsightsServiceAccountResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
