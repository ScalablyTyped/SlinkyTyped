package typingsSlinky.nodePushnotifications.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessToken extends js.Object {
  
  var accessToken: js.UndefOr[String] = js.native
  
  var client_id: js.UndefOr[String] = js.native
  
  var client_secret: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[String] = js.native
  
  var notificationMethod: js.UndefOr[String] = js.native
}
object AccessToken {
  
  @scala.inline
  def apply(): AccessToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessToken]
  }
  
  @scala.inline
  implicit class AccessTokenOps[Self <: AccessToken] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_secret: Self = this.set("client_secret", js.undefined)
    
    @scala.inline
    def setHeaders(value: String): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setNotificationMethod(value: String): Self = this.set("notificationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationMethod: Self = this.set("notificationMethod", js.undefined)
  }
}
