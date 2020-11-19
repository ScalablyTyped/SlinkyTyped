package typingsSlinky.ntlmClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buffer extends js.Object {
  
  var buffer: typingsSlinky.node.Buffer = js.native
  
  var parsed: DNS = js.native
}
object Buffer {
  
  @scala.inline
  def apply(buffer: typingsSlinky.node.Buffer, parsed: DNS): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  @scala.inline
  implicit class BufferOps[Self <: Buffer] (val x: Self) extends AnyVal {
    
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
    def setBuffer(value: typingsSlinky.node.Buffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsed(value: DNS): Self = this.set("parsed", value.asInstanceOf[js.Any])
  }
}
