package typingsSlinky.node.cryptoMod

import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherGCMOptions extends TransformOptions {
  
  var authTagLength: js.UndefOr[Double] = js.native
}
object CipherGCMOptions {
  
  @scala.inline
  def apply(): CipherGCMOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CipherGCMOptions]
  }
  
  @scala.inline
  implicit class CipherGCMOptionsOps[Self <: CipherGCMOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthTagLength(value: Double): Self = this.set("authTagLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTagLength: Self = this.set("authTagLength", js.undefined)
  }
}
