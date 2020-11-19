package typingsSlinky.jsNacl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxKeyPair extends js.Object {
  
  var boxPk: js.typedarray.Uint8Array = js.native
  
  var boxSk: js.typedarray.Uint8Array = js.native
}
object BoxKeyPair {
  
  @scala.inline
  def apply(boxPk: js.typedarray.Uint8Array, boxSk: js.typedarray.Uint8Array): BoxKeyPair = {
    val __obj = js.Dynamic.literal(boxPk = boxPk.asInstanceOf[js.Any], boxSk = boxSk.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxKeyPair]
  }
  
  @scala.inline
  implicit class BoxKeyPairOps[Self <: BoxKeyPair] (val x: Self) extends AnyVal {
    
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
    def setBoxPk(value: js.typedarray.Uint8Array): Self = this.set("boxPk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxSk(value: js.typedarray.Uint8Array): Self = this.set("boxSk", value.asInstanceOf[js.Any])
  }
}
