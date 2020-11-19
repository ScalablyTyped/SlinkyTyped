package typingsSlinky.apolloLinkWs.webSocketLinkMod.WebSocketLink

import typingsSlinky.subscriptionsTransportWs.clientMod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  var options: js.UndefOr[ClientOptions] = js.native
  
  var uri: String = js.native
  
  var webSocketImpl: js.UndefOr[js.Any] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(uri: String): Configuration = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ClientOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setWebSocketImpl(value: js.Any): Self = this.set("webSocketImpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebSocketImpl: Self = this.set("webSocketImpl", js.undefined)
  }
}
