package typingsSlinky.libp2pGossipsub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitSelf extends js.Object {
  
  var emitSelf: Boolean = js.native
}
object EmitSelf {
  
  @scala.inline
  def apply(emitSelf: Boolean): EmitSelf = {
    val __obj = js.Dynamic.literal(emitSelf = emitSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitSelf]
  }
  
  @scala.inline
  implicit class EmitSelfOps[Self <: EmitSelf] (val x: Self) extends AnyVal {
    
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
    def setEmitSelf(value: Boolean): Self = this.set("emitSelf", value.asInstanceOf[js.Any])
  }
}
