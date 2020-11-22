package typingsSlinky.nextAuth.adaptersMod

import typingsSlinky.nextAuth.clientMod.SessionProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendVerificationRequestParams extends js.Object {
  
  var baseUrl: String = js.native
  
  var identifier: String = js.native
  
  var provider: SessionProvider = js.native
  
  var token: String = js.native
  
  var url: String = js.native
}
object SendVerificationRequestParams {
  
  @scala.inline
  def apply(baseUrl: String, identifier: String, provider: SessionProvider, token: String, url: String): SendVerificationRequestParams = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendVerificationRequestParams]
  }
  
  @scala.inline
  implicit class SendVerificationRequestParamsOps[Self <: SendVerificationRequestParams] (val x: Self) extends AnyVal {
    
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: SessionProvider): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
