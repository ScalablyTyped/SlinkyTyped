package typingsSlinky.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider extends js.Object {
  
  var provider: String = js.native
  
  var sandbox: js.UndefOr[Boolean] = js.native
  
  var token: js.UndefOr[Boolean] = js.native
}
object Provider {
  
  @scala.inline
  def apply(provider: String): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
    
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
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandbox(value: Boolean): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    
    @scala.inline
    def setToken(value: Boolean): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
