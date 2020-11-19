package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageTag extends js.Object {
  
  var message: js.typedarray.Uint8Array = js.native
  
  var tag: Double = js.native
}
object MessageTag {
  
  @scala.inline
  def apply(message: js.typedarray.Uint8Array, tag: Double): MessageTag = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageTag]
  }
  
  @scala.inline
  implicit class MessageTagOps[Self <: MessageTag] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: js.typedarray.Uint8Array): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Double): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
