package typingsSlinky.ncom.mod

import typingsSlinky.ncom.ncomBooleans.`true`
import typingsSlinky.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecureComServerOptions extends TlsOptions {
  
  var secure: `true` = js.native
}
object SecureComServerOptions {
  
  @scala.inline
  def apply(secure: `true`): SecureComServerOptions = {
    val __obj = js.Dynamic.literal(secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureComServerOptions]
  }
  
  @scala.inline
  implicit class SecureComServerOptionsOps[Self <: SecureComServerOptions] (val x: Self) extends AnyVal {
    
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
    def setSecure(value: `true`): Self = this.set("secure", value.asInstanceOf[js.Any])
  }
}
