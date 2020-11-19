package typingsSlinky.angularOauth2.mod.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthTokenOptions extends js.Object {
  
  var secure: Boolean = js.native
}
object OAuthTokenOptions {
  
  @scala.inline
  def apply(secure: Boolean): OAuthTokenOptions = {
    val __obj = js.Dynamic.literal(secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthTokenOptions]
  }
  
  @scala.inline
  implicit class OAuthTokenOptionsOps[Self <: OAuthTokenOptions] (val x: Self) extends AnyVal {
    
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
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
  }
}
