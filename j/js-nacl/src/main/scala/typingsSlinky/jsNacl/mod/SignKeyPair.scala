package typingsSlinky.jsNacl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignKeyPair extends js.Object {
  
  var signPk: js.typedarray.Uint8Array = js.native
  
  var signSk: js.typedarray.Uint8Array = js.native
}
object SignKeyPair {
  
  @scala.inline
  def apply(signPk: js.typedarray.Uint8Array, signSk: js.typedarray.Uint8Array): SignKeyPair = {
    val __obj = js.Dynamic.literal(signPk = signPk.asInstanceOf[js.Any], signSk = signSk.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignKeyPair]
  }
  
  @scala.inline
  implicit class SignKeyPairOps[Self <: SignKeyPair] (val x: Self) extends AnyVal {
    
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
    def setSignPk(value: js.typedarray.Uint8Array): Self = this.set("signPk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignSk(value: js.typedarray.Uint8Array): Self = this.set("signSk", value.asInstanceOf[js.Any])
  }
}
