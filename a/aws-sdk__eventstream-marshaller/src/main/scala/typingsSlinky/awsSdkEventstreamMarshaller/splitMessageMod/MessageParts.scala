package typingsSlinky.awsSdkEventstreamMarshaller.splitMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageParts extends js.Object {
  
  var body: js.typedarray.Uint8Array = js.native
  
  var headers: js.typedarray.DataView = js.native
}
object MessageParts {
  
  @scala.inline
  def apply(body: js.typedarray.Uint8Array, headers: js.typedarray.DataView): MessageParts = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageParts]
  }
  
  @scala.inline
  implicit class MessagePartsOps[Self <: MessageParts] (val x: Self) extends AnyVal {
    
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
    def setBody(value: js.typedarray.Uint8Array): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.typedarray.DataView): Self = this.set("headers", value.asInstanceOf[js.Any])
  }
}
